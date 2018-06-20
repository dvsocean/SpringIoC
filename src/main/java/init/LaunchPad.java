package init;

import objects.Ocean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LaunchPad {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
        Ocean o = (Ocean) ctx.getBean("ocean");

        o.organization();

        ((FileSystemXmlApplicationContext) ctx).close();
    }
}
