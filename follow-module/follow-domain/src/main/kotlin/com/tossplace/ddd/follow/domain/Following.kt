package com.tossplace.ddd.follow.domain

import java.time.Instant

class Following(
    id: Long = 0,
    followerId: Long,
    followeeId: Long,
    createdAt: Instant = Instant.now()
) {
    var id: Long = id
        private set

    var followerId: Long = followerId
        private set

    var followeeId: Long = followeeId
        private set

    var createdAt: Instant = createdAt
        private set
}