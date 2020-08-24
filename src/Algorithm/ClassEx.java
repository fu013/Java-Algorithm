package Algorithm;
// 클래스 선언에 extends(상속)이 없는 클래스의 상위 클래스는 자동으로 Object 클래스가 된다. (Default 가장 상위 클래스)
// * Object는 상위 클래스를 갖지 않는 유일한 클래스

// 클래스 접근 제한자 abstract(추상적인)을 붙히면 추상 매서드를 가질수 있는 추상 클래스가 된다.
// 불완전한 클래스라 인스턴스 생성 불가

// 클래스 안에 선언한 클래스는 중첩 클래스 (nested class)
// 멤버 클래스 : 다른 클래스, 또는 인터페이스 선언에 둘러싸인 클래스
// 내부 클래스 : 명시적으로도 암묵적으로도 정적으로 선언되지 않는 중첩 클래스.
// 정적 초기화나 멤버 인터페이스 선언을 할수 없다.
// 지역 클래스 : 이름이 주어진 중첩 클래스인 내부 클래스, 어떤 클래스의 멤버도 될 수 없다.

public class ClassEx { 
	private int f1; // 비공개 필드
	protected int f2; // 한정 공개 필드
	public int f3;  // 공개 필드
	final int f4; // 서브 클래스를 가질수 없는 마지막(final) 클래스
	
	static final int S1 = 0; // 정적 상수 필드

	public ClassEx() { // 생성자
		f1 = f2 = f3 = f4 = 0;
	}
	
	public ClassEx(int f1, int f2, int f3, int f4) { // 생성자
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
	}
	
	public void setF1(int f) { // 매서드 F1의 Setter
		f1 = f;
	}
	
	public int getF1() { // 매서드 F1의 Getter
		return f1;
	}

	public static void main(String[] args) {

	}
}
