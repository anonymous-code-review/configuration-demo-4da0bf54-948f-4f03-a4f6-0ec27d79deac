package com.leanmind.propertiesdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "test.map-name-example")
public class MapNameExampleProperties {
    private String aCoolNamedProperty;

    public String getaCoolNamedProperty() {
        return aCoolNamedProperty;
    }

    public void setARandomWeirdName(String aCoolNamedProperty) {
        this.aCoolNamedProperty = aCoolNamedProperty;
    }
}
