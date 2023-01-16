package br.com.jvm.kafkaconsumerproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaConsumerProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerProducerApplication.class, args);
    }

}
