package Algorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
// 신체검사 데이터 배열에서 이진 검색하기

public class PhysExamSearch {
	// 신체검사 데이터를 정의한다.
	static class PhyscData {
		private String name; // 이름
		private int height; // 키
		private double vision; // 시력
		
		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name; 
			this.height = height; 
			this.vision = vision;
		}
		
		// 문자열을 반환하는 매서드(정보 확인용)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// 오름차순으로 정렬하기 위한 Comparator 
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
						 (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = { // 키의 오름차순으로 정렬되어 있습니다.
				new PhyscData("너구리 1호", 172, 0.3),
				new PhyscData("너구리 2호", 182, 0.4),
				new PhyscData("너구리 3호", 192, 0.5),
				new PhyscData("너구리 4호", 202, 0.6),
				new PhyscData("너구리 5호", 212, 0.7),
		};
		System.out.print("몇 cm인 사람을 찾고 있나요?");
		int height = stdIn.nextInt(); // 키 값 입력
		int idx = Arrays.binarySearch(
					x, // 배열 x에서
					new PhyscData("", height, 0.0), // 키가 height인 요소를
					PhyscData.HEIGHT_ORDER // HEIGHT_ORDER에 의해 검색, 클래스 PhyscData에 속한 comparator HEIGHT_ORDER
				);
		
		if (idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]); // 자동으로 toString 매서드가 호출된다.
		}
	}
}
