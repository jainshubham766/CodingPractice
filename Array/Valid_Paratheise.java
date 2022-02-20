/*
 https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 * */

class Solution {

//     public static boolean isOpening(char c){
//         if (c=='['  || c=='('   || c=='{') return true;
//         return false;
//     }


//     public static boolean isClosing(char c){
//         if (c==']'  || c==')'   || c=='}') return true;
//         return false;
//     }

//     public boolean isValid(String s) {
//         Stack <Character> stack = new Stack<>();
//         for (int i=0;i<s.length();i++){

//             if (Solution.isOpening(s.charAt(i))){
//                 stack.push(s.charAt(i));
//                 continue;
//             }

//             if (stack.empty())  return false;
//             else if (Solution.isClosing(s.charAt(i))){
//                 char check = stack.peek();

//                 switch(check){
//                         case '{': if (s.charAt(i)=='}') stack.pop();
//                             else return false;
//                             break;
//                         case '[': if (s.charAt(i)==']') stack.pop();
//                             else return false;
//                             break;
//                         case '(': if (s.charAt(i)==')') stack.pop();
//                             else return false;
//                             break;

//                 }
//             }

//         }
//         return stack.empty();
//     }

    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.empty();
}
}
