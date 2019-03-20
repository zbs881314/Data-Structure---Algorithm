public boolean isValid(String s) {
  Stack<Character> stack = new Stack<Character>();
  for(char c: s.toCharArray()) {
    if(c == '(')
      stack.push(')');
    else if(c == '{')
      stack.push('}');
    else if(c == '[')
      stack.push(']');
    else if(stack.isEmpty() || stack.pop() != c)
      return false;
  }
  return stack.isEmpty();
}


// python
class Solution:
  def isValid(self, s):
    stack = []
    dict = {']':'[', '}':'{', ')':'('}
    for char in s:
      if char in dict.values():
        stack.append(char)
      elif char in dict.keys():
        if stack == [] or dict[char] != stack.pop():
          return False
      else:
        return False
    return stack == []


// java

public class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    //Iterate through string until empty
    for(int i=0; i<s.length(); i++) {
      //push any open parentheses onto stack
      if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
        stack.push(s.charAt(i));
      // check stack for corresponding closing parentheses, false is not valid
      else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
        stack.pop();
      else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
        stack.pop();
      else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
        stack.pop();
      else
        return false
    }
    // return true if no open parentheses left in stack
    return stack.empty();
  }
}
