package getter_setter;

// 트럼프 카드를 클래스로 표현.

public class Card1 {
	
//	속성 2가지.
	private int number; // 1:A, 2~10, 11:J, 12:Q, 13:K
	private String pattern; // 스페이드, 하트, 다이아, 클로버
	
//	가로 / 세로 크기를 double
	static double width = 7.5; // static 변수는 기울임체로 표기.
	static double height = 12.2; // 이 클래스 종류 자체의 특성. => 종특으로 취급. 
	

//	무늬 / 값 설정 생성자.
	public Card1(String pattern, int number) {
		super();
		this.number = number;
		this.pattern = pattern;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	
	
}
