package Algorithm;
import java.util.Scanner;
// �ܼ� ���� ���� ���� - 1 

public class StraightSelectionSort {
	
	// a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// �ܼ� ���� ����
	static void selectionSort(int[] a, int n) // Argument a: array's Name, n: array's Length
		for (int i = 0; i < n -1; i++) { // �迭�� ���� - 1 ��ŭ ���� �ٱ� ����, Length: ��, 3�̸� 2����(0, 1)
			int min = i; // a[i], ..., a[n-1]���� ���� ���� ���� ������ ����� �ε���
			for (int j = i + 1; j < n; j++) { // n=3�̰�, j�� i=0�϶�, j =1, j < 3, j++; 1,2 �迭�� ���� -1��ŭ ��, ������ ������ 1����
				if (a[j] < a[min]) { // i�� 0�϶�, j = 1, min = a[0]
					// a[1], a[2] < a[0] ���� ����, ���� a[j] < a[min] �̶�� min = j
					// 0�̶� ��� �ε����� ���غ����� 0���� ������ �ִٸ� �װ��� min �ε��� ���� ������
					min = j;
					// ���� a[min]�� �ּҰ��� ���� �ε����� ���� �迭�� �ǹ��Ѵ�.
				}
				swap(a, i, min); // ������ �������� �����ϸ鼭 ������������ �������ش�. 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ܼ� ���� ����(���� 1)");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt(); // �迭 Length�� �Է¹���
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // �迭�� ��� �ε����� �ε��� 0���� ������� ���� �Է¹���
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		selectionSort(x, nx); // �迭 x�� ���� �����մϴ�. �迭 �̸�, �迭 ����
		
		System.out.println("������������ �ܼ����� ������� �����߽��ϴ�.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}
}	
