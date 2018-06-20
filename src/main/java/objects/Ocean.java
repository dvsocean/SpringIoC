package objects;

public class Ocean {

    private String message;
    private int age;

    public Ocean(){

    }

    public Ocean(String message, int age) {
        this.message = message;
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void organization(){
        String slogan = "YOU R WHAT YOU EAT";
        System.out.println("Corporate slogan: " + slogan);
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "message='" + message + '\'' +
                ", age=" + age +
                '}';
    }
}
