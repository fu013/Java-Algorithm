package Algorithm;
// Int�� ť(Queue) �˰���
// ���ð� �ٸ��� ���Լ��� �ڿ������� �����͸� �ְ�, �����͸� ������ �տ������� ��
// ť�� ����ó�� �� �ε��� 0 ���� ���������ʴ´�. front ����� default���� 0�̳� ��ť�� �Ҷ����� ++ �� �Ǿ� front ����� ���� �����ϱ⶧����
// �������̸�, rear�� ������ ��ť�� ������, ����� ��ġ�� �ǹ��Ѵ�. rear�� �׷��� max index���� Ŭ������.
// ������� max �� 10�̰�, �ε����� 0~9���� �ִ� �迭���� �ε���7���� ���� ���������, 8�� rear���� �Ǹ�, ���� ���� �߰��Ǹ�(��ť) rear���� 1�����Ѵ�.
// 1~10 ������ ���ʴ�� �迭�� �ְ� ��ť�� 5���ϸ� ����Ʈ�� 5���ȴ�. ��ť�� �ϰԵǸ� ����Ʈ�� ��ġ�� ���������� �ٲ��.

public class IntQueue {
	private int max; // ť�� �ִ� �뷮
	private int front; // ù ��° ��� Ŀ��
	private int rear; // ������ ��� Ŀ��
	private int num; // ���� ������ ��
	private int[] que; // ť ��ü
	
	// ���� �� ���� : ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}
		
	// ���� �� ���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { }
	}
	
	// ������
	
	public IntQueue(int capacity) {
		num = front = rear = 0; // �ʱ�ȭ
		max = capacity; // Max ���� ���ڷ� �޾� �迭�� ������
		try {
			que = new int[max]; // ť ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}
	
	// ť�� �����͸� ��ť
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max) {
			throw new OverflowIntQueueException(); // ť�� ���� ��
		}
		que[rear++] = x;
		num++;
		if (rear == max) { // Max �� 10�̶� ���������� 0~9��Ҹ� �����µ� rear���� max�� �������� �迭�� ���� ������ ���� �����͸� �ִ²��� �ǹǷ�
			// rear���� ��� ó���κ����� ���ư��Բ� 0���� �ʱ�ȭ���ش�.
			rear = 0;
		}
		return x;
	}
	
	// ť���� �����͸� ��ť
	public int deque() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException(); // ť�� ��� ����
		}
		int x = que[front++]; // front ++ �����ν� ù��° ��Ҹ� ��ť�ϰ� num�� ����
		num--;
		if (front == max) {
			front = 0;
		}
		return x;
	}
	
	// ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException(); // ť�� �������
		}
		return que[front];
	}
	
	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) { 
			// ���簳���� ���� 5�̰� �ִ밳���� 5�� 0,1,2,3,4 / ���� FRONT �� 2�϶� 2,3,4,5,6 => 2,3,4,0,1 �̷������� ���� �ϱ����� % max�� ����
			// i + front �� max ���� ū ��Ȳ�� �����ϰ� front�� 0�� �ƴ϶� 0����ū����� front ��Һ��� ���ڰ� ���� ��Ҵ� ��ȸ�Ҽ� �����Ƿ� �ݵ�� �������
			int idx = (i + front) % max; // 
			if (que[idx] == x) {
				return idx; // �˻�����
			}
		}
		return -1; // �˻�����
	}
	
	// ť���� x�� �˻��Ͽ� ť �ȿ��� ���°�� �ִ����� ����� ��ȯ, ������ ��쿡�� 0�� ��ȯ
	// indexOf�� �ٸ�����, indexOf�� ����Ʈ�� ���� ������� �ش� ����� ������ ��ȯ������, search�� ���� ����Ʈ ����� ���� ã��, �� �� �������� ���°�� �ִ°�����
	// �Ǵ��ϹǷ�, ť�ȿ��� ��Ȯ�� ���°������ �˼��ִ�.
	public int search(int x) { 	 // ����Ʈ ��Ұ� ���� 5 �� �ƽ��� 12�϶�, 1,2,3,4,5��� ���� 5,6,7,8,9�� �ε����� ���ִٰ� ����
		for (int i = 0; i < num; i++) {		// => ������ 5�� �̹Ƿ� 5�����°��� ����. ������ 0,1,2,3,4 ����ǹǷ� 5ȸ �ݺ�
			int idx = (i + front) % max;
			if (que[idx] == x) {
				if ( idx >= front )
					return idx - (front - 1); // �ε����� front ���� Ŭ ���, ������� front������ 10 index�� 11 max�� 12    11 - (10-1) = 2, 11�� 2��°����
				
				if ( idx < front )
					return max - front + (idx + 1); // �ε����� front ��Һ��� ���� ���, �ִ밪 - ����Ʈ��+�ε��������ϸ�
					// �ش������� max���� 12, front�� 11 idx�� 10�̶�� �����ص� 12 - 11 = 1 + (10+1) = 12 (����) 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 12��°
					// max���� 12�� �ִ� �ε������� 11�̱� ������ 11~0~10 => �� 12�� , 12��°
					
					// ����Ʈ���� idx�� ũ�ٸ� �׳� �ε��������� - ����Ʈ�� ���ָ� ����Ʈ���� �ε������� ������ߵǴ��� �����Ƿ�, ���°���� �ٷ� ���� �˼�����
				
					// ������ idx���� ����Ʈ�� �۴ٸ� ���� ����Ʈ ��ġ���� 0���� ������ߵǴ��� ����� �Ͱ� + 0���� �ش��ε��������� �̵��� ���� ����ؾ���
					// max - front ���� �ǹ��ϴ°� ���� �ε������� �ƽ� -1 ��° �ε������� ����� �̵��ؾ��ϴ°� �ű⿡�� 4�� �̵��ϰ� + 1������ �״��� �ű⼭ + �ε�����
					// �ϸ� ����Ʈ���� �ش� �ε������� ����̵��ߴ��� �˼����� +1�� �ִ��ε������� max-1 �̱⶧���� +1�� ������.
			}
		}
		return 0; // �˻� ���н� 0�� ��ȯ��
	}
	
	// ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	
	// ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num >= max;
	}
	
	// ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}
	
	// ť ���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		if (num <= 0) {
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
