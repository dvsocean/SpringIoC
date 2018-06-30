package init;

import domain.HumanResourceDept;
import objects.Ocean;
import org.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchPad {

    public static void main(String[] args) {
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
//        Ocean o = (Ocean) ctx.getBean("ocean");
//
//        o.organization();
//
//        ((FileSystemXmlApplicationContext) ctx).close();

        //Must put bean on classpath aka resources folder
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");

//        Organization o = (Organization) ctx.getBean("ocean");
//
//        System.out.println("Company slogan: " + o.getSlogan());
//
//        System.out.println(o.corporateService());

        HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");

        System.out.println("Result: " + hrdept.hiringStatus(2550));

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
