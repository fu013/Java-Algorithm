package Algorithm;
import java.util.Scanner;
// 선형검색 알고리즘
// 배열의 0번째 인덱스 부터 순차적으로 키를 찾고, 검색한 키값이 해당 배열에 존재한다면 그 인덱스값을 리턴하고 실행종료, 혹은 배열의 끝까지 다돌았는데
// 일치하는 값이 없다면 또한 마찬가지로 실행종료

public class LinearSearching {
	// 클라이언트에게 특정값들을 입력받아 배열을 만들고, 각 인덱스값을 부여한 후, 키값을 검색하여
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
	
	// 검색한 요소의 인덱스를 반환하는 매서드 seqSearch 생성
	static int seqSearch(int[] a, int n, int key) { // 생성된 배열명, 생성된 배열의 Length값, 입력받을 키값
		int i = 0; 
		// 배열 요소의 인덱스를 가리키는 변수 i , 해당 배열의 Length값과 같을때 -1을 리턴하며 함수실행이 종료된다.
		// 또는 해당배열이름[i] 의 키 값이 입력받은 키값과 같다면 또한 i값을 리턴하며 함수실행이 종료된다.
		
		while(true) { // 기본적으로 무한 루프인 while문 = for(;;) , 특정 조건 만족시 return 값을 반환하며 종료됨
			if (i == n) { // 루프가 끝까지 다돌았을경우, 즉 값이 false 일 경우
				return -1; // 검색 실패(-1을 반환)
			}
			
			if (a[i] == key) { // 배열 인덱스중 키값이 입력받은 키값과 같은것이 있다면 그 인덱스를 반환
				return i; // 검색 성공(인덱스를 반환)
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // Scanner 클래스 선언
		
		System.out.print("배열의 Length 입력 : ");
		int num = stdIn.nextInt(); 
		int[] x = new int[num]; // 요솟수가 num인 배열을 입력받음
		
		System.out.println("입력받은 X 배열의 Length값은 " + x.length + "입니다. "); // 값 확인
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]에 넣을 키값을 입력 : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt(); // 사용자가 입력한 키값을 변수에 저장
		
		int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소만 검색, x는 배열명, num은 배열의 총 Length, ky는 입력받은 키값
		
		if (idx == -1) { // 루프를 다돌았는데도 값이 없다면
			System.out.println("그 값의 요소가 없습니다.");
		} else { // 루프를 돌다가 같은값이 하나라도 검색된다면
			System.out.println(ky + "은(는) x[" + idx +"]에 있습니다.");
		}
	}
}
