package br.com.jvm.kafkaconsumer.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicListener {

    @Value("${topic.name.consumer}")
    private String topicName;

    /**
     * KafkaListener: permite a conexão com um tópico para o recebimento de mensagens
     */
    @KafkaListener(topics = "${topic.name.consumer}", groupId = "${topic.groupid}")
    public void consumer(ConsumerRecord<String, String> payload) {
        log.info("Topic: {}", topicName);
        log.info("Key: {}", payload.key());
        log.info("Headers: {}", payload.headers());
        log.info("Partion: {}", payload.partition());
        log.info("Order: {}", payload.value());
    }
}
