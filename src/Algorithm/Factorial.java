package Algorithm;
import java.util.Scanner;
// ��� ��� ��, ���丮�� ���ϱ�(0! = 1, n > 0 �̸� n! = n x (n-1)!  [n�� ��� �ڿ���]
// ��� ȣ�� ����� �ż��� ����� Factorial �̶� �Լ����� Factorial�� ȣ���ϸ� ���� ���, ���� �ٸ� �ż��带 ȣ���ϸ� ���� ��Ͷ�� �Ѵ�.
// ��� ����� ��ũ�� ����Ʈ���� ����ؼ� �����ְ� ��ȯ�� �� �ٸ� �ż��带 ȣ���ϴ� ������� �Ǿ��ִ�.
// 3�̸� 3! = 3 x 2! = > 3 x 2 = 6
// 2! = 2 x 1! => 2
// 1! = 1 x 0! => 1

public class Factorial {
	// ���� ���� n�� ���丮���� ��ȯ�մϴ�.
	static int factorial(int n) {
		if (n > 0)
			return n * factorial(n-1);
		else
			return 1;
	}
	// ���� 5�� factorial�� �ְԵǸ�
	// 5 x factorial(4)��� ������ ������, factorial(4) = 4 x factorial(3) => factorial(3) = 3 x factorial(2) => factorial(2) = 2 x factorial(1) => factorial(1) = 1 x factorial(0)
	// �׳� factorial(4) �̷������� �����ְ� ���� ���ٸ� �翬�� ����� �����������̴�. ��������
	// �������� factorial(0)�� else ���ǿ� ���ԵǾ� 1�̶�� ���� ������ �ϹǷ� factorial(1)�� �׿� ���� 1�̵ǰ�, ������ factorial(2)�� 2���Ǹ�, factorial(3), factorial(4) ����
	// �������� ���� ������ �ȴ�. �̷������ �Լ��� ����� �Լ���� �Ѵ�. ��, �� ������������ ���� ���� ������ �Է��ϰ�, �������� ������ ���� ���ؼ� ���������� �������� ����� ������
	// �����ϰ� �Ǿ� �Լ��� ���� ���ǵǴ� �����̴�.
	// �̷��� �Լ��� Ư¡�� 1. �ٷ� ���� ���ǵ��� �ʴ´� 2. ��ġ ��ũ�� ����Ʈó�� ���������� ������ �����, ���� ���Ŀ��� �� ���� ���´� 3. �� ���� ���� �̿��Ͽ� �ٽ� �������� �귯��
	// ������ ���ı��� ���� �����.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");
	}
}
