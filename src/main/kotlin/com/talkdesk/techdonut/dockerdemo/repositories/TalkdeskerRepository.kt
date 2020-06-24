package com.talkdesk.techdonut.dockerdemo.repositories

import com.talkdesk.techdonut.dockerdemo.models.Talkdesker
import org.springframework.data.mongodb.repository.MongoRepository

import org.springframework.stereotype.Repository


@Repository
interface TalkdeskerRepository : MongoRepository<Talkdesker, String>