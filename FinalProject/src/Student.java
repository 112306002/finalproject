
class Student {
	private int studentID;
	private String studentName;
	private double weight;
	private double target;
	private String exerciseName;

	public Student(int studentID, String studentName, double weight, double target, String exerciseName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.weight = weight;
		this.target = target;
		this.exerciseName = exerciseName;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return studentName;
	}

	public double getWeight() {
		return weight;
	}

	public double getTarget() {
		return target;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public String getInfo() {
		return "Student ID: " + studentID + ", Name: " + studentName + ", Calories burned: " + Sports.calculateCalories(this.getWeight());
	}
	
}