package com.sori.kafkasampleexample


import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service


@Service
class KafkaProducer(
    private var kafkaTemplate: KafkaTemplate<String, String?>?
) {
    private val topicName: String = "test"
    fun sendMessage(message: String?) {
        println(String.format("Produce : %s", message))
        kafkaTemplate!!.send(topicName!!, message)
    }
}
