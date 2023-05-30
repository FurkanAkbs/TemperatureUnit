package temperature;

import java.util.Scanner;
public class Test {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		TemperatureCalculator calculator1 = new CalculatorTFX(3);
		calculator1.addTemperature(new Celcius("Celcius"));
		calculator1.addTemperature(new Fahrenheit("Fahrenheit"));
		calculator1.addTemperature(new Kelvin("Kelvin"));
		startCalculator(calculator1);
		
	}
	
	private static void startCalculator(TemperatureCalculator temperature) {
	System.out.println("Welcome to the temperature unit conversion calculator.\n");
	temperature.listTemperature();
	System.out.println("Please enter the name of the temperature:");
	String temperatureName = in.next(); 
	if(temperatureName.equalsIgnoreCase("end"))
		System.exit(0);
	System.out.println("Please enter the argument of the temperature:");
	double temperatureArg = in.nextDouble(); 
	 temperature.doCalculation(temperatureName, temperatureArg);
	startCalculator(temperature);
}
}

