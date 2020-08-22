package Algorithm;

public class Test {
	int A;
	int B;
	public static void main(String[] args) {
		
		Test A = new Test(); // Static 클래스가 아닌 Non-static 클래스라면 사용할 때 생성자를 반드시 생성해줘야한다.
		A.A = 5;
		A.B = 12;
		
		System.out.println(A.A % A.B); // 작은수에서 큰수를 나눈 나머지는 5 / 12 = 0, 몫 5 => 5가 된다.
	}
}
