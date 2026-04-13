package org.tyy.zxy.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.tyy.zxy.common.JwtInterceptor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private JwtInterceptor jwtInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor)
                .addPathPatterns("/api/**","/**")
                .excludePathPatterns("/api/auth/login", "/api/auth/refresh");
    }
    private static final String LOCAL_DATE_TIME="yyyy-MM-dd HH:mm:ss";
    private static final DateTimeFormatter FORMATTER=DateTimeFormatter.ofPattern(LOCAL_DATE_TIME);
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(LocalDateTime.class,
                (LocalDateTime object, Locale locale)-> FORMATTER.format(object),
                (String text, Locale locale)->LocalDateTime.parse(text, FORMATTER)
        );
    }
}