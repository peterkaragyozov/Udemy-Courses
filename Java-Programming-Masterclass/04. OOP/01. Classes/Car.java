
public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	public boolean radio;
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		String validEngine = engine.toLowerCase();
		if (validEngine.equals("diesel") || validEngine.equals("petrol")) {
			this.engine = validEngine;			
		} else {
			System.out.println("Invalid engine type");
		}
	}
	
	
}
