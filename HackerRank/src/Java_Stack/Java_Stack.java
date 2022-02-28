package Java_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {
	

	public static boolean checkBalance(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}

		if(input.indexOf("}")<input.indexOf("{") || input.indexOf(")")<input.indexOf("(") || input.indexOf("]")<input.indexOf("["))
		{
			return false;
		}
		if(input.length()==0)
		{
			return true;
		}
		if(input.length()%2!=0)
		{
			return false;
		}
		
		return true;
		
	}
	public static boolean isBalanced(String s) {
	       Stack<Character> stack = new Stack<Character>();
	       for (int i = 0; i < s.length(); i++){
	           if (s.charAt(i) == '(') 
	               stack.push('(');
	           else if (s.charAt(i) == '{')
	               stack.push('{');
	           else if (s.charAt(i) == '[')
	               stack.push('[');
	           else if (s.charAt(i) == ')') {
	               if (stack.isEmpty()) return false;
	               if (stack.pop() != '(') return false;
	           }
	           else if (s.charAt(i) == '}') {
	               if (stack.isEmpty()) return false;
	               if (stack.pop() != '{') return false;
	           }
	           else if (s.charAt(i) == ']') {
	               if (stack.isEmpty()) return false;
	               if (stack.pop() != '[') return false;
	           }
	       }
	       return stack.isEmpty();
	   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isBalanced(input));
		}
		

	}

}



//int index = 0;
//while(true)
//{
//	
//	if(checkParanthesis("(")==false || checkParanthesis("[")==false  || checkParanthesis("{")==false ) 
//	{
//		return false;
//	}
//	index++;
//}
//public static boolean checkParanthesis(String character)
//{
//	return false;
//	
//}




//String[] para1 = new String[3];
//para1[0]="(";
//para1[1]="[";
//para1[2]="{";
//String[] para2 = new String[3];
//para2[0]=")";
//para2[1]="]";
//para2[2]="}";
//for (int j = 0; j < 3; j++) {
//	String p1 = para1[j];
//	String p2 = para2[j];
//	for (int i = 0; i < input.length(); i++) 
//	{
//		int index_1=input.indexOf(p1, i);
//		int index_2=input.indexOf(p2, i);
//		if(index_1==-1 && index_2==-1)
//		{
//			break;
//		}
//		if(index_1==-1 || index_2==-1)
//		{
//			return false;
//		}
//		if(Math.abs(index_2-index_1)%2!=0)
//		{
//			//System.out.println(input.charAt(index_1));
//			input = input.replace(input.charAt(index_1), 'I');
//			input =  input.replace(input.charAt(index_2), 'I');
//		}
//		else
//		{
//			return false;
//		}
//		//System.out.println(input);
//	}
//}
//
//
//return true;