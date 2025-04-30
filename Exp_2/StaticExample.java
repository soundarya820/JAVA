class Test {
       static int number;
   
       static {
           number = 5;
           System.out.println("Static block is called.");
       }
   
       static void showNumber() {
           System.out.println("Number is: " + number);
       }
   }
   
   public class StaticExample {
       public static void main(String[] args) {
           // Call static method without object
           Test.showNumber();
       }
   }
   