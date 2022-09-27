public class MotorVehicle
{
	protected String color;
	protected String model;
  	protected double horsePower;
  	protected int nWheels;
  	protected double speed;
  	protected boolean engineOn;

  	public MotorVehicle(String color, String model, double horsePower, int nWheels){
		this.color = color;
		this.model = model;
	    this.horsePower = horsePower;
	    this.nWheels = nWheels;
    
	    this.speed = 0.0;
	    this.engineOn = false;
  	}

	protected void setColor(String color){
		this.color = color;
	}
  	public String getColor(){
	    return this.color;
  	}

	protected void setModel(String model){
		this.model = model;
	}
  	public String getModel(){
	    return this.model;
  	}
  
  	protected void setHorsePower(double horsePower){
	    this.horsePower = horsePower;
  	}
  	public double getHorsePower(){
    	return this.horsePower;
  	}

	protected void setNWheels(int nWheels){
		this.nWheels = nWheels;
  	}
  	public int getNWheels(){
	    return this.nWheels;
  	}

  	protected void setSpeed(double speed){
    	this.speed = speed;
  	}
  	public double getSpeed(){
    	return this.speed;
  	}
  
  	protected void setEngineOn(boolean engineOn){
    	this.engineOn = engineOn;
  	}
  	public boolean getEngineOn(){
    	return this.engineOn;
	}

	public void startEngine(){
		if(engineOn){
			System.out.println("The engine "+ this.getColor() + " " + this.getModel() + " is already on!");
		}
		else{
			this.setEngineOn(true);
			System.out.println("The engine of "+ this.getColor() + " " + this.getModel() + " has been started");
		}
	}
	public void stopEngine(){
		if(engineOn){
			this.setEngineOn(false);
			System.out.println("The engine of "+ this.getColor() + " " + this.getModel() + " has been stopped");
		}
		else{
			System.out.println("The engine "+ this.getColor() + " " + this.getModel() + " is already off!");
		}
	}
	
}