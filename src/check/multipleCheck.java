package check;

public class multipleCheck {

	public static void main(String[] args) {
		
		// x는 배수
		// n는 출력갯수
		// 배열에 담아서 출력
		
		int x = 4;
		int n = 3;
		
		long[] answer = {};
		
		answer = new long[n];
		      
		int iValue = 0;
		        
		for(int i=0;i<n;i++){
			iValue = x * (i+1);
		    answer[i] = iValue;
		}
		
		for(long test : answer) {
			System.out.println(test);
		}
	}
}
