package com.talkdesk.techdonut.dockerdemo.models

import org.springframework.data.annotation.Id

data class Talkdesker(
        @Id val id: String,
        val name: String,
        val job: String
)
