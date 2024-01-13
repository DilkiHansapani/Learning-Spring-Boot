package com.in28minutes.rest.webservices.restfulwebservices06.DynamicFiltering.StaticFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DynamicFilteringController {

    @GetMapping("/dynamic-filtering")
    public MappingJacksonValue filtering(){
        // Create an instance of SomeBean2 with values "val1", "val2", and "val3".
        SomeBean2 someBean = new SomeBean2("val1", "val2", "val3");

        // Create a MappingJacksonValue object and set the SomeBean2 instance as its value.
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);

        // Create a SimpleBeanPropertyFilter to filter out all properties except "value2".
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1","value3");

        // Create a FilterProvider with a SimpleFilterProvider and add the filter with the name "SomeBeanFilter".
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        // Set the filters to the MappingJacksonValue.
        mappingJacksonValue.setFilters(filters);

        // Return the MappingJacksonValue, which will include only the properties defined by the filter.
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public List<SomeBean2> filteringList(){
        return Arrays.asList(new SomeBean2("value1","value2","value3"),new SomeBean2("val1","val2","val3"));
    }
}
