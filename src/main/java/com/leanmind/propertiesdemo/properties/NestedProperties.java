package com.leanmind.propertiesdemo.properties;

import java.util.List;
import java.util.Map;

public record NestedProperties(
        String property,
        List<String> nestedList,
        Map<String, String> nestedMap
) {}
