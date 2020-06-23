package com.talkdesk.techdonut.dockerdemo.models

import org.springframework.data.redis.core.RedisHash

@RedisHash("Talkdesker")
data class Talkdesker(
    val id: String,
    val name: String,
    val job: String
)
