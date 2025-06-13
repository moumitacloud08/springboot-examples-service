package com.spring.profile;

import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "server")
@Setter
@ToString
public class ServerConfiguration {
    private String name;
    private String type;
    private String url;
}
