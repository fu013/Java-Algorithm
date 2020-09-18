package Algorithm;
import java.util.Scanner;
// 퀵 정렬 part - 1
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
		int x = a[n / 2]; // 피벗(카운데 위치의 값)
		
		do {
			while (a[pl] < x) pl++; // a[pl] 값이 a[x] 보다 작을경우 x보다 작은선에서 인덱스 ++
			while (a[pr] > x) pr--; // a[pr] 값이 a[x] 보다 작을경우 x보다 작은선에서 인덱스 --
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while(pl <= pr);
	
		System.out.println("피벗의 값은 " + x + "입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i = 0; i <= pl - 1; i++) { // a[0] ~ a[pl-1]
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		if(pl > pr + 1) {
			System.out.println("피벗과 일치하는 그룹");
			for (int i = pr + 1; i <= pl - 1; i++) { // a[pr + 1] ~ a[n - 1]
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.println("배열을 나눕니다.");
		System.out.print("요솟수 : ");
		int nx = stdln.nextInt(); // 배열 Length값 입력받음
		int[] x = new int[nx];
		
		
		for (int i = 0; i < nx; i++) { // 배열의 모든 인덱스에 인덱스 0부터 순서대로 값을 입력받음
			System.out.print("x[" + i + "] : ");
			x[i] = stdln.nextInt();
		}
		
		partition(x, nx); // 배열 x를 나눕니다.
	}
	
}
