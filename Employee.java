class Employee {

    String name;
    String department;

   
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }


    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {

    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department); 
        this.teamSize = teamSize;
        this.projectName = projectName;
    }



    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}


public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee("Hemant", "CE");


        Employee e2 = new Manager("Ravi", "HR", 5, "Project Alpha");

       
        System.out.println("Employee Details:");
        e1.displayDetails();

        System.out.println("\nManager Details:");
        e2.displayDetails(); 
    }
}