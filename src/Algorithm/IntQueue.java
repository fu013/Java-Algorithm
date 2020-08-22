package Algorithm;
// Int형 큐(Queue) 알고리즘
// 스택과 다르게 선입선출 뒤에서부터 데이터를 넣고, 데이터를 뺄때는 앞에서부터 뺌
// 큐는 스택처럼 꼭 인덱스 0 부터 시작하지않는다. front 요소의 default값은 0이나 디큐를 할때마다 ++ 가 되어 front 요소의 값이 증가하기때문에
// 유동적이며, rear는 다음에 인큐를 했을때, 요소의 위치를 의미한다. rear는 그래서 max index보다 클수없다.
// 예를들어 max 가 10이고, 인덱스가 0~9까지 있는 배열에서 인덱스7까지 값이 차있을경우, 8이 rear값이 되며, 따라서 값이 추가되면(인큐) rear값도 1증가한다.
// 1~10 까지를 차례대로 배열에 넣고 디큐를 5번하면 프론트가 5가된다. 디큐를 하게되면 프론트의 위치가 유동적으로 바뀐다.

public class IntQueue {
	private int max; // 큐의 최대 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체
	
	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}
		
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { }
	}
	
	// 생성자
	
	public IntQueue(int capacity) {
		num = front = rear = 0; // 초기화
		max = capacity; // Max 값을 인자로 받아 배열을 새엇ㅇ
		try {
			que = new int[max]; // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}
	
	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max) {
			throw new OverflowIntQueueException(); // 큐가 가득 참
		}
		que[rear++] = x;
		num++;
		if (rear == max) { // Max 가 10이라 가정했을때 0~9요소를 가지는데 rear값이 max와 같아지면 배열에 없는 공간에 다음 데이터를 넣는꼴이 되므로
			// rear값을 요소 처음부분으로 돌아가게끔 0으로 초기화해준다.
			rear = 0;
		}
		return x;
	}
	
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException(); // 큐가 비어 있음
		}
		int x = que[front++]; // front ++ 함으로써 첫번째 요소를 디큐하고 num을 감소
		num--;
		if (front == max) {
			front = 0;
		}
		return x;
	}
	
	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException(); // 큐가 비어있음
		}
		return que[front];
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) { 
			// 현재개수가 만약 5이고 최대개수가 5면 0,1,2,3,4 / 만약 FRONT 가 2일때 2,3,4,5,6 => 2,3,4,0,1 이런식으로 돌게 하기위해 % max를 해줌
			// i + front 가 max 보다 큰 상황이 존재하고 front가 0이 아니라 0보다큰수라면 front 요소보다 숫자가 작은 요소는 조회할수 없으므로 반드시 해줘야함
			int idx = (i + front) % max; // 
			if (que[idx] == x) {
				return idx; // 검색성공
			}
		}
		return -1; // 검색실패
	}
	
	// 큐에서 x를 검색하여 큐 안에서 몇번째에 있는지를 양수로 반환, 실패할 경우에는 0을 반환
	// indexOf와 다른점은, indexOf는 프론트의 값에 상관없이 해당 요소의 값만을 반환하지만, search는 현재 프론트 요소의 값을 찾아, 그 값 기준으로 몇번째에 있는건지를
	// 판단하므로, 큐안에서 정확히 몇번째인지를 알수있다.
	public int search(int x) { 	 // 프론트 요소가 값이 5 고 맥스가 12일때, 1,2,3,4,5라는 값이 5,6,7,8,9번 인덱스에 차있다고 가정
		for (int i = 0; i < num; i++) {		// => 개수는 5개 이므로 5번도는것은 같음. 포문에 0,1,2,3,4 적용되므로 5회 반복
			int idx = (i + front) % max;
			if (que[idx] == x) {
				if ( idx >= front )
					return idx - (front - 1); // 인덱스가 front 보다 클 경우, 예를들면 front시작은 10 index는 11 max는 12    11 - (10-1) = 2, 11은 2번째맞음
				
				if ( idx < front )
					return max - front + (idx + 1); // 인덱스가 front 요소보다 작을 경우, 최대값 - 프론트값+인덱스값을하면
					// 극단적으로 max값이 12, front가 11 idx가 10이라고 가정해도 12 - 11 = 1 + (10+1) = 12 (정답) 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 12번째
					// max값이 12면 최대 인덱스값은 11이기 때문에 11~0~10 => 총 12개 , 12번째
					
					// 프론트보다 idx가 크다면 그냥 인덱스값에서 - 프런트를 해주면 프런트에서 인덱스까지 몇번가야되는지 나오므로, 몇번째인지 바로 쉽게 알수있음
				
					// 하지만 idx보다 프론트가 작다면 현재 프론트 위치에서 0까지 몇번가야되는지 계산한 것과 + 0에서 해당인덱스값까지 이동한 것을 계산해야함
					// max - front 값이 의미하는건 현재 인덱스에서 맥스 -1 번째 인덱스까지 몇번을 이동해야하는가 거기에서 4번 이동하고 + 1을해줌 그다음 거기서 + 인덱스값
					// 하면 프런트에서 해당 인덱스까지 몇번이동했는지 알수있음 +1은 최대인덱스값은 max-1 이기때문에 +1을 더해줌.
			}
		}
		return 0; // 검색 실패시 0을 반환함
	}
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num >= max;
	}
	
	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}
	
	// 큐 안의 모든 데이터를 프린트 -> 리어 순으로 출력
	public void dump() {
		if (num <= 0) {
			System.out.println("큐가 비어 있습니다.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
