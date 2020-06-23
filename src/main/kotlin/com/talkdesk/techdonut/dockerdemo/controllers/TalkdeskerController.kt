package com.talkdesk.techdonut.dockerdemo.controllers;

import com.talkdesk.techdonut.dockerdemo.models.Talkdesker
import com.talkdesk.techdonut.dockerdemo.repositories.TalkdeskerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/talkdeskers")
class TalkdeskerController {

    @Autowired
    private lateinit var repository: TalkdeskerRepository

    @PostMapping
    fun create(@RequestBody talkdesker: Talkdesker): ResponseEntity<Talkdesker> {
        val newStudent = repository.save(talkdesker)
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent)
    }

    @GetMapping
    fun list(): ResponseEntity<Iterable<Talkdesker>> {
        val listOfAllStudents = repository.findAll()
        return ResponseEntity.status(HttpStatus.OK).body(listOfAllStudents)
    }

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): ResponseEntity<Talkdesker> {
        val studentFound = repository.findById(id)

        return if (studentFound.isPresent)
            ResponseEntity.status(HttpStatus.OK).body(studentFound.get())
        else
            ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
    }
}
