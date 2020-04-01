package com.wangtoye.worldjarspringbootstarter.annotation;

import com.wangtoye.worldjarspringbootstarter.configuration.WorldConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author wangtoye
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ImportAutoConfiguration(value = {WorldConfiguration.class})
public @interface EnableWorldJar {
}
