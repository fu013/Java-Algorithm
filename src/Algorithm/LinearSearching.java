package Algorithm;
import java.util.Scanner;
// �����˻� �˰���
// �迭�� 0��° �ε��� ���� ���������� Ű�� ã��, �˻��� Ű���� �ش� �迭�� �����Ѵٸ� �� �ε������� �����ϰ� ��������, Ȥ�� �迭�� ������ �ٵ��Ҵµ�
// ��ġ�ϴ� ���� ���ٸ� ���� ���������� ��������

public class LinearSearching {
	// Ŭ���̾�Ʈ���� Ư�������� �Է¹޾� �迭�� �����, �� �ε������� �ο��� ��, Ű���� �˻��Ͽ�
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��Ѵ�.
	
	// �˻��� ����� �ε����� ��ȯ�ϴ� �ż��� seqSearch ����
	static int seqSearch(int[] a, int n, int key) { // ������ �迭��, ������ �迭�� Length��, �Է¹��� Ű��
		int i = 0; 
		// �迭 ����� �ε����� ����Ű�� ���� i , �ش� �迭�� Length���� ������ -1�� �����ϸ� �Լ������� ����ȴ�.
		// �Ǵ� �ش�迭�̸�[i] �� Ű ���� �Է¹��� Ű���� ���ٸ� ���� i���� �����ϸ� �Լ������� ����ȴ�.
		
		while(true) { // �⺻������ ���� ������ while�� = for(;;) , Ư�� ���� ������ return ���� ��ȯ�ϸ� �����
			if (i == n) { // ������ ������ �ٵ��������, �� ���� false �� ���
				return -1; // �˻� ����(-1�� ��ȯ)
			}
			
			if (a[i] == key) { // �迭 �ε����� Ű���� �Է¹��� Ű���� �������� �ִٸ� �� �ε����� ��ȯ
				return i; // �˻� ����(�ε����� ��ȯ)
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // Scanner Ŭ���� ����
		
		System.out.print("�迭�� Length �Է� : ");
		int num = stdIn.nextInt(); 
		int[] x = new int[num]; // ��ڼ��� num�� �迭�� �Է¹���
		
		System.out.println("�Է¹��� X �迭�� Length���� " + x.length + "�Դϴ�. "); // �� Ȯ��
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]�� ���� Ű���� �Է� : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = stdIn.nextInt(); // ����ڰ� �Է��� Ű���� ������ ����
		
		int idx = seqSearch(x, num, ky); // �迭 x���� Ű ���� ky�� ��Ҹ� �˻�, x�� �迭��, num�� �迭�� �� Length, ky�� �Է¹��� Ű��
		
		if (idx == -1) { // ������ �ٵ��Ҵµ��� ���� ���ٸ�
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else { // ������ ���ٰ� �������� �ϳ��� �˻��ȴٸ�
			System.out.println(ky + "��(��) x[" + idx +"]�� �ֽ��ϴ�.");
		}
	}
}
