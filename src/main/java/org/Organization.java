package org;

import interfaces.BusinessService;

public class Organization {

    private int age;
    private String companyName;
    private BusinessService businessService;
    private String slogan;

    public Organization(String companyName, int age) {
        this.companyName = companyName;
        this.age = age;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BusinessService getBusinessService() {
        return businessService;
    }

    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "age=" + age +
                ", companyName='" + companyName + '\'' +
                ", businessService=" + businessService +
                ", slogan='" + slogan + '\'' +
                '}';
    }

    public String corporateService(){
        return businessService.organizationWord(companyName);
    }
}
