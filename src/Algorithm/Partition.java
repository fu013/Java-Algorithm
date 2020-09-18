package Algorithm;
import java.util.Scanner;
// �� ���� part - 1
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
		int x = a[n / 2]; // �ǹ�(ī� ��ġ�� ��)
		
		do {
			while (a[pl] < x) pl++; // a[pl] ���� a[x] ���� ������� x���� ���������� �ε��� ++
			while (a[pr] > x) pr--; // a[pr] ���� a[x] ���� ������� x���� ���������� �ε��� --
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while(pl <= pr);
	
		System.out.println("�ǹ��� ���� " + x + "�Դϴ�.");
		
		System.out.println("�ǹ� ������ �׷�");
		for(int i = 0; i <= pl - 1; i++) { // a[0] ~ a[pl-1]
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		if(pl > pr + 1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for (int i = pr + 1; i <= pl - 1; i++) { // a[pr + 1] ~ a[n - 1]
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.println("�迭�� �����ϴ�.");
		System.out.print("��ڼ� : ");
		int nx = stdln.nextInt(); // �迭 Length�� �Է¹���
		int[] x = new int[nx];
		
		
		for (int i = 0; i < nx; i++) { // �迭�� ��� �ε����� �ε��� 0���� ������� ���� �Է¹���
			System.out.print("x[" + i + "] : ");
			x[i] = stdln.nextInt();
		}
		
		partition(x, nx); // �迭 x�� �����ϴ�.
	}
	
}
