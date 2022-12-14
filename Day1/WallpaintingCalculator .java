import java.util.Scanner;
public class WallpaintingCalculator {

	public static void main(String[] args) {
		
		int length,width,no_of_Doors,no_of_windows;
		double height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length :");
		length = sc.nextInt();
		System.out.println("Enter the width :");
		width = sc.nextInt();
		System.out.println(" Enter no of Doors :");
		no_of_Doors=sc.nextInt();
		System.out.println(" Enter no of Windows :");
		no_of_windows = sc.nextInt();
		System.out.println(" Enter the height :");
		height = sc.nextFloat();
		double TotalSurfaceArea=2*(length * width + length* height + width * height );
		System.out.println("TotalsurfaceArea is :"+TotalSurfaceArea);
		int AreaOfFloor = length*width;
		int AreaOfDoors= 20 * no_of_Doors;
		int AreaOfWindows=15 * no_of_windows;
		double totalPaintArea = TotalSurfaceArea - 
				AreaOfFloor-AreaOfDoors-AreaOfWindows;
		
		
		
		
		
	

	}

}
