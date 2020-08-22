package Algorithm;
// 아이디를 부여하는 클래스
// 클래스 매서드 (정적 매서드, static을 붙힘), 인스턴스 매서드(비정적 매서드, static을 붙히지 않음)
// 차이점 : 매서드가 인스턴스에 포함되는지
// 호출하는 방식도 다름
// 인스턴스 매서드 호출 시 : 클래스형 변수 이름.매서드 이름
// 클래스 매서드 호출 시 : 클래스 이름.매서드 이름

class Id {
	private static int counter = 0; // 아이디를 몇개 부여했는지 저장
	private int id; // 아이디
	
	// 생성자
	public id() { id = ++counter; }
	
	// 아이디를 반환하는 인스턴스 매서드
	public int getId() { return id; }
	
	// counter를 반환하는 클래스 매서드
	public static int getCounter() { return counter; }
	
}
public class IdTester {
	public static void main(String[] args) {
		Id a = new Id(); // 아이디 1
		Id b = new Id(); // 아이디 2
		
		System.out.println("a의 아이디 : " + a.getId()); // 인스턴스 매서드 => 클래스 형 변수 명.매서드 명
		System.out.println("b의 아이디 : " + b.getId()); // 인스턴스 매서드 => 클래스 형 변수 명.매서드 명
		
		System.out.println("부여한 아이디의 개수 : " + Id.getCounter()); // 클래스 매서드 => 클래스 명.매서드 명
	}
}
