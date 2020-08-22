package Algorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
// ��ü�˻� ������ �迭���� ���� �˻��ϱ�

public class PhysExamSearch {
	// ��ü�˻� �����͸� �����Ѵ�.
	static class PhyscData {
		private String name; // �̸�
		private int height; // Ű
		private double vision; // �÷�
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name; 
			this.height = height; 
			this.vision = vision;
		}
		
		// ���ڿ��� ��ȯ�ϴ� �ż���(���� Ȯ�ο�)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// ������������ �����ϱ� ���� Comparator 
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
						 (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = { // Ű�� ������������ ���ĵǾ� �ֽ��ϴ�.
				new PhyscData("�ʱ��� 1ȣ", 172, 0.3),
				new PhyscData("�ʱ��� 2ȣ", 182, 0.4),
				new PhyscData("�ʱ��� 3ȣ", 192, 0.5),
				new PhyscData("�ʱ��� 4ȣ", 202, 0.6),
				new PhyscData("�ʱ��� 5ȣ", 212, 0.7),
		};
		System.out.print("�� cm�� ����� ã�� �ֳ���?");
		int height = stdIn.nextInt(); // Ű �� �Է�
		int idx = Arrays.binarySearch(
					x, // �迭 x����
					new PhyscData("", height, 0.0), // Ű�� height�� ��Ҹ�
					PhyscData.HEIGHT_ORDER // HEIGHT_ORDER�� ���� �˻�, Ŭ���� PhyscData�� ���� comparator HEIGHT_ORDER
				);
		
		if (idx < 0) {
			System.out.println("��Ұ� �����ϴ�.");
		} else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : " + x[idx]); // �ڵ����� toString �ż��尡 ȣ��ȴ�.
		}
	}
}
