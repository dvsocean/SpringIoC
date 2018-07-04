package implementation;

import org.springframework.beans.factory.annotation.Autowired;

public class OptimusImpl {

    @Autowired
    AutobotImpl ab;

    @Autowired
    BumblebeeImpl bb;

    public String whatIsAutosName(){
        return ab.getAutobotName();
    }

    public String whatIsBumblesName(){
        return bb.getName();
    }


}
