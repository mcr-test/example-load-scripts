FROM gatling/gatling:latest

COPY user-files /opt/gatling/user-files
COPY docker-entrypoint.sh /opt/gatling/docker-entrypoint.sh

RUN chmod +x /opt/gatling/docker-entrypoint.sh

ENTRYPOINT ["/opt/gatling/docker-entrypoint.sh"]
