package object_This_Contructor;

public class MainDrive2 {

	public static void main(String[] args) {
		
//		사용자 하나를 생성. 박보검 / 1993년 / 010-7894-5612 / true / 10000
		
//		int num;
//		num = 10;
		
		User2 user1 = new User2();
		user1.name = "박보검";
		user1.birthYear = 1993;
		user1.phoneNum = "010-7894-5612";
		user1.gender = true;
		user1.point = 10000;
		
		
		int num = 10;
		
//		다른 사용자 생성. 박보영 / 1990 / 010-5555-6666 / false / 5000
		User2 user2 = new User2("박보영", "010-5555-6666", false, 1990, 5000);
		
		System.out.println(user2.name);
		Book2 book1 = new Book2("드래곤볼", 500, 15);
		
	}
	
}











