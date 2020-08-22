package Algorithm;
import java.util.Scanner;
// 선형검색 알고리즘 + 보초법
// 배열의 마지막에 입력받은 키값을 넣어둬서, 와일문이 해당 키값을 찾으면 break해서 빠져나가는 형식
// 만약 값을 찾지못해도 배열인덱스의 끝 + 1 지점에 key 보초값을 넣어뒀기때문에 무조건 while문은 break 된다.
// 책 120쪽에서 자바에서 기본적으로 제공하는 매서드인 binarySearch 매서드로 기본 자료형 배열에서 이진 검색을 하는 매서드를 사용하여 이진검색도 가능하다
// 기본적인 사용법 => Arrays.binarySearch(x, ky); x는 배열이름, ky는 키값이다, 이 매서드는 true일때 해당 배열의 인덱스를 반환한다.

public class LinearSearchingSentinel {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; // 요소의 끝 + 1 지점에 보초를 추가, 입력받은 값을 넣어둠
		
		while (true) {
			if (a[i] == key) { // 검색 성공, 만약 입력받은 값이 없더라도 배열 마지막 인덱스값으로 입력받은 값을 넣어뒀기때문에 반복문이 끝까지 돌면 와일문을 빠져나감.
				break;
			}
			i++;
		}
		return i == n ? -1 : i; // i == n이 참일 경우 -1을 반환, 거짓일 경우 i, 즉 요소 인덱스를 반환
		// 현재 탐색하고있는 인덱스가 보초인덱스라면 -1 (검색 실패), 검색인덱스가 아니라면(=> 와일문을 통해 i 값은 이미 결정남), i 번째 인덱스에
		// 입력받은 키값과 같은 키값이 있어 보초인덱스 도달전에 break 되었다는 의미이므로 i 인덱스값을 반환한다.
		// n은 num값 즉, 배열의 최종 인덱스 + 1 (Length) 값이다. i 는 인덱스를 의미하므로, 인덱스가 만약에 일반적인 인덱스범위를 다 탐색하고나서,
		// 보초로 넣은 마지막 더미 인덱스를 돈다면, 입력받은 값이 배열에 존재하지 않다는 의미이므로 false를 출력한다.
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("naong 배열의 Length 값을 입력 : ");
		int num = stdIn.nextInt(); // Length 값을 int 타입의 num 변수에 저장
		int[] naong = new int[num + 1]; // 배열 생성자, naong 배열은 선언할 때, 입력받은 값 + 보초의 공간을 위해 + 1을 더해서 인덱스 길이를 설정한다.
		 
		for (int i = 0; i < num; i++) {
			System.out.print("naong 배열의 인덱스 naong[" + i +"]에 넣을 값을 입력 : ");
			naong[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 클라이언트로부터 키 값을 입력 받음
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(naong, num, ky);
		
		if (idx == -1) { // 검색값이 없을 때
			System.out.println("그 값의 요소가 없습니다. \n실행을 종료합니다.");
		} else {
			System.out.println(ky + "은(는) naong[" + idx +"]에 있습니다. \n실행을 종료합니다.");
		}
	}
}
