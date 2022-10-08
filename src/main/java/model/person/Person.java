package model.person;

public abstract class Person {
    private String name;
    private String age;
    private String address;
    private String emailId;

    public Person(String name, String age, String address, String emailId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
