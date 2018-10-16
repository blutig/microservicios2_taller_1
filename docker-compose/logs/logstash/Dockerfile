FROM logstash:5.6.12-alpine
EXPOSE 5000/tcp 5000/udp
COPY --chown=logstash conf/logstash.conf /home/app/logstash/conf/logstash.conf
CMD ["logstash", "-f", "/home/app/logstash.conf"]
