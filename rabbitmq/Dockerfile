FROM rabbitmq:3.8.3

ADD enabled_plugins /etc/rabbitmq/
ADD rabbitmq.config /etc/rabbitmq/
ADD definitions.json /etc/rabbitmq/

RUN chown rabbitmq:rabbitmq /etc/rabbitmq/enabled_plugins /etc/rabbitmq/rabbitmq.config /etc/rabbitmq/definitions.json
