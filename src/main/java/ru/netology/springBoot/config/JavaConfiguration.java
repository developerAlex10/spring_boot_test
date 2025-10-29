package ru.netology.springBoot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springBoot.systemProfile.DevProfile;
import ru.netology.springBoot.systemProfile.ProdProfile;
import ru.netology.springBoot.systemProfile.SystemProfile;

@Configuration
public class JavaConfiguration {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProdProfile();
    }
}