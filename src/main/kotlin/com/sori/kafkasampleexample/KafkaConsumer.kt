package com.sori.kafkasampleexample

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.io.IOException


@Service
class KafkaConsumer {
    @KafkaListener(topics = ["test"])
    @Throws(
        IOException::class
    )
    fun consume(message: String?) {
        println(String.format("Consumed : %s", message))
    }
}