docker cp elasticsearch:/usr/share/elasticsearch/config/ssl/elastic-certificates.p12 ./certs
docker cp elasticsearch:/usr/share/elasticsearch/kibana-cert.zip ./certs/

https://localhost:9200/_cat/nodes?v
http://localhost:15672
# Security

* [Getting started with ELK security](https://www.elastic.co/blog/getting-started-with-elasticsearch-security)
* [Prevent server breach](https://www.elastic.co/blog/how-to-prevent-elasticsearch-server-breach-securing-elasticsearch)
https://www.elastic.co/blog/how-to-setup-tls-for-elasticsearch-kibana-logstash-filebeat-with-offline-install-in-linux
