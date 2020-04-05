import java.util.ArrayList;
import java.util.List;


class Course{
	List<Student> students;

	public Course(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student s){
		this.students.add(s);
	}
}

public class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints;

	//TODO constructor

	public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}


	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public ArrayList<Integer> getLabPoints() {
		return labPoints;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(ArrayList<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public static double getAverage(ArrayList<Integer> labPoints) {
		//TODO
		double avg = 0;
		for (int i=0; i<labPoints.size();i++) avg = avg + labPoints.get(i);
		return avg/labPoints.size();
	}

	public static boolean hasSignature(ArrayList<Integer> labPoints) {
		//TODO
		return labPoints.size()>=8;
	}

	public static void main(String[] args) {
		ArrayList<Integer> labPoints = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		List<Student> studentList = null;


		labPoints.add(5);
		labPoints.add(10);
		labPoints.add(9);
		labPoints.add(4);
		labPoints.add(6);
		//
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(8);
		list.add(9);

		Student student = new Student("171224", "Bojan", "Ristovski", labPoints);
		Course course = new Course(studentList);
		course.addStudent(student);

		double avg = Student.getAverage(labPoints);
		System.out.println(avg);
		boolean b = Student.hasSignature(labPoints);
		System.out.println(b);
	}
}

