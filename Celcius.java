package temperature;

public class Celcius extends AbstractTemperature {

	public Celcius(String name) {
		super("Celcius");
	}

	@Override
	public void calculate(double arg1) {
		celciusToFahrenheit(arg1);
		celciusToKelvin(arg1);	
	}
	
	private void celciusToFahrenheit(double celcius) {
		double fahrenheit = 0.0;
		fahrenheit = celcius * 1.8 +32;
		System.out.println(celcius+" degrees Celcius is "+ fahrenheit+" degrees Fahrenheit");
	}
	private void celciusToKelvin(double celcius) {
		double kelvin = 0.0;
		kelvin = celcius + 273.15;
		System.out.println(celcius+" degrees Celcius is "+ kelvin+" degrees Kelvin");
	}
}
