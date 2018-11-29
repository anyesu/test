package com.example;

import org.apache.catalina.core.AprLifecycleListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.setProtocol("org.apache.coyote.http11.Http11AprProtocol");
        AprLifecycleListener aprLifecycleListener = new AprLifecycleListener();
        aprLifecycleListener.setSSLEngine("off");
        tomcat.addContextLifecycleListeners(aprLifecycleListener);
        return tomcat;
    }
}
