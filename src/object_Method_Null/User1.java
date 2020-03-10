package object_Method_Null;

public class User1 {
	
	String name;
	int birthYear;
	int point;
	
//	출력 메소드 => 대부분 void로 처리.
	void printUserInfo() {
		
		System.out.println("=== 사용자 정보 ===");
		System.out.println("이름 : " + name);
//		나이 출력 => 나이 계산 기능 활용.
		System.out.println("나이 : " + this.getUserAgeByYear(2020));
		System.out.println("보유 금액 : " + point);
		
		
	}
	
	int getUserAgeByYear(int year) {
		
		int age = year - birthYear + 1;

		return age;
	}
	
	

}











