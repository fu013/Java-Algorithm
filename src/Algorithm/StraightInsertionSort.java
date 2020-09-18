package Algorithm;
import java.util.Scanner;
// �ܼ� ���� ����
// �ܼ� ���� ������ ��� �ε����� ���� ���� �������� ����ؼ� �������� �о�־��µ�
// �ܼ� ���� ������ 0��° �ε����� �״��� �ε������� �񱳸� �����Ͽ� �� �ε����� �̵��ϸ鼭 ���������� �����ϴµ�
// ��� �ε����� ���°Ծƴ϶� �̹� �񱳰� ���� �ε������ ���ؼ� ��ġ�� �����Ѵ�.
// �迭�� ��Ҹ� �˸��� ��ġ�� �����ϴ� �����̴�.

public class StraightInsertionSort {
	// �ܼ� ���� ����
	
	static void insertionSort(int [] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܼ� ���� ����");
		System.out.println("��ڼ� : ");
		
		int nx = stdIn.nextInt(); // �迭 Length�� �Է¹���
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // �迭�� ��� �ε����� �ε��� 0���� ������� ���� �Է¹���
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		insertionSort(x, nx); // �迭 x�� ���� �����մϴ�. �迭 �̸�, �迭 ����
		
		System.out.println("������������ �ܼ����� ������� �����߽��ϴ�.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

}
