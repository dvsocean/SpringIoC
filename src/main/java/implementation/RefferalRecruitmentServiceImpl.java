package implementation;

import service.RecruitmentService;

import java.util.Random;

public class RefferalRecruitmentServiceImpl implements RecruitmentService {

    public String recruitEmployees(String companyName, String deptName, int numOfRecruitments) {
        Random random = new Random();
        String hiringFacts = "\n" + companyName + "'s " + deptName + " hired " + random.nextInt(numOfRecruitments)
                + " employees which were referred to the company by employees";
        return hiringFacts;
    }
}
