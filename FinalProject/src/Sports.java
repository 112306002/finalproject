
public class Sports {

	private String name;
	private double duration;
	protected double met;
	private int environment;

	public Sports(String name, double duration, int environment) {
		this.name = name;
		this.duration = duration;
		this.met = 3.5;
		this.environment = environment;
	}

	public String getName() {
		return name;
	}

	public double getDuration() {
		return duration;
	}
	
	public int getEnvironment() {
        return environment;
    }

	public void setMet(double met) {
		this.met = met;
	}

	public double calculateCalories(double weight) {
		return weight * duration * met / 60;
	}


}
