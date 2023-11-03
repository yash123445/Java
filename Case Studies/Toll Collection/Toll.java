import java.util.Scanner;

public class Toll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int choice = 0;
		do {
			System.out.println("1. Calculate Toll For Two Wheeler");
			System.out.println("2. Calculate Toll For Three Wheeler");
			System.out.println("3. Calculate Toll For Four Wheeler");
			System.out.println("4. Calculate Toll For Heavy Vehicle");
			System.out.println("5. Exit...! ");
			
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter No. of Persons: ");
				n = sc.nextInt();
				TwoWheeler a1 = new TwoWheeler(n);
				double toll = a1.calToll();
				System.out.println("Total toll is: "+ toll);
				break;
			case 2:
				System.out.println("Enter No. of Persons: ");
				n = sc.nextInt();
				ThreeWheeler a2 = new ThreeWheeler(n);
				double toll2 = a2.calToll();
				System.out.println("Total toll is: "+ toll2);
				break;
			case 3:
				System.out.println("Enter No. of persons: ");
				n = sc.nextInt();
				FourWheeler a3 = new FourWheeler(n);
				double toll3 = a3.calToll();
				System.out.println("Total Toll is: "+ toll3);
				break;
			case 4:
				System.out.println("Enter No. of Persons: ");
				n = sc.nextInt();
				HeavyVehicle a4 = new HeavyVehicle(n);
				double toll4 = a4.calToll();
				System.out.println("Total Toll is: "+toll4);
				break;
			case 5:
				System.out.println("Exiting Thank You :) ");
				break;
			default:
				System.out.println("Invalid Choice...!");
			}
		}while(choice != 5);
	}

}
