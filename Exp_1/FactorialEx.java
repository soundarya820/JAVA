import java.util.Scanner;

public class FactorialEx{
       public static void main(String[] args){
              Scanner sc= new Scanner(System.in);

              System.out.println("Enter a number.");
              int num = sc.nextInt();

              if(num<0){
                     System.out.println("Enter positive Number..");
              }
              else{
                     int fact =1;
                     for(int i=1 ; i<num ; i++){
                            fact*= i;
                     }
                     System.out.println("Factorial of "+num+ "is" +fact);
              }
              sc.close();
       }
}