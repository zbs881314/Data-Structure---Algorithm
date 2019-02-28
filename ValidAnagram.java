class Solution {
  public boolean isAnagram(String s, String t) {
    int[] alphabet = new int[26];
    for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
    for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
    for (int i : alphabet) if (i != 0) return false;
    return true;
  }
}


//method 2 python
class Solution(object):
  def isAnagram(self, s, t):
    if len(s) != len(t):
      return False
    alpha = {}
    beta = {}
    for c in s:
      alpha[c] = alpha.get(c, 0) + 1
    for c in t:
      beta[c] = beta.get(c, 0) + 1
    return alpha == beta


//method 3 python
class Solution(object):
  def isAnagram(self, s, t):
    return sorted(s) == sorted(t)
