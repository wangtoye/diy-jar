package com.wangtoye.worldjarspringbootstarter.configuration;

import com.wangtoye.worldjarspringbootstarter.service.FullService;
import com.wangtoye.worldjarspringbootstarter.service.WorldService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangye
 * @date 2020/4/1
 * @description
 */
@Configuration
public class WorldConfiguration {

    @Value("${world.key1:world}")
    private String word;

    @Bean
    @ConditionalOnMissingBean(WorldService.class)
    public WorldService worldService() {
        WorldService worldService = new WorldService();
        worldService.setWord(word);
        return worldService;
    }

    @Bean
    @ConditionalOnMissingBean(FullService.class)
    public FullService fullService(WorldService worldService) {
        FullService fullService = new FullService();
        fullService.setWorldService(worldService);
        return fullService;
    }
}
