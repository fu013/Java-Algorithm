package Algorithm;
import java.util.Scanner;
// 이진 검색 알고리즘 (오름차순)
// 전제 조건 : 데이터가 키 값으로 이미 정렬(sort)되어 있다, 오름차순 혹은 내림차순으로 정렬되있어야 한다.
// 이진 검색은 선형 검색보다 좀 더 빠르게 검색할 수 있다는 장점이 있다. 하지만 선형 검색은 정렬되있지않아도 활용가능하다.
// 중간 지점의 인덱스 키값을 비교하여 검색 범위를 줄여가며 값을 도출한다.

public class BinarySearch { // 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스, 배열의 인덱스는 기본적으로 0 에서 시작하므로 Default pl값은 0으로 두고 시작한다.
		int pr = n - 1; // 검색 범위의 끝 인덱스, n 은 배열의 length(총 갯수)를 의미하므로 n-1이면 인덱스중 가장 끝 인덱스를 의미한다.
		
		do { // 일단 처음에 한번은 실행하고나서 그다음 실행부터 while문의 조건문을 적용하고 반복함.
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스, 정수형은 뒤에 소수점 자리를 모두 생략하므로 예를들어 3.9가나오든 3.3이나오든 모두 3, 반올림을 하지않는다.
			// 검색 시작지점 3, 끝 4 일때는 따라서 앞에 3먼저 탐색한다.( 7 / 2 = 3.5 => 3)  
			if (a[pc] == key) { 
				return pc; // 검색 성공!
			} else if (a[pc] < key) { // 검색 범위의 첫 인덱스를 중간 +1 지점으로 하여 검색 범위를 중간 위쪽부터 끝으로 좁힌다..
				pl = pc + 1; 
			} else { // 찾으려는 값이 중간값도 아니고, key값보다도 작을때, pl은 0 그대로 나두고 pr만 중간값에서 -1을 한 인덱스로 설정하여 처음 ~ 중간 -1 지점으로 검색 범위를 좁힌다.
				pr = pc - 1; 
			}
		} while ( pl <= pr ); // 첫 검색지점이 끝 검색지점과 같거나 작다면 -1 (false)를 출력, 마지막 최종 검색때는 첫지점과 끝지점이 같아지고 한번더 검색이 필요하므로 false
		// 예를 들어 4가 마지막 인덱스이고 검색 범위의 첫지점이 4 끝지점이 4가 되었으면 4+4 / 2 해서 4번째 인덱스의 값이 검색한 값과 같은지 도출해야한다.
		// 검색을 계속 하고있다면 첫지점이 끝지점보다 같을수없고 작을것이기 때문에, 아직 값을 찾지못하여 검색을 진행중이므로 false
				return -1; // 검색 실패, true일땐 해당 인덱스값을 반환
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열의 Length값을 입력 : ");
		int num = stdIn.nextInt(); // 입력받은 Length값을 num에 저장(int타입의 입력값만 받음)
		int [] iMolly = new int[num]; // 인덱스 개수가 num인 배열 iMolly 생성
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("배열의 첫번째 인덱스를 입력하세요 - iMolly[0] : ");
		iMolly[0] = stdIn.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("배열의 해당 인덱스를 입력하세요(오름차순이 아니면 다시입력) - iMolly[" + i + "] : ");
				iMolly[i] = stdIn.nextInt();
			} while (iMolly[i] < iMolly[i - 1]);
			// 일단 첫 입력은 받고 그다음 입력시, 조건에 따라 입력받은 값이 바로 앞의 요소보다 작으면 변수에 입력값 저장 아닐시 다시 입력
		}
		
		System.out.print("검색할 값 : "); // 키 값을 입력
		int ky = stdIn.nextInt();
		
		int idx = binSearch(iMolly, num, ky);  // 배열 iMolly 에서 키 값이 ky 요소를 검색하고, 키값이 존재한다면 
		// 해당 키 인덱스 값을 idx에 가져와 저장, 없으면 -1을 가져온다.

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) iMolly[" + idx + "]에 있습니다.");
		}
	}
}
