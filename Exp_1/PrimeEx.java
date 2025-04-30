// import java.util.Scanner;

// public class PrimeEx {
//        public static void main(String[] args){
//               Scanner sc= new Scanner(System.in);

//               System.out.println("Enter number to check prime or not: ");
//               int num=sc.nextInt();

//               for(int i=1; i<num; i++){
//                      if(num%i==0){
//                             System.out.println("Number is not prime!!");
//                      }
//                      else{
//                             System.out.println("Number is Prime!!");
//                      }

//               }

//        }
       
       
// }

import java.util.Scanner;

public class PrimeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check if it's prime or not: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Number is not prime!!");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.println("Number is Prime!!");
            } else {
                System.out.println("Number is not prime!!");
            }
        }

        sc.close(); 
    }
}

