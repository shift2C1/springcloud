package com.cishi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipKinServer {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinServer.class,args);
    }
}
