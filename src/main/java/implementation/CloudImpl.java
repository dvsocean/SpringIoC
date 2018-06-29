package implementation;

import interfaces.BusinessService;

import java.util.Random;

public class CloudImpl implements BusinessService {

    public String organizationWord(String companyName) {
        Random rand = new Random();
        String service = "In the cloud, " + companyName + " has been in charge" +
                " of producing stable pipelines and, " + rand.nextInt(revenue) +
                " new builds.";
        return service;
    }
}
