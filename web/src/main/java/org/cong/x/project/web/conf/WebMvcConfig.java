package org.cong.x.project.web.conf;

import org.cong.x.project.web.interceptor.TimeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by liaojuncong on 05/10/2016.
 */
@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter {

    @Bean
    public TimeInterceptor timeInterceptor() {
        return new TimeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor());
    }
}
