package Algorithm;
import java.util.Scanner;
// int형 큐의 사용 예

public class IntQueueTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(12); // 최대 12개를 인큐할 수 있는 큐

		while (true) {
			System.out.println("현재 데이터수 : " + s.size() + " / "+ s.capacity());
			System.out.print("(1)인큐   (2)디큐    (3)피크   " + "(4)덤프   (5)인덱스 검색   (6)큐 검색   (0)종료 : ");
			int menu = stdIn.nextInt();
			if (menu == 0) break;
			
			int x; // 입력받은 데이터값 저장
			int y; // 찾은 데이터값 저장
			switch (menu) {
				case 1: // 인큐
					System.out.print("데이터 : ");
					x = stdIn.nextInt();
					try {
						s.enque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득 찼습니다.");
					}
					break;
				
				case 2: // 디큐
					try {
						x = s.deque();
						System.out.println("디큐한 데이터는 " + x + "입니다.");
					} catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				
				case 3: // 피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				
				case 4: // 덤프
					s.dump();
					break;
					
				case 5: // 인덱스 검색
					System.out.print("검색할 데이터값 : ");
					x = stdIn.nextInt();
					y = s.indexOf(x);
					if (y == -1) 
						System.out.println("값이 배열안에 존재하지 않습니다.");
					else
						System.out.println("검색한 데이터값의 위치는 해당 배열의 "  + y + "번째 인덱스에 있습니다.");
					break;
					
				case 6: // 큐 검색
					System.out.print("검색할 데이터값 : ");
					x = stdIn.nextInt();
					y = s.search(x);
					if (y == 0) 
						System.out.println("값이 배열안에 존재하지 않습니다.");
					else
						System.out.println("검색한 데이터값의 위치는 해당 큐의 "  + y + "번째에 있습니다.");
					break;
			}
		}
	}
}
