From python:3.8-slim

COPY requirments.txt .

Run set -ex; \
    pip install --no-cache-dir -r requirments.txt

WORKDIR /
COPY wait-for-it.sh wait-for-it.sh

ADD python_producer.py .

CMD ./wait-for-it.sh -s -t 30 $ZOOKEEPER_SERVER -- ./wait-for-it.sh -s -t 30 $KAFKA_SERVERPHARMACIES -- python -u python-producer.py 
