# Servlet容器 ( Tomcat 、Jetty 和 Undertow ) 对比测试 

## 使用

* 获取项目
```
git clone --depth=1 git://github.com/anyesu/test
```

* 构建项目
```
cd test/servlet-test
mvn package -Dmaven.test.skip=true
```

* 启动项目
```
mkdir dist
cp servlet-test-*/target/servlet-test-*.jar dist
cd dist
java -Xms2g -Xmx2g -Xmn1g -XX:MaxMetaspaceSize=256m -Xss256k -jar servlet-test-tomcat-8-nio.jar
```

* 访问
```
curl http://127.0.0.1:3000/api/test
This is a test result.
```

## 文档
参考简书：[https://www.jianshu.com/p/f7cb40a8ce22](https://www.jianshu.com/p/f7cb40a8ce22)
