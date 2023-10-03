/*
 * Copyright (c) 2023 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tdd.georgia.pixalb.client

internal class ClientApi : ClientApiContract{
    override fun getImages(): List<Placeholder> {
        return emptyList()
    }
}
