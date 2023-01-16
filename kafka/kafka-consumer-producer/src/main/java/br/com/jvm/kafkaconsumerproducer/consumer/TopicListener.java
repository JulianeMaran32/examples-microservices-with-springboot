package br.com.jvm.kafkaconsumerproducer.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Topic Consumer ou Listener
 * KafkaListener: permite a conexão com um tópico para o recebimento de mensagens
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class TopicListener {

    @Value("${topic.name.consumer}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consumer(ConsumerRecord<String, String> payload) {

        log.info("Topic: {}", topicName);
        log.info("Key: {}", payload.key());
        log.info("Headers: {}", payload.headers());
        log.info("Partition: {}", payload.partition());
        log.info("Value: {}", payload.value());

    }

}
