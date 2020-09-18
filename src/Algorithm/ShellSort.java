package Algorithm;
import java.util.Scanner;
// 셸 정렬 버전 - 1
// 각 요소들을 그룹으로 나눠 요소 이동횟수를 전 정렬들에 비해 많이 줄인 정렬이다.
// 1. 각 0부터 4 배수의 인덱스 요소끼리 비교하여 오름 차순 정렬, 왼쪽으로 작은수가 몰리므로 오름차순 정렬이 된 상태에 가까워짐.
// 2. 각 0부터 2 배수의 인덱스 요소끼리 비교하여 오름 차순 정렬, 왼쪽으로 작은수가 몰리므로 오름차순 정렬이 된 상태에 가까워짐.
// 3. 모든 인덱스 요소끼리 비교하여 정렬(위에 과정을 마치고 나서 정렬하는것이므로 일반적으로 정렬하는것보다 더 빠르게 정렬됨)

public class ShellSort {
	// 셸 정렬
	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2) { // h = h / 2
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j-= h) {
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("셸 정렬 버전 - 1");
		System.out.println("요솟수 : ");
		
		int nx = stdIn.nextInt(); // 배열 Length값 입력받음
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) { // 배열의 모든 인덱스에 인덱스 0부터 순서대로 값을 입력받음
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		shellSort(x, nx); // 배열 x를 버블 정렬합니다. 배열 이름, 배열 개수
		
		System.out.println("오름차순으로 셸 방식으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}
}
