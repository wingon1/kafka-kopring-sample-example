package com.sori.kafkasampleexample

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin("*")
@RestController
class KafkaSampleController(
    private val kafkaProducer: KafkaProducer
) {
    @PostMapping("/message")
    fun sendMessage(@RequestParam("message") message: String) {
        kafkaProducer.sendMessage(message)
    }
}