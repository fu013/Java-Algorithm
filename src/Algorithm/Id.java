package Algorithm;
// ���̵� �ο��ϴ� Ŭ����
// Ŭ���� �ż��� (���� �ż���, static�� ����), �ν��Ͻ� �ż���(������ �ż���, static�� ������ ����)
// ������ : �ż��尡 �ν��Ͻ��� ���ԵǴ���
// ȣ���ϴ� ��ĵ� �ٸ�
// �ν��Ͻ� �ż��� ȣ�� �� : Ŭ������ ���� �̸�.�ż��� �̸�
// Ŭ���� �ż��� ȣ�� �� : Ŭ���� �̸�.�ż��� �̸�

class Id {
	private static int counter = 0; // ���̵� � �ο��ߴ��� ����
	private int id; // ���̵�
	
	// ������
	public id() { id = ++counter; }
	
	// ���̵� ��ȯ�ϴ� �ν��Ͻ� �ż���
	public int getId() { return id; }
	
	// counter�� ��ȯ�ϴ� Ŭ���� �ż���
	public static int getCounter() { return counter; }
	
}
public class IdTester {
	public static void main(String[] args) {
		Id a = new Id(); // ���̵� 1
		Id b = new Id(); // ���̵� 2
		
		System.out.println("a�� ���̵� : " + a.getId()); // �ν��Ͻ� �ż��� => Ŭ���� �� ���� ��.�ż��� ��
		System.out.println("b�� ���̵� : " + b.getId()); // �ν��Ͻ� �ż��� => Ŭ���� �� ���� ��.�ż��� ��
		
		System.out.println("�ο��� ���̵��� ���� : " + Id.getCounter()); // Ŭ���� �ż��� => Ŭ���� ��.�ż��� ��
	}
}
