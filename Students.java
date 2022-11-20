package week3.day1.OOPS;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student Id and Name: "+id+", "+name);
	}
	public void getStudentInfo(String email,String phoneNumber) {
		System.out.println("Student Email and Phonenumber: "+email+", "+phoneNumber);
	}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(12000456);
		stu.getStudentInfo(12000456,"Saravanan.K");
		stu.getStudentInfo("sk@mail.com","+91 7339080000");
	}
}
