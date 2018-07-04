package init;

import implementation.OptimusImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchPad {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");

        OptimusImpl op = (OptimusImpl) ctx.getBean("optimus");

        System.out.println("--> " + op.whatIsAutosName());
        System.out.println("--> " + op.whatIsBumblesName());



        ((ClassPathXmlApplicationContext) ctx).close();



    }
}
