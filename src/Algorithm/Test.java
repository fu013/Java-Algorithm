package Algorithm;

public class Test {
	int A;
	int B;
	public static void main(String[] args) {
		
		Test A = new Test(); // Static Ŭ������ �ƴ� Non-static Ŭ������� ����� �� �����ڸ� �ݵ�� ����������Ѵ�.
		A.A = 5;
		A.B = 12;
		
		System.out.println(A.A % A.B); // ���������� ū���� ���� �������� 5 / 12 = 0, �� 5 => 5�� �ȴ�.
	}
}
