package temperature;

public class Kelvin extends AbstractTemperature{

	public Kelvin(String name) {
		super("Kelvin");
	}
	
	@Override
	public void calculate(double arg1) {
		kelvinToCelcius(arg1);
	}
	private void kelvinToCelcius(double kelvin) {
		double celcius =0.0;
		celcius = (kelvin -273.15);
		System.out.println(kelvin+" degrees Kelvin is "+ celcius+" degrees Celcius");
	}
	
}
