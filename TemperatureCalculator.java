package temperature;

public interface TemperatureCalculator {
	void addTemperature(Temperature temperature);
	void listTemperature();
	void doCalculation(String temperatureName, double arg);
}
