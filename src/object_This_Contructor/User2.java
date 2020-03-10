package object_This_Contructor;

public class User2 {
	
//	이름, 연락처, 성별, 생년, 포인트 => 멤버변수
	
	String name;
	String phoneNum;
	boolean gender;
	int birthYear;
	int point;
	
	public User2(String name, String phoneNum, 
			boolean gender, int birthYear, int point) {
		
//		파라미터로 받은 값들을 멤버변수에 대입.
		this.name = name;
		this.phoneNum = phoneNum;
		this.gender = gender;
		this.birthYear = birthYear;
		this.point = point;
		
	}

	public User2() {
		super();
	}
	
	
	

}









