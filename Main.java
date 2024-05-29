package main;

public class Main{
	
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		
		Car c1 = new Car();
		
		Bike b1 = new Bike();
		
		Garage garage = new Garage(v1, c1, b1);
		
		
		garage.driveVehicle(); 
		System.out.println();
		
        garage.driveCar();     
        System.out.println();
        
        
        garage.rideBike();
        System.out.println();
	
	}
	
	
}