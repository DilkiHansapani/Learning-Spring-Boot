package com.in28minutes.BusinessCalculationService;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalService {

    private DataService dataService;

    //Constructor dependency injection
    public BusinessCalService(DataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
