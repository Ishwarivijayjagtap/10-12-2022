import java.util.Scanner;
public class Temperature
{
  public static void main(String args[])
  {
   float fahreheit;
    float  celcius;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Temperature in celcius :");
   celcius = sc.nextFloat();
     fahreheit =(float)(1.8* celcius+32);
     System.out.println(" Temperature in fahreheit" +fahreheit);
     sc.close();
     }
 }

