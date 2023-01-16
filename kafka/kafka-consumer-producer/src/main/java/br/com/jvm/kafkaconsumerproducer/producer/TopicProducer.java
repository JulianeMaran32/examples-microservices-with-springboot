package br.com.jvm.kafkaconsumerproducer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    @Value("${topic.name.producer}")

    private String topicName;

    /**
     * KafkaTemplate: Classe que realiza o envio da mensagem para o tópico
     * < String, String > = < topico, tipo-de-informacao >
     */
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("Payload enviado: {}", message);
        kafkaTemplate.send(topicName, message);
    }

}
