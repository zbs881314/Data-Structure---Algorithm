//method 1 java

public class Solution {
  public int firstUniqChar(String s) {
    int freq[] = new int[26];
    for(int i=0; i<s.length(); i++) {
      freq[s.charAt(i) - 'a'] ++;
    } 
    for(int i=0; i<s.length(); i++) {
      if(freq[s.charAt(i) - 'a']==1) {
        return i;
      }
    }
    return -1
  }
}

//method 2 python

def firstUniqChar(self, s):
  letters = 'abcdefghijklmnopqrstuvwxyz'
  index=[s.index(l) for l in letter if s.count(l) == 1]
  return min(index) if len(index) > 0 else -1
