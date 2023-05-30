package temperature;

public class CalculatorTFX implements TemperatureCalculator{
	private int temperatureCount;
	private int currentCount = 0;
	
	private Temperature[] temperatures;
	
	public CalculatorTFX(int temperatureCount) {
		this.temperatureCount = temperatureCount;
		temperatures = new Temperature[temperatureCount];
	}
	
	@Override
	public void addTemperature(Temperature temperature) {
		temperatures[currentCount] = temperature;
		currentCount++;
	}

	@Override
	public void listTemperature() {
		System.out.println("Available Temperatures:");
		for (Temperature temperature : temperatures)
			System.out.println(temperature.getName());
		
	}

	@Override
	public void doCalculation(String temperatureName, double arg) {
		boolean isTemperatureFound = false;
		for (Temperature temperature : temperatures) {
			if (temperatureName.equalsIgnoreCase(temperature.getName())) {
				temperature.calculate(arg);
			isTemperatureFound = true;
			}
		}
		if(!isTemperatureFound)
			System.out.println("No such temperature found!");
	}
}
