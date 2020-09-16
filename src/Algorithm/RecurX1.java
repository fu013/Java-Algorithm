package Algorithm;
import java.util.Scanner;
// ²¿¸® Àç±Í Á¦°ÅÇÏ±â

public class RecurX1 {
	public static void main(String[] args) {
		while(n > 0) {
			recur(n-1);
			System.out.println(n);
			n = n - 2;
		}
	}
}
