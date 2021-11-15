import java.util.ArrayList;

public class Student {
	public long ID;
	public String Name;
	public ArrayList<Integer> grades = new ArrayList<>();

	public Student(long ID, String Name){
		this.ID = ID;
		this.Name = Name;
	}

	public long getId(){
		return this.ID;
	}

	public String getName() {
		return this.Name;
	}

	public void addGrade(int i) {
		this.grades.add(i);
	}

	public ArrayList<Integer> getGrades() {
		return this.grades;
	}

	public double getGradeAverage() {
		double total = 0;
		for (Integer grade : grades){
			total += grade;
		}
		return total/grades.size();
	}

	public ArrayList<Integer> updateGrade(int grade, int newGrade) {
		if (this.grades.contains(grade)){
			this.grades.remove((Integer) grade);
			this.addGrade(newGrade);
		}
		return this.grades;
	}

	public ArrayList<Integer> removeGrade(int grade) {
		if (this.grades.contains(grade)){
			this.grades.remove((Integer) grade);
		}
		return this.grades;
	}
}
