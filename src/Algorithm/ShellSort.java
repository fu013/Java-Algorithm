package Algorithm;
import java.util.Scanner;
// �� ���� ���� - 1
// �� ��ҵ��� �׷����� ���� ��� �̵�Ƚ���� �� ���ĵ鿡 ���� ���� ���� �����̴�.
// 1. �� 0���� 4 ����� �ε��� ��ҳ��� ���Ͽ� ���� ���� ����, �������� �������� �����Ƿ� �������� ������ �� ���¿� �������.
// 2. �� 0���� 2 ����� �ε��� ��ҳ��� ���Ͽ� ���� ���� ����, �������� �������� �����Ƿ� �������� ������ �� ���¿� �������.
// 3. ��� �ε��� ��ҳ��� ���Ͽ� ����(���� ������ ��ġ�� ���� �����ϴ°��̹Ƿ� �Ϲ������� �����ϴ°ͺ��� �� ������ ���ĵ�)

public class ShellSort {
	// �� ����
	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2) { // h = h / 2
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j-= h) {
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�� ���� ���� - 1");
		System.out.println("��ڼ� : ");
		
		int nx = stdIn.nextInt(); // �迭 Length�� �Է¹���
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // �迭�� ��� �ε����� �ε��� 0���� ������� ���� �Է¹���
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		shellSort(x, nx); // �迭 x�� ���� �����մϴ�. �迭 �̸�, �迭 ����
		
		System.out.println("������������ �� ������� �����߽��ϴ�.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}
}
