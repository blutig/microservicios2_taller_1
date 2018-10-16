FROM mysql:5.7.23
EXPOSE 3306

RUN mkdir -p /run/secrets
COPY --chown=mysql ./createDB.sql /docker-entrypoint-initdb.d/createDB.sql
COPY --chown=mysql ./db_password.txt /run/secrets/db_password
RUN chmod -R 775 /docker-entrypoint-initdb.d \
	&& chmod -R 775 /run/secrets \
	&& chown -R mysql:mysql /run/secrets
