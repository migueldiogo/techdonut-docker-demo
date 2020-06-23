package com.talkdesk.techdonut.dockerdemo.repositories

import com.talkdesk.techdonut.dockerdemo.models.Talkdesker

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface TalkdeskerRepository : CrudRepository<Talkdesker, String>