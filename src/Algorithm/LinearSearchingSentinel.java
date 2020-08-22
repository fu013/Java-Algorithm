package Algorithm;
import java.util.Scanner;
// �����˻� �˰��� + ���ʹ�
// �迭�� �������� �Է¹��� Ű���� �־�ּ�, ���Ϲ��� �ش� Ű���� ã���� break�ؼ� ���������� ����
// ���� ���� ã�����ص� �迭�ε����� �� + 1 ������ key ���ʰ��� �־�ױ⶧���� ������ while���� break �ȴ�.
// å 120�ʿ��� �ڹٿ��� �⺻������ �����ϴ� �ż����� binarySearch �ż���� �⺻ �ڷ��� �迭���� ���� �˻��� �ϴ� �ż��带 ����Ͽ� �����˻��� �����ϴ�
// �⺻���� ���� => Arrays.binarySearch(x, ky); x�� �迭�̸�, ky�� Ű���̴�, �� �ż���� true�϶� �ش� �迭�� �ε����� ��ȯ�Ѵ�.

public class LinearSearchingSentinel {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; // ����� �� + 1 ������ ���ʸ� �߰�, �Է¹��� ���� �־��
		
		while (true) {
			if (a[i] == key) { // �˻� ����, ���� �Է¹��� ���� ������ �迭 ������ �ε��������� �Է¹��� ���� �־�ױ⶧���� �ݺ����� ������ ���� ���Ϲ��� ��������.
				break;
			}
			i++;
		}
		return i == n ? -1 : i; // i == n�� ���� ��� -1�� ��ȯ, ������ ��� i, �� ��� �ε����� ��ȯ
		// ���� Ž���ϰ��ִ� �ε����� �����ε������ -1 (�˻� ����), �˻��ε����� �ƴ϶��(=> ���Ϲ��� ���� i ���� �̹� ������), i ��° �ε�����
		// �Է¹��� Ű���� ���� Ű���� �־� �����ε��� �������� break �Ǿ��ٴ� �ǹ��̹Ƿ� i �ε������� ��ȯ�Ѵ�.
		// n�� num�� ��, �迭�� ���� �ε��� + 1 (Length) ���̴�. i �� �ε����� �ǹ��ϹǷ�, �ε����� ���࿡ �Ϲ����� �ε��������� �� Ž���ϰ���,
		// ���ʷ� ���� ������ ���� �ε����� ���ٸ�, �Է¹��� ���� �迭�� �������� �ʴٴ� �ǹ��̹Ƿ� false�� ����Ѵ�.
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("naong �迭�� Length ���� �Է� : ");
		int num = stdIn.nextInt(); // Length ���� int Ÿ���� num ������ ����
		int[] naong = new int[num + 1]; // �迭 ������, naong �迭�� ������ ��, �Է¹��� �� + ������ ������ ���� + 1�� ���ؼ� �ε��� ���̸� �����Ѵ�.
		 
		for (int i = 0; i < num; i++) {
			System.out.print("naong �迭�� �ε��� naong[" + i +"]�� ���� ���� �Է� : ");
			naong[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : "); // Ŭ���̾�Ʈ�κ��� Ű ���� �Է� ����
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(naong, num, ky);
		
		if (idx == -1) { // �˻����� ���� ��
			System.out.println("�� ���� ��Ұ� �����ϴ�. \n������ �����մϴ�.");
		} else {
			System.out.println(ky + "��(��) naong[" + idx +"]�� �ֽ��ϴ�. \n������ �����մϴ�.");
		}
	}
}
