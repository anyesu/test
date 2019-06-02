## SpringBoot 测试项目

### 用法
***

* 获取项目
```shell
git clone --depth=1 git://github.com/anyesu/test
```

* 构建项目
```shell
cd test/JetBrains-Docker-Example/Springboot-Example
mvn clean package -Dmaven.test.skip=true
```

* 部署项目
```shell
docker-compose up -d
```

* 访问
```shell
curl http://127.0.0.1:3000
This is a test result.
```
