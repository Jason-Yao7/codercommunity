package com.imooc;

import com.imooc.bilibili.websocket.WebSocketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Shangchen Yao
 * @date 2023/6/3 14:41
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableAsync
@EnableScheduling
public class ImoocBilibiliApp {
    public static void main(String[] args) {
        /*
         * 指定使用的日志框架，否则将会告警
         * RocketMQLog:WARN No appenders could be found for logger (io.netty.util.internal.InternalThreadLocalMap).
         * RocketMQLog:WARN Please initialize the logger system properly.
         */
        System.setProperty("rocketmq.client.logUseSlf4j", "true");
        ApplicationContext app = SpringApplication.run(ImoocBilibiliApp.class, args);
        WebSocketService.setApplicationContext(app);
    }
}
