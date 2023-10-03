package tdd.georgia.pixalb.client

import tech.antibytes.kfixture.kotlinFixture
import tech.antibytes.util.test.fulfils
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertTrue

class ClientFactoryTest {
    private val fixture = kotlinFixture()

    @Test
    @JsName("F0")
    fun `ClientApiFactory fulfils ClientFactoryContract`() {
        val factory = ClientApiFactory()


        factory fulfils ClientApiFactoryContract::class
    }

    @Test
    @JsName("F1")
    fun `ClientFactory creates client`() {
        // Given
        val factory = ClientApiFactory()

        // When
        val client = factory.create("adasda")

        // Then
        client fulfils ClientApiContract::class
    }
}