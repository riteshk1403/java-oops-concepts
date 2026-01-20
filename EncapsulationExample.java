class Student {
    private String name;
    private int age;

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void setAge(int age) {
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age must be 18 or above");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ritesh");
        s.setAge(22);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
