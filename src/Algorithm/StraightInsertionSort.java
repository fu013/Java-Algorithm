package Algorithm;
import java.util.Scanner;
// 단순 삽입 정렬
// 단순 선택 정렬은 모든 인덱스를 돌고 제일 작은값을 계속해서 왼쪽으로 밀어넣었는데
// 단순 삽입 정렬은 0번째 인덱스와 그다음 인덱스부터 비교를 시작하여 한 인덱스씩 이동하면서 오름차순을 정렬하는데
// 모든 인덱스를 도는게아니라 이미 비교가 끝난 인덱스들과 비교해서 위치를 결정한다.
// 배열의 요소를 알맞은 위치에 삽입하는 개념이다.

public class StraightInsertionSort {
	// 단순 삽입 정렬
	
	static void insertionSort(int [] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("단순 삽입 정렬");
		System.out.println("요솟수 : ");
		
		int nx = stdIn.nextInt(); // 배열 Length값 입력받음
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // 배열의 모든 인덱스에 인덱스 0부터 순서대로 값을 입력받음
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		insertionSort(x, nx); // 배열 x를 버블 정렬합니다. 배열 이름, 배열 개수
		
		System.out.println("오름차순으로 단순삽입 방식으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

}
