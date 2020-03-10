package object_Method_Null;

public class MainDrive1 {

	public static void main(String[] args) {
//		사용자 1 생성	
		User1 user1 = new User1();
		user1.name = "김초딩";
		user1.birthYear = 2010;
		user1.point = 0;
	
//		사용자 2 생성
		User1 user2 = new User1();
		user2.name = "조경진";
		user2.point = 3500;
		user2.birthYear = 1988;
		
//		책 1 생성
		Book1 book1 = new Book1();
		book1.title = "드래곤볼";
		book1.limitAge = 15;
		book1.rentFee = 500;
		
//		김초딩에게 => 드래곤 볼 대여
//		드래곤볼 정보 출력
		
		book1.rentBookToUser(user1);
		book1.printBookInfo();
		
//		조경진에게 => 드래곤볼 대여
//		드래곤볼 정보 출력
		
		book1.rentBookToUser(user2);
		book1.printBookInfo();
		
//		김초딩에게 => 드래곤볼 대여
//		드래곤볼 정보 출력 => 드래곤볼 빌려간사람?
		
		book1.rentBookToUser(user1);
		book1.printBookInfo();
		
		
//		book1이 반납이 들어왔다. => 5일 연체
		book1.returnBook(20);
		
		
	}
	
}
