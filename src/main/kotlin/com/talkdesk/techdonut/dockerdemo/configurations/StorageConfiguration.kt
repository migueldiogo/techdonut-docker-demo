package com.talkdesk.techdonut.dockerdemo.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.serializer.StringRedisSerializer




@Configuration
class StorageConfiguration {
  @Bean
  fun jedisConnectionFactory(): JedisConnectionFactory? {
    return JedisConnectionFactory()
  }

  @Bean
  fun redisTemplate(): RedisTemplate<String?, Any?>? {
    val template: RedisTemplate<String?, Any?> = RedisTemplate()
    template.setConnectionFactory(JedisConnectionFactory())
    return template
  }
}
