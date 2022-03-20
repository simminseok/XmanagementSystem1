import java.util.Scanner;

public class FavoriteRestaurantManagementSystem {

    public static void main(String[] args) {
	int num = 0;
	Scanner input = new Scanner(System.in);
		
	while (num != 6) {
	    System.out.println("!! Student Management System Menu !!");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Delete Restaurant");
            System.out.println("3. Edit Restaurant");
            System.out.println("4. View Restaurant");
            System.out.println("5. Show a menu");
            System.out.println("6. Exit");
            System.out.println("Select one number between 1-6:");
            num = input.nextInt();
            
            if (num == 1) {
                AddRestaurant();
            }
            else if (num == 2) {
            	DeleteRestaurant();
            }
            else if (num == 3) {
            	EditRestaurant();
            }
            else if (num == 4) {
            	VeiwRestaurant();
            }	
            else { 
            	continue;
            }
	}
    }
	
    public static void AddRestaurant() {
        Scanner input = new Scanner(System.in);
	System.out.print("Restaurant Name: ");
	String R_Name = input.nextLine();
        System.out.print("Restaurant Address: ");
        String R_Address = input.nextLine();
        System.out.print("Phone Number: ");
        int R_Number = input.nextInt();
    }
	
    public static void DeleteRestaurant() {
	Scanner input = new Scanner(System.in);
	System.out.print("Restaurant Name: ");
	String R_Name = input.nextLine();
    }
	
    public static void EditRestaurant() {
	Scanner input = new Scanner(System.in);
	System.out.print("Restaurant Name: ");
	String R_Name = input.nextLine();
    }
	
    public static void VeiwRestaurant() {
	Scanner input = new Scanner(System.in);
	System.out.print("Restaurant Name: ");
	String R_Name = input.nextLine();
    }
}
