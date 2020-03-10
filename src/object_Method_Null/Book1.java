package object_Method_Null;

public class Book1 {
	
//	클래스의 고유정보(속성)으로 사용되는 변수 => 멤버 변수.
//	이클립스에서는 기본적으로 멤버변수는 파란색으로 표기.
//	그 외의 일반 변수는 갈색으로 표기. (파라미터도 포함)
	String title;
	int limitAge;
	int rentFee;
	
	User1 rentUser = null; // 빌려간 사람이 아직 없다고 명시.
	
	void printBookInfo() {
		
		System.out.println("=== 도서 정보 ===");
		System.out.println("제목 : " + title);
		System.out.println(limitAge + "세 미만 구독 불가");
		System.out.println("대여료 : " + rentFee);
		
//		빌려간사람이 있는지 없는지 분기처리.
		
		if (rentUser == null) {
			System.out.println("대여자 없음");
		}
		else {
			System.out.println("=== 대여자 정보 ===");
			rentUser.printUserInfo();
		}
		
		
	}
	
	
//	대여기능 추가
//	 => 빌려간 사람의 데이터를 추가. => 데이터 조작. => 보통 void처리.
	
	void rentBookToUser(User1 u) {
		
//		검사 방법 => 안되는 경우 안된다고 메세지.
//		 => 되면 다음 검사로 진행
//		1. 빌려주려는 사람의 나이가 빌릴 수 있는 나이인가? 검사
//		사람나이 >= 책의나이제한인가?
		
		boolean isAgeOk = true;
		if (u.getUserAgeByYear(2020) >= limitAge) {
			isAgeOk = true;
		}
		else {
			System.out.println("나이가 어려서 대여 불가!");
			isAgeOk = false;
		}
		
//		2. 포인트가 충분한가?
//		사용자의 포인트 >= 책의 대여료
		
		boolean isPointOk = true;
		if (u.point >= rentFee) {
			isPointOk = true;
		}
		else {
			isPointOk = false;
			System.out.println("보유 포인트가 부족합니다.");
			System.out.println("포인트를 충전해주세요.");
		}
		
//		3. 이 책을 빌려간 사람이 없어야  OK
//		이 책의 rentUser가 null이면 OK, 아니면 NOT OK
		
		boolean isRentUserOk = true;
		
		if (rentUser == null) {
			isRentUserOk = true;
		}
		else {
			isRentUserOk = false;
			System.out.println("이미 대여 되어 있는 책입니다.");
			System.out.println("반납 이후에 대여 가능합니다.");
		}
		
		
//		세 검사가 모두 true여야 대여 처리.
		
		if (isAgeOk && isPointOk && isRentUserOk) {
			
//			실제 대여 처리 진행.
			rentUser = u;
			System.out.println(u.name + "에게 " + title + "을 대여했습니다.");
			
//			빌려가는 사람의 포인트를 대여료 만큼 차감 => 감소시킨다.
			u.point -= this.rentFee;
			
		}
		
		
	}
	
	
//	반납하는 기능 추가. => 연체일이 있다면 일당 300원씩 연체료 부과.
	void returnBook(int lateDayCount) {
		

//		연체일이 있다면 ?
		if (lateDayCount > 0) {
//			빌려간 사람의 돈을 일수*300만큼 차감.
			
			rentUser.point -= lateDayCount * 300;
			
			System.out.println("연체료 발생! " + lateDayCount * 300);
//			돈을 낸 후의 정보 출력
			rentUser.printUserInfo();
			
		}
		
//		반납은 아무 조건 없이 받는것으로.
//		대여한 사람이 없어진다.
		rentUser = null;
		
		
		
	}
	
	
//	책의 대여료를 변경 하는 기능.
	void setRentFee(int rentFee) {
//		멤버변수 rentFee = 파라미터 rentFee 대입
		this.rentFee = rentFee;
	}
	

}









