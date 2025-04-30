public class EmployeeTest {
       String fname;
       String lname;
       double sal;
   
       // Constructor
       EmployeeTest(String fname, String lname, double sal) {
           this.fname = fname;
           this.lname = lname;
           // Check if salary is positive
           if (sal > 0) {
               this.sal = sal;
           } else {
               this.sal = 0.0;
           }
       }
   
       // Getters and Setters
       public String getFname() {
           return fname;
       }
   
       public void setFname(String fname) {
           this.fname = fname;
       }
   
       public String getLname() {
           return lname;
       }
   
       public void setLname(String lname) {
           this.lname = lname;
       }
   
       public double getSalary() {
           return sal;
       }
   
       public void setSalary(double sal) {
           if (sal > 0) {
               this.sal = sal;
           } else {
               this.sal = 0.0;
           }
       }
   
       // Yearly Salary
       public double getYearlySalary() {
           return sal * 12;
       }
   
       // Give 10% Raise
       public void giveRaise() {
           this.sal *= 1.10;
       }
   }
   
   // Test Class
class Employee {
       public static void main(String[] args) {
           // Creating two Employee objects
           EmployeeTest emp1 = new EmployeeTest("John", "Doe", 30000);
           EmployeeTest emp2 = new EmployeeTest("Jane", "Smith", 40000);
   
           // Display yearly salaries before raise
           System.out.println(emp1.getFname() + " " + emp1.getLname() + " - Yearly Salary: ₹" + emp1.getYearlySalary());
           System.out.println(emp2.getFname() + " " + emp2.getLname() + " - Yearly Salary: ₹" + emp2.getYearlySalary());
   
           // Give 10% raise
           emp1.giveRaise();
           emp2.giveRaise();
   
           // Display yearly salaries after raise
           System.out.println("\nAfter 10% Raise:");
           System.out.println(emp1.getFname() + " " + emp1.getLname() + " - Yearly Salary: ₹" + emp1.getYearlySalary());
           System.out.println(emp2.getFname() + " " + emp2.getLname() + " - Yearly Salary: ₹" + emp2.getYearlySalary());
       }
   }
   