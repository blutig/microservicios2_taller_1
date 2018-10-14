FROM node:6.14.4-alpine
EXPOSE 3000
RUN apk add --no-cache tini \
	&& mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN npm install apk --save \
	&& npm install \
	&& npm cache clean --force
ENTRYPOINT /sbin/tini -s -- node ./bin/www
