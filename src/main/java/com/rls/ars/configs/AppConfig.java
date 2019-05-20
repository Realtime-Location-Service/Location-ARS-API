package com.rls.ars.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private String pingServiceUrl;
    private String metadataServiceUrl;

    public String getPingServiceUrl() {
        return pingServiceUrl;
    }

    public void setPingServiceUrl(String pingServiceUrl) {
        this.pingServiceUrl = pingServiceUrl;
    }

    public String getMetadataServiceUrl() {
        return metadataServiceUrl;
    }

    public void setMetadataServiceUrl(String metadataServiceUrl) {
        this.metadataServiceUrl = metadataServiceUrl;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "pingServiceUrl='" + pingServiceUrl + '\'' +
                ", metadataServiceUrl='" + metadataServiceUrl + '\'' +
                '}';
    }
}
