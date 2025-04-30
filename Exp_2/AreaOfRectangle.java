import java.util.Scanner;

class Area{
       double len;
       double wid;

       public void setDim(double len, double wid){
              this.len = len;
              this.wid = wid;
       }
       public double getArea(){
              System.out.println(len*wid);
              return len;
       }
}

public class AreaOfRectangle{
       public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              Area a = new Area();

              //taking input
              System.out.println("Enter length of rectangle: ");
              double len = sc.nextDouble();

              System.out.println("Enter width of the rectangle: ");
              double wid = sc.nextDouble();

              a.setDim(len,wid);

              double area = a.getArea();
              System.out.println("The area of rectangle is : " + area);

              sc. close ();
       }
}