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
	static void selectionSort(int[] a, int n)
		for (int i = 0; i < n -1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				swap(a, i, min); 
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
