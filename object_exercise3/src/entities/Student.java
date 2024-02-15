package entities;

public class Student {

	private String name;
	private double firstGrade;
	private double secondGrade;
	private double thirdGrade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public double getFinalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}

	public double getMissingPoints() {
		if (this.getFinalGrade() < 60) {
			return 60.0 - this.getFinalGrade();
		} else {
			return 0;
		}
	}
}