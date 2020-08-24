package Algorithm;
import java.util.Scanner;
// 재귀 사용 예, 팩토리얼 구하기(0! = 1, n > 0 이면 n! = n x (n-1)!  [n은 모두 자연수]
// 재귀 호출 방식의 매서드 만들기 Factorial 이란 함수에서 Factorial을 호출하면 직접 재귀, 서로 다른 매서드를 호출하면 간접 재귀라고 한다.
// 재귀 방식은 링크드 리스트마냥 계속해서 돌수있게 반환할 때 다른 매서드를 호출하는 방식으로 되어있다.
// 3이면 3! = 3 x 2! = > 3 x 2 = 6
// 2! = 2 x 1! => 2
// 1! = 1 x 0! => 1

public class Factorial {
	// 양의 정수 n의 팩토리얼을 반환합니다.
	static int factorial(int n) {
		if (n > 0)
			return n * factorial(n-1);
		else
			return 1;
	}
	// 만약 5를 factorial에 넣게되면
	// 5 x factorial(4)라는 공식이 나오고, factorial(4) = 4 x factorial(3) => factorial(3) = 3 x factorial(2) => factorial(2) = 2 x factorial(1) => factorial(1) = 1 x factorial(0)
	// 그냥 factorial(4) 이런식으로 써져있고 값이 없다면 당연히 계산이 되지않을것이다. 하지만ㅁ
	// 마지막에 factorial(0)은 else 조건에 포함되어 1이라는 값을 리턴을 하므로 factorial(1)은 그에 따라 1이되고, 그위에 factorial(2)는 2가되며, factorial(3), factorial(4) 등이
	// 역순으로 값이 나오게 된다. 이런방식의 함수를 재귀형 함수라고 한다. 즉, 맨 마지막값까지 값이 없는 공식을 입력하고, 마지막에 나오는 값에 의해서 순차적으로 역순으로 연결된 값들을
	// 정의하게 되어 함수에 값이 정의되는 형식이다.
	// 이러한 함수의 특징은 1. 바로 값이 정의되지 않는다 2. 마치 링크드 리스트처럼 꼬리물듯이 공식을 만들고, 최종 공식에는 꼭 값이 나온다 3. 그 최종 값을 이용하여 다시 역순으로 흘러가
	// 최초의 공식까지 값을 만든다.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
