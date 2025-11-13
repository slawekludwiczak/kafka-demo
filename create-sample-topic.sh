docker exec kafka sh ./opt/bitnami/kafka/bin/kafka-topics.sh --create -topic sampleTopic --bootstrap-server localhost:9092 --partitions 2
