package com.task3;

public class CompanyInfo {
    private PDLReader pdlReader;
    private WebScrapingChatGPT webScrapingChatGPT;
    private Brandfetch brandfetch;

    public CompanyInformationFacade(String pdlApiKey) {
        this.pdlReader = new PDLReader(pdlApiKey);
        this.webScrapingChatGPT = new WebScrapingChatGPT();
        this.brandfetch = new Brandfetch();
    }

    public CompanyData enrichCompanyInformation(String domain) {
        // Extract information using PDL
        CompanyData pdlData = pdlReader.extractCompanyInformation(domain);

        // Extract information using WebScraping + ChatGPT
        CompanyData webScrapingChatGPTData = webScrapingChatGPT.extractCompanyInformation(domain);

        // Extract information using Brandfetch
        CompanyData brandfetchData = brandfetch.extractCompanyInformation(domain);

        // Merge the data from different sources
        CompanyData mergedData = mergeCompanyData(pdlData, webScrapingChatGPTData, brandfetchData);

        return mergedData;
    }

    private CompanyData mergeCompanyData(CompanyData pdlData, CompanyData webScrapingChatGPTData, CompanyData brandfetchData) {
        // Perform merging logic, for example, prioritize non-null values from different sources
        // You can customize this logic based on your requirements

        // For simplicity, just return the data from PDL if available
        if (pdlData != null) {
            return pdlData;
        }

        // If PDL data is not available, prioritize data from WebScraping + ChatGPT
        if (webScrapingChatGPTData != null) {
            return webScrapingChatGPTData;
        }

        // If neither PDL nor WebScraping + ChatGPT data is available, return data from Brandfetch
        return brandfetchData;
    }
}
