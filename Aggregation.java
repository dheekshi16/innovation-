class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

class Department {
    private String departmentName;
    private Employee[] employees;
    private int employeeCount;

    public Department(String departmentName, int maxEmployees) {
        this.departmentName = departmentName;
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
        } else {
            System.out.println("Cannot add more employees. The department is full.");
        }
    }

    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployeeDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101);
        Employee emp2 = new Employee("Jane Smith", 102);
        Employee emp3 = new Employee("Mark Johnson", 103);

        Department department = new Department("Human Resources", 3);

        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        department.displayDepartmentDetails();
    }
}
