package com.maxim.api.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
    public String location = "uploads";
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
