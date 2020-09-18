package Algorithm;
import java.util.Scanner;
// 배열을 나눕니다.

public class Partition {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열을 나눕니다.
	static void partition(int[] a, int n) {
		int pl = 0; // 왼쪽 커서, 시작 인덱스(0번째 배열)
		int pr = n - 1; // 오른쪽 커서, 끝 인덱스(배열은 0부터 시작하므로 배열개수 - 1)
		int x = a[n / 2];// 피벗(카운데 위치의 값)
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while(pl <= pr);
	
		System.out.println("피벗의 값은 " + x + "입니다.");
	}
	
	public static void main(String[] args) {
		
	}
	
}
