FROM mysql:5.7
EXPOSE 3306
#COPY createDB.sql /docker-entrypoint-initdb.d/
#RUN chmod -R 775 /docker-entrypoint-initdb.d

COPY createDB.sql /var/lib/mysql

#COPY /var/lib/mysql
#RUN /usr/local/bin/docker-entrypoint.sh mysqld --datadir /initialized-db --aria-log-dir-path /initialized-db
