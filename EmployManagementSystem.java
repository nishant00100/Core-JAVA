 class Employee{
    int id;
    String name;
    String department;
    int salary;
    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


}

public class EmployManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[9];

        employees[0] = new Employee(1, "Aman", "cse", 100);
        employees[1] = new Employee(2, "AmanRaj", "cse", 100);
        employees[2] = new Employee(3, "David", "cse", 100);
        employees[3] = new Employee(4, "Robin", "cse", 100);
        employees[4] = new Employee(5, "Amit", "cse", 100);
        employees[5] = new Employee(6, "john", "cse", 100);
        employees[6] = new Employee(7, "Amreshpuri", "cse", 100);
        employees[7] = new Employee(8, "mayank", "cse", 100);
        employees[8] = new Employee(9, "william", "cse", 300);

//        search(employees, "Am");
//        salaryIncreaser(employees, "cse");
//        removeEmployeeById(employees, 7);
//        display(employees);
    }
    public static void search(Employee[] employees, String name){
        for(int i = 0; i < employees.length; i++){
            String empName = employees[i].name;
            String empSSN = empName.substring(0, name.length());
            if(empSSN.equals(name)){
                System.out.println(employees[i].name);
            }
        }
    }

    public static void salaryIncreaser(Employee[] employees, String dept){
        for(int i = 0; i < employees.length; i++){
            if(employees[i].department.equals(dept)){
                employees[i].salary += ((employees[i].salary)*10)/100;
            }
        }
    }

    public static void removeEmployeeById(Employee[] employees, int id){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null && employees[i].id==id){
                employees[i] = null;
            }
        }
    }

    public static void display(Employee[] employees){
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].id + " " + employees[i].name + " salary: " + employees[i].salary + " " +  employees[i].department);
        }
    }
}
