package Algorithm;
import java.util.Scanner;
// 원하는 개수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장
// 최근에 입력한 N개의 데이터만 링 버퍼에 남아있게 하기, 입력은 무제한으로 가능, 오래된 데이터를 자동으로 버려지게 하고, 최근 데이터만 사용할 경우에 주로 사용.

public class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; // 입력 받은 값을 저장, 개수가 10개인 배열 생성
		int cnt = 0; // 입력 받은 개수
		int retry; // 다시 한 번?
		
		System.out.println("정수를 입력하세요");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt(); // 0~9 인덱스에만 값을 넣어줌
			
			System.out.print("계속 할까요? (예.1 / 아니오.0) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) i = 0; // i가 만약 음수라면, i의 초기값은 = 0으로 설정
		
		for ( ; i < cnt; i++) // 정수형 서식 %d , %2d => i+1이 들어감, %d\n => a[i%N]의 값이 들어감
			System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);
	}
}
