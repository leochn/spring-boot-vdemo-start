package com.vnext.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author leo
 * @version 2018/4/22 14:45
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "vnext.hello")
public class HelloProperies {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
