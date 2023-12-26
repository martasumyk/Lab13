package com.task3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyData {
    private String domain;
    private String description;
    private String logo;
    private String address;
}
