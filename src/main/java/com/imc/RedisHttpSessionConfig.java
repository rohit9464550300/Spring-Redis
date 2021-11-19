package com.imc;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

@EnableRedisHttpSession
public class RedisHttpSessionConfig extends AbstractHttpSessionApplicationInitializer {

//    @Bean
//    public LettuceConnectionFactory connectionFactory() {
//        RedisStandaloneConfiguration standaloneConfig = new RedisStandaloneConfiguration("182.43.172.163", 6379);
//        return new LettuceConnectionFactory(standaloneConfig);
//    }

    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }
}
