# 指定基础镜像
FROM openjdk:7-jre-slim

# 拷贝项目
# 先要在项目下打包 mvn clean package -Dmaven.test.skip=true
COPY target/app.jar /app.jar

# 设置时区
RUN echo "Asia/Shanghai" > /etc/timezone