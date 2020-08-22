package Algorithm;
import java.util.Scanner;
// int 형 스택의 사용 예

public class IntStackTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택 == [MAX : 64]
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시   (2)팝   (3)피크   " + "(4)펌프   (0)종료 : ");
			int menu = stdIn.nextInt();
			if (menu == 0) { break; }
			
			int x; // 데이터 임시 저장변수
			
			switch (menu) {
				case 1: // 푸시
					System.out.print("데이터 : ");
					x = stdIn.nextInt();
					try { // 문제없이 성공 시, 아무런 문제가 없을시 try
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) { // 오류 발생 시, 스택이 가득 찼을시 catch
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
					
				case 2: // 팝
					try {
					     x = s.pop();
					     System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 3: // 피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 4: // 덤프
					s.dump();
					break;
			}
		}
	}
}
