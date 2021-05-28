package com.xztelecom.bsseteclms;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BssEteClmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BssEteClmsApplication.class, args);
        System.out.println("启动成功：sa-token配置如下：" + SaManager.getConfig());
    }

}