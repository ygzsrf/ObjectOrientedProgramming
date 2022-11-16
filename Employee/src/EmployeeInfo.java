import java.util.List;
import java.util.Scanner;

public class EmployeeInfo {

    Scanner sc = new Scanner(System.in);

    private List<Employee> empInfo;

    public EmployeeInfo(){

    }
    public EmployeeInfo(List<Employee> empInfo) {
        this.empInfo = empInfo;
    }

    public List<Employee> getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(List<Employee> empInfo) {
        this.empInfo = empInfo;
    }

    public void listEmployeeInfo(boolean haveEmployee) {
        for (Employee infoEmp : empInfo){
            if(haveEmployee){
                System.out.println("ID: " + infoEmp.getId() +
                        "  Name: " + infoEmp.getName() +
                        "  Title: " + infoEmp.getTitle() +
                        "  Phone Number: " + infoEmp.getPhoneNum() +
                        "  Salary: " + infoEmp.getSalary() +
                        "  Gender: " + infoEmp.getGender());
            }
            else {
                System.out.println("Id: " + infoEmp.getId() +
                        "  Name: " + infoEmp.getName() +
                        "  Title: " + infoEmp.getTitle());
            }
        }

    }// done
}
