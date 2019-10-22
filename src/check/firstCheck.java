package check;

public class firstCheck {

	public static void main(String[] args) {
		
		// 홀수 일때 문자 가운대 출력
		// 짝수 일때 문자 가운대 2개 출력
		
		String base = "qwertyuias";
		
		int iLength = base.length();
		int iCheck1 = iLength / 2;
		int iCheck2 = iLength % 2;
		
		String result = null;
		
		if(iCheck2 == 0) {
			result = base.substring(iCheck1-1,iCheck1+1);
		} else {
			result = base.substring(iCheck1,iCheck1+1);
		}
		
		System.out.println(result);
	}
}
