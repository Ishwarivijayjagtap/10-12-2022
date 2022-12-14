import java.util.Scanner;
public  class AreaOfCircle
 {  
   public static void main(String args[])
   {
     int r,Diameter;
     float circumference;
     float Area;
      
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the radius of circle :");
        r = sc.nextInt();
        Diameter=2*r;
       System.out.println("Diameter of circle is " +Diameter);
        circumference=(float) (2*(Math.PI)*r);
       
      System.out.println( "circumfernce of circle "+circumference);
      Area=(float)(Math.PI)*(r*r);
      System.out.println("Area of circle "+Area);
      sc.close();
      
  }
   
}


