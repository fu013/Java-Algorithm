package Algorithm;
// INT형 스택 알고리즘, 후입선출

public class IntStack {
	private int max; // 스택 용량, 스택에 쌓을 수 있는 최대 테이터 수를 나타내는 필드
	private int ptr; // 스택 포인터, 스택에 쌓여 있는 데이터 수를 나타내는 필드
	private int[] stk; // 스택 본체용 배열, 인덱스 0 부분이 bottom 끝 부분을 top이라고 부른다.
	// 데이터를 푸시한다라는 의미는 top부분에 데이터를 저장하는것을 의미한다.
	
	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}
	
	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}
	
	// 생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if ( ptr >= max ) { // 스택이 가득 참
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
		// 스택 데이터가 Max가 아니라면
		// 데이터 수(ptr)를 1증가시키고 그 증가시킨 자리에 x라는 푸쉬데이터를 넣어준다.
	}
	
	// 스택에서 데이터를 팝(TOP에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) { // 스택이 비어 있음
			throw new EmptyIntStackException();
		} 
		return stk[--ptr];
	}
	
	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) { // 스택이 비어 있음
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1]; // Top위치에 해당하는 인덱스의 스택 데이터를 반환
		// 데이터의 입출력이 없으므로, 스택 포인터는 변화하지 않음
	}
	
	/* 
	 	<스택 매서드>
	 	
	    스택 검색 매서드 indexOf(key) 
	    : 배열의 Top에서 시작해 - Bottom까지의 값중 같은 데이터가 포함되어 있는지 검사
	    같은 값이 있다면 요소의 인덱스 반환, 실패하면 -1을 반환한다.
	    
	    스택의 모든 요소를 삭제하는 매서드 clear
	    : 스택에 쌓여 있는 모든 데이터를 삭제하는 매서드, 따라서 스택 포인터 ptr값을 0으로 만듦
	    
	    용량을 확인하는 매서드 capacity
	    : capacity 매서드는 스택의 용량(max의 값)을 반환하는 매서드이다. max값을 그대로 반환한다.
	    
	    데이터 수를 확인하는 매서드 size
	    : size 매서드는 현재 스택에 쌓여 있는 데이터 수(ptr)를 반환하는 매서드이다.
	    
	     스택이 비어 있는지 검사하는 매서드 IsEmpty
	     : IsEmpty 매서드는 스택이 비어 있는지 검사하는 매서드이다. 스택이 비어 있으면 true, 그렇지 않으면 false를 반환
	     
	     스택이 가득 찼는지 검사하는 매서드 IsFull
	     : IsFull 매서드는 스택이 가득 찼는지 검사하는 매서드이다. 스택이 가득 찼으면 true, 그렇지 않으면 false를 반환
	 */
	
	// 스택에서 x를 찾아 인덱스를 반환 : indexOf()
	public int indexOf(int x) {
		for ( int i = ptr -1;   i >= 0;   i-- ) { // i는 top 요소부터 시작해 bottom 요소까지 
			if (stk[i] == x) {
				return i;
			}
			return -1;
		}
	}
	
	// 스택을 비움 : clear()
	public void clear() {
		ptr = 0;
	}
	
	// 스택의 용량을 반환 : capacity()
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여 있는 데이터수를 반환 : size()
	public int size() {
		return ptr;
	}
	
	// 스택이 비어 있는가? : isEmpty()
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는가? : isFull()
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 => 꼭대기 순서로 출력
	public void dump() {
		if ( ptr <= 0 ) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			for (int i = 0;  i < ptr;  i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
