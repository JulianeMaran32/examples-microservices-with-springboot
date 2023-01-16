package br.com.jvm.kafkaproducer.rest;

import br.com.jvm.kafkaproducer.kafka.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final TopicProducer topicProducer;

    @GetMapping(value = "/send")
    public void send() {
        topicProducer.send("Mensagem de teste envaida ao tópico.");
    }
}
