package com.tossplace.ddd.notification.domain

class Notification(
    id: Long = 0,
    val userId: Long,
    val type: Type,
    val title: String = "",
    val contents: String = "",
) {
    var id: Long = id
        private set

    enum class Type {
        LIKE,
        COMMENT,
        REPLY_COMMENT,
    }
}
