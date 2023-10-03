package tdd.georgia.pixalb.client

data class Placeholder(val imgUrl: String)

interface ClientApiContract {
    fun getImages(): List<Placeholder>
}

fun interface ClientApiFactoryContract {
    fun create(apiKey: String): ClientApiContract
}