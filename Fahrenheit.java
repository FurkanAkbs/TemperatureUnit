package temperature;

public class Fahrenheit extends AbstractTemperature {

	public Fahrenheit(String name) {
		super("Fahrenheit");
	}

	@Override
	public void calculate(double arg1) {
		fahrenheitToCelcius(arg1);
	}
	private void fahrenheitToCelcius(double fah) {
		double celcius = 0.0;
		celcius = (fah-32)/1.8;
		System.out.println(fah+" degrees Fahrenheit is "+ celcius+" degrees Celcius");
		
	}
}