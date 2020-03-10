package Inheritance;
// 20200310_06_OOP06_Inheritance
public class MainDrive {
	
	public static void main(String[] args) {
		
//		Dog는 Animal을 상속받는 클래스.
		Dog dog1 = new Dog();
		
//		Animal에 적혀있는 메쏘드를 바로 활용 가능.
//		Animal안에 적혀있는 run의 내용이 그대로 실행된다!
		dog1.run();
//		Animal 에 작성된 변수도 사용가능.
		dog1.name = "바둑이";
		System.out.println(dog1.name);
		
//		Dog만의 고유 정보도 추가로 활용 가능.
		dog1.ownerName = "조경진";
		System.out.println(dog1.ownerName);
		
//		Dog만의 고유 메쏘드도 추가로 활용가능.
		dog1.protectHome();
		
		
//		Animal클래스를 객체화.
		Animal a1 = new Animal();
//		부모클래스에 적혀있는 기능 사용.
//		Animal은 Dog에게 가진 변수를 물려줬지만 본인에게는 아무 영향도 없다.
//		여전히 run메쏘드 활용 가능.
		a1.run(); 
//		Animal의 변수도 마찬가지로 모두 남아있게 된다.
		a1.name = "동물 1";
		System.out.println(a1.name);
		
//		Animal은 Dog 변수 / 메쏘드 사용가능? 결론 X
//		a1.ownerName => 자동완성 X, 강제로 써도 에러.
//		a1.protectHome() => 사용불가.
		
//		부모클래스 => 자녀에게 내가 가진 모든걸 "복사" 해서 공유만. 반대로 받진 않음
//		자식클래스 => 부모가 가진 모든 변수/메쏘드를 그대로 복사해옴.
//		 => + 자식에게 생성된 변수/메쏘드는 전용으로 활용.
		
		
		Cat cat1 = new Cat();
		cat1.run();
		cat1.slaveName = "조경진";
		
//		dog1은 집사이름을 가지고있을까?
//		dog1.slaveName => 사용 불가.
		
//		cat1은 주인이름을 가지고있을까?
//		cat1.ownerName => 사용 불가.
		
//		dog1에게 달리기
		dog1.run(); // Animal이 물려준 기능.
//		dog1에게 사람과 놀기
		dog1.playWithHuman(); // Pet이 물려준 기능
//		dog1에게 집지키기
		dog1.protectHome(); // Dog 자체의 기능.
		
		
	}

}









