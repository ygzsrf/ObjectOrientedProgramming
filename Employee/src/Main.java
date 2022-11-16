import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void allEmployees(){
        Scanner sc = new Scanner(System.in);

        List<Employee> Employees = new ArrayList<>();

        EmployeeInfo newEmp = new EmployeeInfo(Employees);

        System.out.print("\n");
        Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
        Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
        Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
        Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
        Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
        Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
        Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

        newEmp.listEmployeeInfo(true); // lists all the employees
    } //done

    static void searchID(){

        Scanner sc = new Scanner(System.in);

        List<Employee> Employees = new ArrayList<>();

        EmployeeInfo newEmp = new EmployeeInfo(Employees);

        int idSearch;

        System.out.print("Please enter the ID of the Employee (1-7): ");
        idSearch = sc.nextInt();

        if (idSearch == 1){
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (idSearch == 2){
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (idSearch == 3){
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (idSearch == 4){
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (idSearch == 5){
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (idSearch == 6){
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (idSearch == 7){
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else{
            System.out.println("We couldn't find the Employee with the ID number " + idSearch);
        }
    }//done

    static void addEmployee() {
        List<Employee> Employees = new ArrayList<>();
        EmployeeInfo newEmp = new EmployeeInfo(Employees);
        String name, gender, title;
        int id, phoneNum, salary;
        Scanner sc = new Scanner(System.in);
        Employee addEmp = new Employee();

        // id, name, title, phoneNum, salary, gender   -> get in this order

        System.out.print("ID: ");
        id = sc.nextInt();
        addEmp.setId(id);

        System.out.print("Name: ");
        name = sc.next();
        addEmp.setName(name);

        System.out.print("Title: ");
        title = sc.next();
        addEmp.setTitle(title);

        System.out.print("Phone Number: ");
        phoneNum = sc.nextInt();
        addEmp.setPhoneNum(phoneNum);

        System.out.print("Salary: ");
        salary = sc.nextInt();
        addEmp.setSalary(salary);

        System.out.print("Gender: ");
        gender = sc.next();
        addEmp.setGender(gender);


        allEmployees();
        Employees.add(new Employee(id, name, title, phoneNum, salary, gender));
        newEmp.listEmployeeInfo(true);

    }//done

    static void removeEmployee(){
        List<Employee> Employees = new ArrayList<>();
        EmployeeInfo newEmp = new EmployeeInfo(Employees);
        String name, gender, title;
        int id, phoneNum, salary;
        Scanner sc = new Scanner(System.in);
        Employee remEmp = new Employee();

        allEmployees();

        System.out.print("\n");

        System.out.print("Please enter the ID of the Employee you want to remove: ");
        int remEmployee = sc.nextInt();

        if (remEmployee == 1){
            System.out.println("\nEmployee with the ID: 1 is removed.");
            System.out.println("");
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

            newEmp.listEmployeeInfo(true);
        }
        else if (remEmployee == 2){
            System.out.println("\nEmployee with the ID: 2 is removed.");
            System.out.println("");
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

            newEmp.listEmployeeInfo(true);
        }
        else if (remEmployee == 3){
            System.out.println("\nEmployee with the ID: 3 is removed.");
            System.out.println("");
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

            newEmp.listEmployeeInfo(true);
        }
        else if (remEmployee == 4){
            System.out.println("\nEmployee with the ID: 4 is removed.");
            System.out.println("");
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

            newEmp.listEmployeeInfo(true);
        }
        else if (remEmployee == 5){
            System.out.println("\nEmployee with the ID: 5 is removed.");
            System.out.println("");
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

            newEmp.listEmployeeInfo(true);
        }
        else if (remEmployee == 6){
            System.out.println("\nEmployee with the ID: 6 is removed.");
            System.out.println("");
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, 16800, "Male"));

            newEmp.listEmployeeInfo(true);
        }
        else if (remEmployee == 7){
            System.out.println("\nEmployee with the ID: 7 is removed.");
            System.out.println("");
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, 10500, "Male"));
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, 12300, "Male"));
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, 17500, "Female"));
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, 11000, "Female"));
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, 25000, "Male"));
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, 8500, "Female"));

            newEmp.listEmployeeInfo(true);
        }
        else{
            System.out.println("There is no Employee with ID: " + remEmployee);
        }
    }//done

    static void addSalary(){
        Scanner sc = new Scanner(System.in);

        List<Employee> Employees = new ArrayList<>();

        EmployeeInfo newEmp = new EmployeeInfo(Employees);

        System.out.print("To increase the salary please enter the ID of the Employee: ");
        int addToId = sc.nextInt();

        if (addToId == 1) {
            System.out.println("\nID: 1" + "  Name: John" + "  Title: Software Developer" + "  Phone Number: 70724109" + "  Salary: 10500" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);

        }
        else if (addToId == 2){
            System.out.println("\nID: 2" + "  Name: Frank" + "  Title: Sr. Key Manager" + "  Phone Number: 71839203" + "  Salary: 12300" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 3){
            System.out.println("\nID: 3" + "  Name: Elizabeth" + "  Title: Sales Manager" + "  Phone Number: 74093293" + "  Salary: 17500" + "  Gender: Female");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, newSalaryAmount, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 4){
            System.out.println("\nID: 4" + "  Name: Jessica" + "  Title: Front End Developer" + "  Phone Number: 70938017" + "  Salary: 11000" + "  Gender: Female");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, newSalaryAmount, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 5){
            System.out.println("\nID: 5" + "  Name: Felix" + "  Title: Data Analyst" + "  Phone Number: 72666093" + "  Salary: 25000" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 6){
            System.out.println("\nID: 6" + "  Name: Alina" + "  Title: Jr. Software Developer" + "  Phone Number: 74093293" + "  Salary: 8500" + "  Gender: Female");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, newSalaryAmount, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 7){
            System.out.println("\nID: 7" + "  Name: Alex" + "  Title: PHP Expert" + "  Phone Number: 79083124" + "  Salary: 16800" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else{
            System.out.println("There is no user found with the ID: " + addToId);
        }
    }//done

    static void removeSalary(){
        Scanner sc = new Scanner(System.in);

        List<Employee> Employees = new ArrayList<>();

        EmployeeInfo newEmp = new EmployeeInfo(Employees);

        System.out.print("To decrease the salary please enter the ID of the Employee: ");
        int addToId = sc.nextInt();

        if (addToId == 1) {
            System.out.println("\nID: 1" + "  Name: John" + "  Title: Software Developer" + "  Phone Number: 70724109" + "  Salary: 10500" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(1, "John", "Software Developer", 70724109, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);

        }
        else if (addToId == 2){
            System.out.println("\nID: 2" + "  Name: Frank" + "  Title: Sr. Key Manager" + "  Phone Number: 71839203" + "  Salary: 12300" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(2, "Frank", "Sr. Key Manager", 71839203, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 3){
            System.out.println("\nID: 3" + "  Name: Elizabeth" + "  Title: Sales Manager" + "  Phone Number: 74093293" + "  Salary: 17500" + "  Gender: Female");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(3, "Elizabeth", "Sales Manager", 74093293, newSalaryAmount, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 4){
            System.out.println("\nID: 4" + "  Name: Jessica" + "  Title: Front End Developer" + "  Phone Number: 70938017" + "  Salary: 11000" + "  Gender: Female");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(4, "Jessica", "Front End Developer", 70938017, newSalaryAmount, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 5){
            System.out.println("\nID: 5" + "  Name: Felix" + "  Title: Data Analyst" + "  Phone Number: 72666093" + "  Salary: 25000" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(5, "Felix", "Data Analyst", 72666093, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 6){
            System.out.println("\nID: 6" + "  Name: Alina" + "  Title: Jr. Software Developer" + "  Phone Number: 74093293" + "  Salary: 8500" + "  Gender: Female");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(6, "Alina", "Jr. Software Developer", 74093293, newSalaryAmount, "Female"));
            newEmp.listEmployeeInfo(true);
        }
        else if (addToId == 7){
            System.out.println("\nID: 7" + "  Name: Alex" + "  Title: PHP Expert" + "  Phone Number: 79083124" + "  Salary: 16800" + "  Gender: Male");
            System.out.print("Please enter the amount: ");
            int newSalaryAmount = sc.nextInt();
            Employees.add(new Employee(7, "Alex", "PHP Expert", 79083124, newSalaryAmount, "Male"));
            newEmp.listEmployeeInfo(true);
        }
        else{
            System.out.println("There is no user found with the ID: " + addToId);
        }
    }//done

    public static void main(String[] args) {

        //allEmployees(); // shows all employees

        //searchID(); // show an employee by id

        //addEmployee(); // add an Employee with all of its information

        //removeEmployee(); // remove an Employee

        //addSalary(); // increase the salary of an Employee with its ID number

        //removeSalary(); // decrease the salary of an Employee with its ID number
        
        Scanner sc = new Scanner(System.in);

        List<Employee> Employees = new ArrayList<>();

        Employee empInf = new Employee();
        EmployeeInfo newEmp = new EmployeeInfo(Employees);

        System.out.println(" ♪ ♫ Welcome to the Company ♫ ♪");
        System.out.println("1. Show all the Employees");
        System.out.println("2. Search an Employee by ID");
        System.out.println("3. Add an Employee");
        System.out.println("4. Remove an Employee");
        System.out.println("5. Increase salary to an Employee by ID");
        System.out.println("6. Decrease salary to an Employee by ID");
        System.out.print("Please choose: ");
        int operation = sc.nextInt();

        if (operation == 1){
            allEmployees();
        }
        else if (operation == 2){
            searchID();
        }
        else if (operation == 3){
            addEmployee();
        }
        else if (operation == 4){
            removeEmployee();
        }
        else if (operation == 5){
            addSalary();
        }
        else if (operation == 6){
            removeSalary();
        }
        else{
            System.out.println("Please try again!\n");
        }
    }
}