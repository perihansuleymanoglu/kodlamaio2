package kodlamaio2;

public class Student extends User{
	
	private String work;
	private String faculty;
	
	public Student() {
		
	}

	public Student(String faculty, String work) {
		super();
		this.faculty = faculty;
		this.work = work;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	
	

}
