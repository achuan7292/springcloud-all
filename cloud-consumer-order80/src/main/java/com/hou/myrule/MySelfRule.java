package com.hou.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 9:13
 * @Version 1.0
 */
//不能放在@conmponentScan注解扫描包及子包下，spring启动类注解含有
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
