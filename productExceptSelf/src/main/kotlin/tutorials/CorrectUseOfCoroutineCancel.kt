package tutorials

import kotlinx.coroutines.*
import kotlin.random.Random

class CorrectUseOfCoroutineCancel {
    suspend fun doSomthing() {
        var job CoroutineScope(Dispatchers.Default).lunch {
            var random = Random.nextInt(100000)
            while (random != 50000) {
                random = Random.nextInt(100000)
                ensureActive() // this make sure to close coroutine when job cancel
            }
        }
        delay(500L)
        job.cancel()

    }
}