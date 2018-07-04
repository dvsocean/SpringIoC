package init;

import implementation.OptimusImpl;

public class LaunchPad {

    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-cp.xml");
//
//        AutobotImpl auto = (AutobotImpl) ctx.getBean("autobot");
//
//        System.out.println("autobot name thru bean is: " + auto.getAutobotName());
//
//        ((ClassPathXmlApplicationContext) ctx).close();

       OptimusImpl op = new OptimusImpl();

        System.out.println("--> " + op.whatIsBumblesName());
        System.out.println("--> " + op.whatIsAutosName());

    }
}
