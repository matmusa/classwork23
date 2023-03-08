public class Person {

    private String name;
    private int age;
    private long phoneNumber ;
    private Gender gender;
    private Role role;

    public Person(String name, int age, long phoneNumber, Gender gender, Role role) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person  :" +
                "\nname :" + name +
                "\n age :" + age +
                "\n phoneNumber :" + phoneNumber +
                "\ngender :" + gender +
                "\n role :" + role
                ;
    }
}
