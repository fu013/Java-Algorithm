package Algorithm;
import java.util.Scanner;
// 단순 선택 정렬 버전 - 1 

public class StraightSelectionSort {
	
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 단순 선택 정렬
	static void selectionSort(int[] a, int n) // Argument a: array's Name, n: array's Length
		for (int i = 0; i < n -1; i++) { // 배열의 개수 - 1 만큼 도는 바깥 포문, Length: 즉, 3이면 2번돔(0, 1)
			int min = i; // a[i], ..., a[n-1]에서 가장 작은 값을 가지는 요소의 인덱스
			for (int j = i + 1; j < n; j++) { // n=3이고, j는 i=0일때, j =1, j < 3, j++; 1,2 배열의 개수 -1만큼 돔, 시작은 무조건 1부터
				if (a[j] < a[min]) { // i가 0일때, j = 1, min = a[0]
					// a[1], a[2] < a[0] 인지 비교함, 만약 a[j] < a[min] 이라면 min = j
					// 0이랑 모든 인덱스를 비교해봤을때 0보다 작은게 있다면 그것을 min 인덱스 으로 설정함
					min = j;
					// 따라서 a[min]은 최소값을 가진 인덱스를 가진 배열을 의미한다.
				}
				swap(a, i, min); // 작은걸 왼쪽으로 스왑하면서 오름차순으로 정렬해준다. 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("단순 선택 정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt(); // 배열 Length값 입력받음
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // 배열의 모든 인덱스에 인덱스 0부터 순서대로 값을 입력받음
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		selectionSort(x, nx); // 배열 x를 버블 정렬합니다. 배열 이름, 배열 개수
		
		System.out.println("오름차순으로 단순선택 방식으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}
}	
