import java.util.Scanner;
class Employee{
    String name;
    int empId,salary;
    Employee(int empId,String name,int salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int empId,salary;
        System.out.println("Enter the employee name:");
        name= sc.nextLine();
        System.out.println("Enter the employee ID:");
        empId= sc.nextInt();
        System.out.println("Enter the employee salary:");
        salary= sc.nextInt();
        Employee emp=new Employee(empId,name,salary);
        emp.display();

    }
}

