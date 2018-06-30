package implementation;

import service.BusinessService;

import java.util.Random;

public class BusinessServiceImpl implements BusinessService {

    public String organizationWord(String companyName) {
        Random rand = new Random();
        String service = "We at " + companyName + " are a multi" +
                " client company generating over, " + rand.nextInt(revenue) +
                " dollars every day";
        return service;
    }
}
