package Jobsheet3.Encap23;

public class EncapDemo23 {
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if(newAge > 30) {
            age = 30;
        }
        else {
            age = newAge;
        }
    }
    
}
