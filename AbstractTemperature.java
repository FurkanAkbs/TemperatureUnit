package temperature;

public abstract class AbstractTemperature implements Temperature {
	String name;
	public AbstractTemperature(String name){
		this.name = name;
	}
	public final String getName() {
		return name;
	}
	
}
