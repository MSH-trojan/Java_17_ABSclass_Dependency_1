package a;

public class Garage {

	private Vehicle v;
	private Car c;
	private Bike b;
	
public Garage(Vehicle v, Car c, Bike b) {
	this.c = c;
	this.v = v;
	this.b = b;
}

public void driveVehicle() {
    v.Drive();
}

public void driveCar() {
    c.Drive();
}

public void rideBike() {
    b.Drive();
    
}}
