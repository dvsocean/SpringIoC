package domain;

import org.Organization;
import service.RecruitmentService;

public class HumanResourceDept implements Department {

    private String deptName;
    private RecruitmentService recruitmentService;
    private Organization organization;

    public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
        this.recruitmentService = recruitmentService;
        this.organization = organization;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String hiringStatus(int numberOfRecruitments) {
        return recruitmentService.recruitEmployees(organization.getCompanyName(), deptName, numberOfRecruitments);
    }
}
