public class TestMotorVehicle
{
	public static void main(String[] args){
		
		MotorVehicle motorcycle = new MotorVehicle("black","XTZ", 10, 2);
		MotorVehicle car = new MotorVehicle("white","Civic",160,4);

		motorcycle.startEngine();
		car.startEngine();
		
		System.out.println("");
		
		System.out.println(car.getModel() + " is " + car.getColor() + ", has " + car.getNWheels() + " wheels and " + car.getHorsePower() + " HP.");
		System.out.println(motorcycle.getModel() + " is " + motorcycle.getColor() + ", has " + motorcycle.getNWheels() + " wheels and " + motorcycle.getHorsePower() + " HP.");
		
	}
}
