package tutorials

import kotlinx.coroutines.*

class GetUserFirstNamesService {

    // use of asynch function to call API and build list of usersNames
    suspend fun getUserFirstName(userIds: List<String>): List<String> {
        val firstNames = mutableListOf<Deferred<String>>()

        coroutineScope {
            for (id in userIds) {
                val firstName = async {
                    getFirstName(id)
                }
                firstNames.add(firstName)
            }
        }

        return firstNames.awaitAll()
    }

    // This imitate API call
    suspend fun getFirstName(userId: String): String {
        delay(1000L)
        return "First Name"
    }
}