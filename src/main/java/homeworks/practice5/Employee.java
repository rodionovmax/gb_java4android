package homeworks.practice5;

public class Employee {
    private final String lastNameFirstName;
    private final String title;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String lastNameFirstName, String title, String email, String phoneNumber, int salary, int age) {
        this.lastNameFirstName = lastNameFirstName;
        this.title = title;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee: " +
                "lastNameFirstName='" + lastNameFirstName + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age;
    }

    public String getLastNameFirstName() {
        return lastNameFirstName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
