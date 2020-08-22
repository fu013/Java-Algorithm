package Algorithm;
import java.util.Scanner;
// int�� ť�� ��� ��

public class IntQueueTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(12); // �ִ� 12���� ��ť�� �� �ִ� ť

		while (true) {
			System.out.println("���� �����ͼ� : " + s.size() + " / "+ s.capacity());
			System.out.print("(1)��ť   (2)��ť    (3)��ũ   " + "(4)����   (5)�ε��� �˻�   (6)ť �˻�   (0)���� : ");
			int menu = stdIn.nextInt();
			if (menu == 0) break;
			
			int x; // �Է¹��� �����Ͱ� ����
			int y; // ã�� �����Ͱ� ����
			switch (menu) {
				case 1: // ��ť
					System.out.print("������ : ");
					x = stdIn.nextInt();
					try {
						s.enque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("ť�� ���� á���ϴ�.");
					}
					break;
				
				case 2: // ��ť
					try {
						x = s.deque();
						System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
					} catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					}
					break;
				
				case 3: // ��ũ
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					}
					break;
				
				case 4: // ����
					s.dump();
					break;
					
				case 5: // �ε��� �˻�
					System.out.print("�˻��� �����Ͱ� : ");
					x = stdIn.nextInt();
					y = s.indexOf(x);
					if (y == -1) 
						System.out.println("���� �迭�ȿ� �������� �ʽ��ϴ�.");
					else
						System.out.println("�˻��� �����Ͱ��� ��ġ�� �ش� �迭�� "  + y + "��° �ε����� �ֽ��ϴ�.");
					break;
					
				case 6: // ť �˻�
					System.out.print("�˻��� �����Ͱ� : ");
					x = stdIn.nextInt();
					y = s.search(x);
					if (y == 0) 
						System.out.println("���� �迭�ȿ� �������� �ʽ��ϴ�.");
					else
						System.out.println("�˻��� �����Ͱ��� ��ġ�� �ش� ť�� "  + y + "��°�� �ֽ��ϴ�.");
					break;
			}
		}
	}
}
