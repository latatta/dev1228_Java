package koreait.day15;

public class MathTest {

	public static void main(String[] args) {
		// 소수의 개념 : 1보타 큰 자연수 중 1과 자기자신만을 약수로 가지는 수(prime number)
		// 예시 : 15는 약수 1, 3, 5, 15 -> 소수 x,		11의 약수 1, 11 -> 소수 o
		// 소수 판별수식을 생각해봅시다. 정수 num이 소수일까? 2부터 num-1까지 나누어서 나머지가 0인 값이 있으면 소수 x
		//			-> *num이 15일 때, 2에서 14까지 나누어서 나머지가 0이 있는지?	-> ***2 ~ 루트(재곱근) 값까지 나누기하면 됩니다.
		// 			-> **제곱근 대신 2부터 num/2까지 나누어서 할수도 있음
		
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(15));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(22));
		
		System.out.println("어떤 정수가 소수인지 확인해봅시다. 어떤 정수 입력 -> ");	
		int num = 21;
		boolean isPrime = true;
		
		// *
/*		for (int i = 2; i < num; i++) {	
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			
		}

		
		// **
		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			
		}
*/		
		
		// ***
		for (int i = 2; i < Math.sqrt(num); i++) {
			// num이 소수일 때 반복횟수가 가장 작은 조건식은 무엇인가요?	-> 	 별 세개짜리 반복문
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		
		if (isPrime)
			System.out.println(num + "은 소수입니다.");
		else System.out.println(num + "은 소수가 아닙니다.");
		
	}

}
