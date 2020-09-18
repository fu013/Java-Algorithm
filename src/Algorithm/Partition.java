package Algorithm;
import java.util.Scanner;
// �迭�� �����ϴ�.

public class Partition {
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// �迭�� �����ϴ�.
	static void partition(int[] a, int n) {
		int pl = 0; // ���� Ŀ��, ���� �ε���(0��° �迭)
		int pr = n - 1; // ������ Ŀ��, �� �ε���(�迭�� 0���� �����ϹǷ� �迭���� - 1)
		int x = a[n / 2];// �ǹ�(ī� ��ġ�� ��)
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while(pl <= pr);
	
		System.out.println("�ǹ��� ���� " + x + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		
	}
	
}
