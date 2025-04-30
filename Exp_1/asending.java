import java.util.Arrays;
import java.util.Scanner;
public class asending {
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);

              int[] num = new int[10];
              
              System.out.println("Enter 10 array elememts: ");
              for(int i=0; i<10; i++){
                     num[i]=sc.nextInt();
              }

              Arrays.sort(num);

              System.out.println("Numbers in asending order: ");
              for(int n: num){
                     System.out.println(n+" ");
              }
              sc.close();

       }
}
