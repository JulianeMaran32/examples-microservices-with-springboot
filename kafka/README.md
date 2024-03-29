# Kafka

- **Kafka**: plataforma distribuída de mensagens e streaming.
- **Producer**: responsável por produzir a mensagem para um tópico específico. Ou seja, as aplicações enviem fluxos de
  dados para tópicos no _cluster_ Kafka.
- **Consumer**: responsável por ler (consumir) as mensagens que o producer enviar para o tópico. Ou seja, permite a
  leitura dos fluxos de dados a partir de tópicos de saída.
- **Topic**: grupo de mensagens categorizadas.
- **Avro**: biblioteca de serialização de dados. Sua utilização serve para economizar espaço e organizar. Ainda, é
  possível utilizar para gerar classes em Java.  
- **Streams**: serve para transformar os fluxos de dados (mensagens) em tópicos de entrada para os de saída.  
- `@EnableKafka`: faz a conexão com o tópico.
- `@KafkaListener`: permite a conexão com um tópico para o recebimento de mensagem.
- `KafkaTemplate<String, String>`: realiza o **envio** de mensagem para os tópicos, o primeiro String se **refere ao
  tópico** e o segundo ao **tipo de informações**.
- A serialização de dados é uma técnica de converter dados em formato texto ou binário. Para realizar a conversão, é
  possível utilizar o Apache Kafka.  


