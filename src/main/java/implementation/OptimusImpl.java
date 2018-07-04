package implementation;


public class OptimusImpl {


    public AutobotImpl ab;


    public BumblebeeImpl bb;

    public void setAb(AutobotImpl ab) {
        this.ab = ab;
    }

    public void setBb(BumblebeeImpl bb) {
        this.bb = bb;
    }

    public String whatIsAutosName(){
        return ab.getAutobotName();
    }

    public String whatIsBumblesName(){
        return bb.getName();
    }


}
