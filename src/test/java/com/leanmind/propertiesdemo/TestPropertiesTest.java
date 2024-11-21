package com.leanmind.propertiesdemo;

import com.leanmind.propertiesdemo.properties.MapNameExampleProperties;
import com.leanmind.propertiesdemo.properties.NestedProperties;
import com.leanmind.propertiesdemo.properties.TestProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
class TestPropertiesTest {

    @Autowired
    private TestProperties testProperties;

    @Autowired
    private MapNameExampleProperties mapNameExampleProperties;

    @Test
    void should_load_basic_properties() {
        assertEquals("aValue", testProperties.myProperty());
        assertEquals("anotherValue", testProperties.anotherProperty());
    }

    @Test
    void should_load_a_list_of_properties() {
        assertEquals(3, testProperties.aListOfProperties().size());
        assertEquals(List.of("value1", "value2", "value3"), testProperties.aListOfProperties());
    }

    @Test
    void should_load_a_map_of_properties() {
        assertEquals(3, testProperties.aMapOfProperties().size());
        assertEquals(Map.of("key1", "value1", "key2", "value2", "key3", "value3"), testProperties.aMapOfProperties());
    }

    @Test
    void should_load_nested_properties() {
        final NestedProperties nestedProperties = testProperties.nestedProperties();
        assertNotNull(nestedProperties);
        assertEquals("aValue", nestedProperties.property());
        assertEquals(3, nestedProperties.nestedList().size());
        assertEquals(List.of("key1","key2","key3"), nestedProperties.nestedMap().keySet().stream().toList());
    }

    @Test
    void should_load_property_with_mapped_name(){
        assertEquals("test", mapNameExampleProperties.getaCoolNamedProperty());
    }
}
