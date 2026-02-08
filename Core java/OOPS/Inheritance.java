class User{
	
	String name;
	int userId;
	
	
	public User(String name, int userId) {
		super();
		this.name = name;
		this.userId = userId;
	}

	void login() {
		System.out.println(name + " User logged in");
	}
	
	void logout() {
		System.out.println(name + " User logged out");
	}
	
	void updateProfile() {
		System.out.println(name + "'s" + "Profile updated successfully");
	}
}
 
class Student extends User{
	
	public Student(String name, int userId) {
		super(name, userId);
	}
	
	void courseRegistration(int numberOfCourses) {
		System.out.println(numberOfCourses + " Courses successfully registered");
	}
	void viewGrades() {
		System.out.println("Grades displayed");
	}
	void payFees() {
		System.out.println("Payment successfull");
	}
}

class TeachingStaff extends User{
	
	
	
	public TeachingStaff(String name, int userId) {
		super(name, userId);
	}

	void uploadMarks() {
		System.out.println("Marks uploaded successfully");
	}

	void createAssignments() {
		System.out.println("Assignments created successfully");
	}

	void takeAttendance() {
		System.out.println("Attendance marked successfully");
	}
}

class NonTeachingStaff extends User{
	
	public NonTeachingStaff(String name, int userId) {
		super(name, userId);
	}

	void managePayroll() {
		System.out.println("Payroll updated");
	}

	void approveLeave() {
		System.out.println("Leave approved successfully");
	}

	void maintainRecords() {
		System.out.println("Records updated");
	}
}

public class Inheritance{
	public static void main(String[] args) {

        
        Student student = new Student("Abc", 101);
        //student.login();
        student.courseRegistration(3);
        //student.logout();

        
        TeachingStaff teachingStaff = new TeachingStaff("Dr.Xyz", 011);
        //teachingStaff.login();
        teachingStaff.uploadMarks();
        //teachingStaff.logout();

        
        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Mr.Pqr", 301);
        //nonTeachingStaff.login();
        nonTeachingStaff.approveLeave();
        //nonTeachingStaff.logout();
    }
}