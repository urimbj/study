package check;

public class dailyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수 배열(int array)이 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 시간복잡도는 O(n)
		// ex : in [-1,3,-1,5] out [7 // 3+(-1)+5]
		// ex : in [-5,-3,-1] out [-1 // -1]
		// ex : in [2,4,-2,-3,8] out [9 // 2+4+(-2)+(-3)+8]
		
		int[] array = {2,4,-2,-3,8};
		
		System.out.println("result : " + soulution(array));
	}
	
	public static int soulution(int[] arr) {
		
		int maxSum = arr[0];
		int currentSum = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			currentSum = Math.max(currentSum+arr[i], arr[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
	}

}
