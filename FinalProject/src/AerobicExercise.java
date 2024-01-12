
public class AerobicExercise extends Sports {
	private int intensity;

    public AerobicExercise(String name, double duration, int environment, int intensity) {
        super(name, duration, environment);
        this.intensity = intensity;
        setMet(met);
    }


	public int getIntensity() {
        return intensity;
    }

    public double calculateCalories(double weight) {
        return weight * getDuration() * getMet() / 60;
    }


	public void checkTarget(double weight, double target) {
        double burnedCalories = calculateCalories(weight);
        if (burnedCalories >= target) {
            System.out.println("Congratulations! You have reached your target calories burned!");
        } else {
            System.out.println("Remaining calories to be burned: " + (target - burnedCalories));
        }
    }
}
