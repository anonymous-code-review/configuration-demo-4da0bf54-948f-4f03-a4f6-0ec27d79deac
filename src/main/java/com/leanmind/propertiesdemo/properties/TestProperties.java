package com.leanmind.propertiesdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "test")
public record TestProperties(
        String myProperty,
        String anotherProperty,
        List<String> aListOfProperties,
        Map<String, String> aMapOfProperties,
        NestedProperties nestedProperties
) {}
