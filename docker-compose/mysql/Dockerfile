FROM mysql:5.7.23
EXPOSE 3306
ENV MYSQL_DATABASE: taller1

COPY ./createDB.sql /docker-entrypoint-initdb.d/createDB.sql
COPY ./db_password.txt /db_password.txt

#ADD createDB.sql /tmp/createDB.sql
#RUN "mysql -u utaller1 --password="ptaller1" taller1 < /tmp/createDB.sql"

#COPY createDB.sql /docker-entrypoint-initdb.d/

RUN chmod -R 775 /docker-entrypoint-initdb.d


#COPY createDB.sql /var/lib/mysql

#COPY /var/lib/mysql
#RUN /usr/local/bin/docker-entrypoint.sh mysqld --datadir /initialized-db --aria-log-dir-path /initialized-db
