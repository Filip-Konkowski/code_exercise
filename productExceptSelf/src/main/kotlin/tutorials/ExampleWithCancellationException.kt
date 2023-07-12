package tutorials

import kotlinx.coroutines.*
import kotlin.coroutines.cancellation.CancellationException

class ExampleWithCancellationException {


    suspend fun riskyTask() {
        try {
            delay(3000L)
            print("The answer is ${10 / 0}") // here exception would be thrown

        } catch (e: Exception) {
            if (e is CancellationException) {
                throw e // here we need to remember to propagate exceptions
            }
            println("Oops, that didn't work")
        }
    }
    fun main() = runBlocking {
        val job = launch {
            try {
                repeat(1000) { i ->
                    println("Working $i...")
                    delay(100)
                    ensureActive() // Check for cancellation
                }
            } catch (e: CancellationException) {
                println("Coroutine was cancelled")
            }
        }

        delay(500) // Delay for some time
        job.cancel() // Cancel the coroutine

        job.join() // Wait for the coroutine to finish
        println("Coroutine completed")
    }
}