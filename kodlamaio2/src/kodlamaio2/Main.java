package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Perihan");
		student.setLastName("Süleymanoğlu");
		student.setFaculty("Mühendislik Fakültesi");
		student.setWork("3.gün ödevi");
		
		Instructor ınstructor = new Instructor();
		ınstructor.setId(2);
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demiroğ");
		
		UserManager userManager = new UserManager();		
		userManager.add(ınstructor);
		userManager.add(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

	}

}
