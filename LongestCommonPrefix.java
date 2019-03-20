public String longestCommonPrefix(String[] strs) {
  if(strs == null || strs.length == 0) return '';
  String pre = strs[0];
  int i = 1;
  while(i < strs.length) {
    while(strs[i].indexOf(pre) != 0)
      pre = pre.substring(0, pre.length()-1);
    i++;
  }
  return pre;
}


// javascrop

var longestCommonPrefix = function(strs) {
  if(strs == null || strs.length == 0) {
    return '';
  }
  strs.sort();
  var a = strs[0].split(''), b = strs[strs.length - 1].split('');
  var res = '';
  for(let i = 0; i < a.length; i++) {
    if(a[i] == b[i]) {
      res += a[i];
    } else {
      return res;
    }
  }
  return strs[0];
}


// python

class Solution:
  def longestCommonPrefix(self, strs):
    if not strs:
      return ''

    for i, letter_group in enumerate(zip(*strs)):
      if len(set(letter_group)) > 1:
        return strs[0][:i]

    else:
      return min(strs)
