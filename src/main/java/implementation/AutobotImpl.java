package implementation;

import service.AutobotService;

public class AutobotImpl implements AutobotService {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutobotName() {
        return name;
    }
}
