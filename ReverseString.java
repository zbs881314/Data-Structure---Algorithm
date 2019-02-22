class Solution {
  public String reverseString(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0, j = chars.length - 1; i<j; i++, j--) {
      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
    }
    return new String(chars);
  }
}

class Solution {
  public String reverseString(String s) {
    char[] word = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      char temp = word[i];
      word[i] = word[j];
      word[j] = temp;
      i++;
      j--;
    }
    return new String(word);
  }
}

// method2 python
class Solution(object):
	def reverseString(self, s):
		return s[::-1]
