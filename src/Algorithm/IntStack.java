package Algorithm;
// INT�� ���� �˰���, ���Լ���

public class IntStack {
	private int max; // ���� �뷮, ���ÿ� ���� �� �ִ� �ִ� ������ ���� ��Ÿ���� �ʵ�
	private int ptr; // ���� ������, ���ÿ� �׿� �ִ� ������ ���� ��Ÿ���� �ʵ�
	private int[] stk; // ���� ��ü�� �迭, �ε��� 0 �κ��� bottom �� �κ��� top�̶�� �θ���.
	// �����͸� Ǫ���Ѵٶ�� �ǹ̴� top�κп� �����͸� �����ϴ°��� �ǹ��Ѵ�.
	
	// ���� �� ���� : ������ ��� ����
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}
	
	// ���� �� ���� : ������ ���� ��
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}
	
	// ������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}
	
	// ���ÿ� x�� Ǫ��
	public int push(int x) throws OverflowIntStackException {
		if ( ptr >= max ) { // ������ ���� ��
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
		// ���� �����Ͱ� Max�� �ƴ϶��
		// ������ ��(ptr)�� 1������Ű�� �� ������Ų �ڸ��� x��� Ǫ�������͸� �־��ش�.
	}
	
	// ���ÿ��� �����͸� ��(TOP�� �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) { // ������ ��� ����
			throw new EmptyIntStackException();
		} 
		return stk[--ptr];
	}
	
	// ���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) { // ������ ��� ����
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1]; // Top��ġ�� �ش��ϴ� �ε����� ���� �����͸� ��ȯ
		// �������� ������� �����Ƿ�, ���� �����ʹ� ��ȭ���� ����
	}
	
	/* 
	 	<���� �ż���>
	 	
	    ���� �˻� �ż��� indexOf(key) 
	    : �迭�� Top���� ������ - Bottom������ ���� ���� �����Ͱ� ���ԵǾ� �ִ��� �˻�
	    ���� ���� �ִٸ� ����� �ε��� ��ȯ, �����ϸ� -1�� ��ȯ�Ѵ�.
	    
	    ������ ��� ��Ҹ� �����ϴ� �ż��� clear
	    : ���ÿ� �׿� �ִ� ��� �����͸� �����ϴ� �ż���, ���� ���� ������ ptr���� 0���� ����
	    
	    �뷮�� Ȯ���ϴ� �ż��� capacity
	    : capacity �ż���� ������ �뷮(max�� ��)�� ��ȯ�ϴ� �ż����̴�. max���� �״�� ��ȯ�Ѵ�.
	    
	    ������ ���� Ȯ���ϴ� �ż��� size
	    : size �ż���� ���� ���ÿ� �׿� �ִ� ������ ��(ptr)�� ��ȯ�ϴ� �ż����̴�.
	    
	     ������ ��� �ִ��� �˻��ϴ� �ż��� IsEmpty
	     : IsEmpty �ż���� ������ ��� �ִ��� �˻��ϴ� �ż����̴�. ������ ��� ������ true, �׷��� ������ false�� ��ȯ
	     
	     ������ ���� á���� �˻��ϴ� �ż��� IsFull
	     : IsFull �ż���� ������ ���� á���� �˻��ϴ� �ż����̴�. ������ ���� á���� true, �׷��� ������ false�� ��ȯ
	 */
	
	// ���ÿ��� x�� ã�� �ε����� ��ȯ : indexOf()
	public int indexOf(int x) {
		for ( int i = ptr -1;   i >= 0;   i-- ) { // i�� top ��Һ��� ������ bottom ��ұ��� 
			if (stk[i] == x) {
				return i;
			}
			return -1;
		}
	}
	
	// ������ ��� : clear()
	public void clear() {
		ptr = 0;
	}
	
	// ������ �뷮�� ��ȯ : capacity()
	public int capacity() {
		return max;
	}
	
	// ���ÿ� �׿� �ִ� �����ͼ��� ��ȯ : size()
	public int size() {
		return ptr;
	}
	
	// ������ ��� �ִ°�? : isEmpty()
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// ������ ���� á�°�? : isFull()
	public boolean isFull() {
		return ptr >= max;
	}
	
	// ���� ���� ��� �����͸� �ٴ� => ����� ������ ���
	public void dump() {
		if ( ptr <= 0 ) {
			System.out.println("������ ��� �ֽ��ϴ�.");
		} else {
			for (int i = 0;  i < ptr;  i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
