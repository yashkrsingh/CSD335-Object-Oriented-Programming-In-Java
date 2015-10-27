/*  Name		 : Yash Kumar Singh
    Roll Number  	 : 1310110373
    Major		 : Computer Science and Engineering
	Program Title: Implementing Abstract Classes and Interfaces GL3
*/

import java.util.*;
import SNU.geometryUtil.*;

public class ConcentricCircleMain {
	
	public static double ComprehensiveCost(ArrayList<GeometricObject> arr, int position){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cost to color: ");
		double c = input.nextDouble();
		double sum=0;
		
		if(position != -1){
			GeometricObject g1 = arr.get(position);
			if(g1 instanceof Colorable){
				return (((Colorable) g1).costToColor(c));
			}
		}
		if(position == -1){
			for(int i = 0; i < arr.size(); i++){
				GeometricObject g1 = arr.get(i);
				sum = sum + ((Colorable) g1).costToColor(c);
				
			}
			return sum;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ch = 1;
		int i=0;
		ArrayList<GeometricObject> arr = new ArrayList<GeometricObject>();
		do{
			System.out.print("Which object for arr["+i+"] would you like to create: ");
			System.out.print("\n1.Circle");
			System.out.print("\n2.Concentric Circle ");
			int x = input.nextInt();
			switch(x){
			case 1: System.out.println();
					System.out.print("Enter radius: ");
					double r = input.nextDouble();
					try {
						arr.add(new Circle(r));
					} catch (IllegalCircleException e1) {
						e1.printStackTrace();
						return;
					}
					i++;
					break;
			case 2: System.out.println();
					System.out.print("Enter radius 1: ");
					double r1 = input.nextDouble();
					System.out.print("Enter radius 2: ");
					double r2 = input.nextDouble();
					try {
						arr.add(new ConcentricCircle(r1,r2));
					} catch (IllegalConcentricCircleException | IllegalCircleException e1) {
						e1.printStackTrace();
						return;
					}
					i++;
					break;
			}
			
			System.out.print("\nWhat do you want to do next: ");
			System.out.print("\n1.Cost to paint an object");
			System.out.print("\n2.Total cost to paint all the objects");
			System.out.print("\n3.Do nothing "); 
			int y = input.nextInt();
			switch(y){
			case 1: System.out.print("\nWhich object to paint (enter position): ");
					int n = input.nextInt();
					System.out.print("\nCost to paint object 'n': "+ComprehensiveCost(arr, n));
					break;
					
			case 2: System.out.print("\nTotal cost to paint: "+ComprehensiveCost(arr, -1));
					break;
					
			case 3: break;
			}
						
			System.out.print("\nDo you want to add more? (1/0) ");
			ch = input.nextInt();
		}while(ch!=0);

	}
}

