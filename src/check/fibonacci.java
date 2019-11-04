package check;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 피보나치 배열은 0, 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 
		// 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
		// Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers. 
		// Given an integer N, find the sum of all even fibonacci numbers.
		// Input: N = 12, Output: 10 
		// 0, 1, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
		
		System.out.println("If you want to end the program, enter 100");
		
		while(true) {
		
			int iInputNumber;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Input number : ");
			
			iInputNumber = scan.nextInt();
			
			if(iInputNumber == 100) {
				System.out.println("Program End!");
				break;
			}
			
			System.out.println(solution(iInputNumber));	
		}
		
		// 재귀함수 비효율적
	}
	
	public static int solution(int input) {
	
		int output = 0;
		int i = 1;
		
		while(true) {

			int fiboResult = fibo(i);
			
			if(fiboResult > input) {
				break;
			}

			if(fiboResult % 2 == 0) {
				output = output + fiboResult;
			}
			
			i++;
			
			System.out.println("fiboResult : " + fiboResult);
		}
		
		return output;
	}
	
	public static int fibo(int iFiboInput) {
		
		int iFiboResult = iFiboInput;
		
		if(iFiboResult > 1) {
			iFiboResult = fibo(iFiboResult-2) + fibo(iFiboResult-1);
		} 
		
		return iFiboResult;
	}

}
