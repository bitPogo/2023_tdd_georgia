/*
 * Copyright (c) 2023 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tdd.georgia.pixalb.client

import tech.antibytes.util.test.fulfils
import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.test.Test

class ClientApiTest {

    @Test
    @JsName("fnß")
    fun `ClientApi fulfils ClientApiContract`() {
        val client = ClientApi()

        client fulfils ClientApiContract::class
    }

    @Test
    @JsName("test")
    fun `ClientApi getImages return type`() {
        val client = ClientApi()

        val images = client.getImages()

        images mustBe emptyList()
    }
}