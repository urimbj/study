package check;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 
		// 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 
		// 단, 정수를 문자열로 바꾸면 안됩니다.
		// Given an integer, check if it is a palindrome.
		// 예제)	Input: 12345	Output: False
		//		Input: -101		Output: False
		//		Input: 11111	Output: True
		//		Input: 12421	Output: True
		//		Input: 1221		OutPut: True
		//		Input: 123321	OutPut: True
		//		Input: 2551		OutPut: False
	
		System.out.println(solution(123321));
	}
	
	public static boolean solution(int iInput) {
		
		boolean rValue = false;
		
		if(iInput > 0) {
			
			int iInputLength = (int)(Math.log10(iInput)+1);
			int iPalinValue = iInput;
			int iPalinResult = 0;
			
			while(true) {
				
				if(iInputLength == 0) {
					if(iPalinResult == iInput) {
						rValue = true;
					}
					
					break;
				}
				
				iPalinResult = iPalinResult * 10 + iPalinValue % 10;
				iPalinValue = iPalinValue / 10;
				iInputLength = iInputLength - 1;
			}
		}
		
		return rValue;
	}

}
