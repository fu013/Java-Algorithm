package Algorithm;
import java.util.Comparator;
// Ŭ���� X�� ���ο��� Comparator ����
public class X {
	// �ʵ� �ż��� ��
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<T> {
		public int compare(T d1, T d2) {
			// d1�� d2���� ũ�� ���� �� ��ȯ
			// d1�� d2���� ������ ���� �� ��ȯ
			// d1�� d2�� ������ 0 ��ȯ
		}
	}
}
