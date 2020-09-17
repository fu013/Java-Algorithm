package Algorithm;
import java.util.Scanner;
// 하노이의 탑

// Description
/* 
	원반의 개수와 기둥의 개수가 같다고 가정했을 때,
	작은 원반이 제일 위에, 큰 원반이 제일 아래에 가게끔, 세개의 기둥 사이에서 각각 크기가 다른 원반을 정해진 규칙에 맞게 옮긴다.
	또한 한번에 원반은 1개씩만 옮길 수 있고, 큰 원반을 작은 원반 위에 쌓을 수 없다.
	방법 : 옮겨야 될 자리로 가장 작은 원반을 놓는다. 그다음으로 작은 순서대로 원반을 순서대로 배치한다.
	이러면 제일 큰 원반은 원래 있던 자리에 그대로 있고, 그보다 작은 나머지의 원반은 위에 방법대로 순서대로 배치되게 된다.
	그다음 제일 큰 원반을 제외하고 나머지 원반을 규칙에 맞게 제일위에 가장 작은 원반이 가게 쌓는다.
	그럼 제일 큰 원반이 옮길 자리에 갈수있게 자리가 만들어 진다. 자리가 만들어졌으므로 바로 제일 큰 원반을 옮길 자리에 옮겨준다.
	그다음 쌓여있던 원반들을 다시 모든 기둥에 아무렇게나 나열시킨다.
	그리고나서 그중 제일 큰 원반부터 옮길자리에 옮겨준다.
	혹은 만약 한번에 원반을 여러개 움직여도 된다는 규칙이 있다면, 
	제일 큰 원반을 제외한 나머지 원반을 모두 쌓은 형태를 그룹이라고 지정해놓고 그 그룹을 아예 제일 큰원반에 옮겨도 된다.
*/

// N개의 원반을 3번 기둥으로 옮기는 Method
public class Hanoi {
	// no 개의 원반을 x번 기둥에서 y번 기둥으로 옮김 
	// 기둥은 최대 3개 가지이므로 y의 값은 최대 3
	// y == 기둥의 번호 정수 1, 2, 3으로 나타냄, 기둥 번호의 합이 6이므로 중간 기둥은 6 - x - y 으로 구할 수 있다.
	static void move(int no, int x, int y) {
		if(no > 1)
			// no는 옮겨야 할 원반의 개수, x는 시작 기둥의 번호, y는 목표 기둥의 번호이다.
			// 기둥번호는 1, 2, 3 => 중간 기둥은 6 - x - y
			// 여기서 원반은 숫자가 클수록 크기가 큰 원반이다. 총 원반개수가 4개이면 원반[4]가 제일 큼
			// 제일 작은 원반은 무조건 원반[1]
			move(no - 1, x, 6 - x - y);
		
			// 6 - 2 - 1 == 3, 중간기둥은 3번기둥 6 - 1 - 3 = 2, 중간 기둥은 == 2번 기둥, 6 - 1 - 2 == 3, 중간기동은 == 3번기둥
		 	// 간단한 원리 : 총 3개의 기둥의합이 6이므로, 시작 기둥과 끝 기둥의 번호를 빼주면 나머지 하나의 기둥의 번호가 도출된다.
		
		System.out.println("원반[" + no + "]을" + x + "기둥에서" + y + "기둥으로 옮김");
		
		if(no > 1) 
			move(no - 1, 6 - x - y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = stdIn.nextInt();
		
		move(n, 1, 3); // 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
	}

}
