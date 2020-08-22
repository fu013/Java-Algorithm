package Algorithm;
import java.util.Scanner;
// ���ϴ� ������ŭ ���� �Է� �޾� ��ڼ��� N�� �迭�� ������ N���� ����
// �ֱٿ� �Է��� N���� �����͸� �� ���ۿ� �����ְ� �ϱ�, �Է��� ���������� ����, ������ �����͸� �ڵ����� �������� �ϰ�, �ֱ� �����͸� ����� ��쿡 �ַ� ���.

public class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; // �Է� ���� ���� ����, ������ 10���� �迭 ����
		int cnt = 0; // �Է� ���� ����
		int retry; // �ٽ� �� ��?
		
		System.out.println("������ �Է��ϼ���");
		
		do {
			System.out.printf("%d��° ���� : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt(); // 0~9 �ε������� ���� �־���
			
			System.out.print("��� �ұ��? (��.1 / �ƴϿ�.0) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) i = 0; // i�� ���� �������, i�� �ʱⰪ�� = 0���� ����
		
		for ( ; i < cnt; i++) // ������ ���� %d , %2d => i+1�� ��, %d\n => a[i%N]�� ���� ��
			System.out.printf("%2d��°�� ���� = %d\n", i + 1, a[i % N]);
	}
}
