package homeworks.practice5;

public class Main {
    public static void main(String[] args) {

        // 4. Create an array of 5 employees
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Maksim Rodionov", "QA Engineer", "maksim.rodionov@mail.ru", "13475934141", 100000, 51);
        employee[1] = new Employee("Fedor Frolov", "Product Manager", "fedor_frolov@yandex.ru", "89092992400", 130000, 40);
        employee[2] = new Employee("Diana Kirilova", "UX/UI Designer", "kirilova.d@gmail.com", "89039031313", 110000, 26);
        employee[3] = new Employee("Vasilisa Vasilyeva", "Software Engineer", "vasilisa.vasilyeva@rambler.ru", "89051234567", 140000, 41);
        employee[4] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);

        // 3. Print info about employees into the console
        employee[0].printInfo();
        employee[1].printInfo();
        employee[2].printInfo();
        employee[3].printInfo();
        employee[4].printInfo();

        // 5. 
        System.out.println("\nPrint info about employees older than 40 y.o.");
        for (Employee emp : employee) {
            if (emp.getAge() >= 40) {
                emp.printInfo();
            }
        }








    }


}
