package check;

import java.util.List;
import java.util.ArrayList;

public class bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수 n이 주어지면, n개의 여는 괄호 "("와 n개의 닫는 괄호 ")"로 만들 수 있는 괄호 조합을 모두 구하시오. (시간 복잡도 제한 없습니다).
		//Given an integer N, find the number of possible balanced parentheses with N opening and closing brackets.
		
		//예제)	Input: 1 Output: ["()"]
		//	   	Input: 2 Output: ["(())", "()()"]
		//		Input: 3 Output: ["((()))", "(()())", "()(())", "(())()", "()()()"]
	
		System.out.println(parenthesisPairs(2));
	}
	
	static List<String> parenthesisPairs(int n) {
	
		List<String> ans = new ArrayList();
		recurse(ans, "", 0, 0, n);
		return ans;
	}
	
	static void recurse(List<String> ans, String cur, int open, int close, int n) {
		
		if(cur.length() == n*2) {
			ans.add(cur);
			return;
		}
		
		if(open < n) {
			recurse(ans, cur+"(", open+1, close, n);
		}
		
		if(close < open) {
			recurse(ans, cur+")", open, close+1, n);
		}
		
	}

}
