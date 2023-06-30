package com.imooc.bilibili.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wjw
 * @version 1.0
 * @date 2020-03-02 10:47
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
    private static final Logger logger = LoggerFactory.getLogger(ExecutorConfig.class);

    @Bean(name = "MyThreadPool")
    public Executor MyThreadPool() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(30);//表示线程池核心线程，正常情况下开启的线程数量。
        executor.setQueueCapacity(500); //配置队列大小
        executor.setMaxPoolSize(50);//当核心线程都在跑任务，还有多余的任务会存到此处。
        executor.setKeepAliveSeconds(60);//非核心线程的超时时长，超长后会被回收。
        executor.setThreadNamePrefix("MyThreadPool-");//配置线程池前缀
        //用来设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setRejectedExecutionHandler((Runnable r, ThreadPoolExecutor exe) -> {
            logger.warn("MyThreadPool-当前任务线程池队列已满!");
        });//配置拒绝策略
        executor.initialize();//初始化线程池。
        return executor;
    }
}