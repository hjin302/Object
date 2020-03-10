package getter_setter;

public class MainDrive1 {
	
	
	static void printHello() {
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		
		printHello();
		
		
		System.out.println(Card1.width);
		
		
//		카드 한장 생성. 스페이드 7
		Card1 card1 = new Card1("스페이드", 7);
		
//		카드 한장 추가 생성. 하트 8
		Card1 card2 = new Card1("하트", 8);

//		카드 세장 더. 다이아 8, 하트 7, 클로버 2
		Card1 card3 = new Card1("다이아", 8);
		Card1 card4 = new Card1("하트", 7);
		Card1 card5 = new Card1("클로버", 2);
		
//		세번째카드? 다이아 8. 카드 한장한장은 다른 의미를 가진다.
//		무늬와 모양이 다르기 때문. => 각각의 카드가 갖는 멤버변수가 의미를 가진다.
		
//		세번째 카드의 크기? 가로 7.5, 세로 10.8
		card3.width = 7.5;
		card3.height = 10.8;
		
//		첫번째 카드의 크기는 몇이어야? 세번째랑 같은 크기.
//		각각의 장마다 의미가 있는 데이터 X. 카드라면 모두 같아야 할 값. => 종특.
		
		System.out.println(card1.width);
		System.out.println(card1.height);
		
		System.out.println(Card1.height);
		
//		종특 => 각각의 개체보다는 종족 자체의 특성으로 적는게 더 이해가 편함.
		Card1.width = 10.2;
		Card1.height = 15.8;
		
//		3의 3승 구해보자. => for문 3을 세번곱하자.
		
		int result = (int) Math.pow(3, 3);
		
		
		
	}
	
}







