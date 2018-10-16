FROM mysql:5.7.23
EXPOSE 3306

RUN mkdir -p /run/secrets/
COPY --chown=mysql ./createDB.sql /docker-entrypoint-initdb.d/createDB.sql
COPY --chown=mysql ./db_password.txt /run/secrets/db_password.txt
RUN chmod -R 664 /docker-entrypoint-initdb.d \
	&& chmod -R 664 /run/secrets/
