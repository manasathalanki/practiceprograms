package com.wissen.review;

import java.util.Stack;

public class Parathesis {

	public static void main(String[] args) {
		String str = ")()(";
		Stack<Integer> st =new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='(')
				st.push(i);
			else if(str.charAt(i)==')')
				if(!st.isEmpty() && str.charAt(st.peek()) == '(')
                    st.pop();
				else
					st.push(i);
		}
		System.out.println(st.size()-1);
		
		
		
		
//		StringBuilder sb = new StringBuilder();
//		char[] ch = str.toCharArray();
//		int open = 0;
//		for (char c : ch) {
//			if (c == '(') {
//				open++;
//			} else if (c == ')') {
//				if (open == 0) {
//					continue;
//				}
//				open--;
//			}
//			sb.append(c);
//		}
//		System.out.println(sb + "open::" + open);
//		StringBuilder result = new StringBuilder();
//		for (int i = sb.length() - 1; i >= 0; i--) {
//			if (sb.charAt(i) == '(' && open-- > 0)
//				continue;
//			result.append(sb.charAt(i));
//		}
//		System.out.println(result.reverse().toString());
//	}
		
		
	}

}
