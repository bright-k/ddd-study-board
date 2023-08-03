package com.tossplace.ddd.user.domain

import com.tossplace.ddd.shared.domain.AggregateRoot

class User(
    id: Long = 0,
    email: Email,
    password: Password,
    name: String,
    nickname: Nickname,
    profileImage: ProfileImage,
) : AggregateRoot() {
    var id: Long = id
        private set

    var email: Email = email
        private set

    var password: Password = password
        private set

    var name: String = name
        private set

    var nickname: Nickname = nickname
        private set

    var profileImage: ProfileImage = profileImage
        private set
}