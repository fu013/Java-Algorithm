package Algorithm;
import java.util.Scanner;
// 버블 정렬 - 버전 1

public class Bubble_Sort {
	
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬, 매개변수로 배열 명과, 배열 총개수를 받는다.
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) { // 배열의 개수만큼 도는 바깥 포문, 3일때는 3번돔 0,1,2
			for (int j = n - 1; j > i; j--) { // n=3 일때 j=2, 2 > 0, 즉 2번돔
				// i = 0일때, j=2, x[1]과 x[2] 비교
				// 즉 처음 i = 0일때, j=1, x[0]과 x[1] 비교
				
				// i = 1일때, j > 1 고, j = 2이므로
				// x[1] x[2] 한번더 비교
				
				// i = 2 일때 j = 2 이므로 돌지 않음
				// 이리하여 모든 경우의 수를 비교하고 왼쪽으로 작은순으로 출력함
				
				if(a[j-1] > a[j]) { // x[1] > x[2] 이라면 
					swap(a, j-1, j); // x, 1, 2를 스왑 매서드에 넣는다.
					// 스왑 실행시 t = x[1], 임의로 x[1]의 값을 t에 저장
					// x[1] = x[2], x[1]에 x[2] 의 값을 저장한다(오름차순이므로 인덱스값이 크면 값도 더 커야하므로)
					// 여기서 x[1]은 x[2]보다 큰 상황
					// x[2] = t, t==x[1], 이므로 x[2]에 x[1]의 값을 저장한다
					// 따라서 스왑이 끝난후에 더 컸던 x[1]의 값이 x[2]로, x[2]는 x[1]으로 이동한다.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt(); // 배열 Length값 입력받음
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // 배열의 모든 인덱스에 인덱스 0부터 순서대로 값을 입력받음
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx); // 배열 x를 버블 정렬합니다. 배열 이름, 배열 개수
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

}
