FROM nginx:1.15.5-alpine
EXPOSE 80 443
COPY nginx.conf /etc/nginx/nginx.conf

RUN apk add openssl --no-cache \
	&& rm -rf /var/cache/apk/* \
	&& mkdir -p /etc/nginx/ssl/
WORKDIR /etc/nginx/ssl/

#rsa:4096
#rsa:2048
RUN openssl req -subj '/CN=localhost' -x509 -nodes -days 365 -newkey rsa:2048 -keyout nginx.key -out nginx.crt
