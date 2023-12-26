package com.task3;

import lombok.Builder;

@Builder
public class CompanyEnricher {
    public CompanyData enrich(String domain){
        return CompanyData.builder().build();
    }   
}
