package Algorithm;
import java.util.Comparator;
// 클래스 X의 내부에서 Comparator 정의
public class X {
	// 필드 매서드 등
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<T> {
		public int compare(T d1, T d2) {
			// d1이 d2보다 크면 양의 값 반환
			// d1아 d2보다 작으면 음의 값 반환
			// d1이 d2와 같으면 0 반환
		}
	}
}
