package Algorithm;
import java.util.Scanner;
// ���� ���� - ���� 1

public class Bubble_Sort {
	
	// a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// ���� ����, �Ű������� �迭 ���, �迭 �Ѱ����� �޴´�.
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) { // �迭�� ������ŭ ���� �ٱ� ����, 3�϶��� 3���� 0,1,2
			for (int j = n - 1; j > i; j--) { // n=3 �϶� j=2, 2 > 0, �� 2����
				// i = 0�϶�, j=2, x[1]�� x[2] ��
				// �� ó�� i = 0�϶�, j=1, x[0]�� x[1] ��
				
				// i = 1�϶�, j > 1 ��, j = 2�̹Ƿ�
				// x[1] x[2] �ѹ��� ��
				
				// i = 2 �϶� j = 2 �̹Ƿ� ���� ����
				// �̸��Ͽ� ��� ����� ���� ���ϰ� �������� ���������� �����
				
				if(a[j-1] > a[j]) { // x[1] > x[2] �̶�� 
					swap(a, j-1, j); // x, 1, 2�� ���� �ż��忡 �ִ´�.
					// ���� ����� t = x[1], ���Ƿ� x[1]�� ���� t�� ����
					// x[1] = x[2], x[1]�� x[2] �� ���� �����Ѵ�(���������̹Ƿ� �ε������� ũ�� ���� �� Ŀ���ϹǷ�)
					// ���⼭ x[1]�� x[2]���� ū ��Ȳ
					// x[2] = t, t==x[1], �̹Ƿ� x[2]�� x[1]�� ���� �����Ѵ�
					// ���� ������ �����Ŀ� �� �Ǵ� x[1]�� ���� x[2]��, x[2]�� x[1]���� �̵��Ѵ�.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ����(���� 1)");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt(); // �迭 Length�� �Է¹���
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // �迭�� ��� �ε����� �ε��� 0���� ������� ���� �Է¹���
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx); // �迭 x�� ���� �����մϴ�. �迭 �̸�, �迭 ����
		
		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

}
