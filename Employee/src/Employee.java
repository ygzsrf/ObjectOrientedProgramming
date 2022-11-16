public class Employee {
    private String name, gender, title; // title means position of employee
    private int id, phoneNum, salary;

    // id, name, title, phoneNum, salary, gender
    Employee(){
        id = -1;
        name = "";
        title = "";
        phoneNum = -1;
        salary = -1;
        gender = "";
    }

    Employee(int id, String name, String title, int phoneNum, int salary, String gender){
        this.id = id;
        this.name = name;
        this.title = title;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.gender = gender;
    }


    // Getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
