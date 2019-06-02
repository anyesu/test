FROM nginx

WORKDIR /usr/src/app/

COPY ./nginx.conf.template /etc/nginx/conf.d/default.conf.template

COPY ./dist  /usr/share/nginx/html/

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
