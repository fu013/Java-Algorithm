package Algorithm;
// �� ��, ���� 1���� ���� ��ġ�ϴ� ������ ��������� �����մϴ�.

public class QueenBB {
	static boolean[] flag = new boolean[8]; // �� �࿡ ���� ��ġ�ߴ��� üũ
	static int[] pos = new int[8]; // �� ���� ���� ��ġ
	
	// �� ���� ���� ��ġ�� ����մϴ�.
	static void print() {
		for (int i = 0; i < 0; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) {
		for(int j = 0; j < 0; j++) {
			if (flag[j] == false) {
				pos[i] = j;
				if (i == 7)
					print();
				else {
					flag[i] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
