package com.example.consumerdemo.test;

import com.example.consumerdemo.ConsumerDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author: 98050
 * Time: 2018-07-31 21:57
 * Feature:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerDemoApplication.class)
public class LoadBalanceTest {
    @Autowired
    RibbonLoadBalancerClient client;

    @Test
    public void test(){
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = this.client.choose("user-service");
            System.out.println(instance.getHost() + ":" + instance.getPort());
        }
    }
}
