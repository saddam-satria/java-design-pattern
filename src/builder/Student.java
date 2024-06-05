import builder.Gender;

public class Student{
    String name;
    String email;
    int age;
    boolean isActive;
    Gender gender;

    Student(){}

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }
    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public Student isActive(boolean status) {
        this.isActive = status;
        return this;
    }
    public Student setAge(int age) {
        this.age = age;

        return this;
    }
    public Student setGender(Gender gender) {
        this.gender = gender;

        return this;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public Gender getGender() {
        return gender;
    }
}