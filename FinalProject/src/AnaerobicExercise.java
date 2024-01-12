class AnaerobicExercise extends Sports {
	private String type;

	public AnaerobicExercise(String name, double duration, int environment, String type) {
		super(name, duration, environment);
		this.type = type;
		setMet();
	}

	public String getType() {
		return type;
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

	private void setMet() {
		switch (type) {
		case "squat":
			setMet(5.0);
			break;
		case "pullUp":
			setMet(6.2);
			break;
		case "deadlift":
			setMet(8.0);
			break;
		default:
			setMet(4.0); // Default met value for undefined types
		}
	}
}