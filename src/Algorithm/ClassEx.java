package Algorithm;
// Ŭ���� ���� extends(���)�� ���� Ŭ������ ���� Ŭ������ �ڵ����� Object Ŭ������ �ȴ�. (Default ���� ���� Ŭ����)
// * Object�� ���� Ŭ������ ���� �ʴ� ������ Ŭ����

// Ŭ���� ���� ������ abstract(�߻�����)�� ������ �߻� �ż��带 ������ �ִ� �߻� Ŭ������ �ȴ�.
// �ҿ����� Ŭ������ �ν��Ͻ� ���� �Ұ�

// Ŭ���� �ȿ� ������ Ŭ������ ��ø Ŭ���� (nested class)
// ��� Ŭ���� : �ٸ� Ŭ����, �Ǵ� �������̽� ���� �ѷ����� Ŭ����
// ���� Ŭ���� : ��������ε� �Ϲ������ε� �������� ������� �ʴ� ��ø Ŭ����.
// ���� �ʱ�ȭ�� ��� �������̽� ������ �Ҽ� ����.
// ���� Ŭ���� : �̸��� �־��� ��ø Ŭ������ ���� Ŭ����, � Ŭ������ ����� �� �� ����.

public class ClassEx { 
	private int f1; // ����� �ʵ�
	protected int f2; // ���� ���� �ʵ�
	public int f3;  // ���� �ʵ�
	final int f4; // ���� Ŭ������ ������ ���� ������(final) Ŭ����
	
	static final int S1 = 0; // ���� ��� �ʵ�

	public ClassEx() { // ������
		f1 = f2 = f3 = f4 = 0;
	}
	
	public ClassEx(int f1, int f2, int f3, int f4) { // ������
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
	}
	
	public void setF1(int f) { // �ż��� F1�� Setter
		f1 = f;
	}
	
	public int getF1() { // �ż��� F1�� Getter
		return f1;
	}

	public static void main(String[] args) {

	}
}
