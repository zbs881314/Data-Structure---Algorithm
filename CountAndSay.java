public class Solution {
  public String countAndSay(int n) {
    StringBuilder curr=new StringBUilder('1')
    StringBuilder prev;
    int count;
    char say;
    for (int i=1; i<n; i++){
      prev = curr;
      curr = new StringBuilder();
      count = 1;
      say = prev.charAt(0);

      for (int j=1, len=prev.length(); j<len; j++){
        if (prev.charAt(j) != say){
          curr.append(count).append(say);
          count = 1;
          say = prev.charAt(j);
        }
        else count++;
      }
      curr.append(count).append(say);
    }
    return curr.toString();
  }
}


public String countAndSay(int n) {
  StringBuilder res = new StringBuilder('1');
  char[] curSeq = '1'.toCharArray();
  for (int i=1; i<n; i++) {
    res = new StringBuilder();
    int count = 1;
    for (int j=0; j<curSeq.length-1; j++) {
      if (curSeq[j] == curSeq[j+1]) {
        count++;
      } else {
        res.append(count+''+curSeq[j]);
        count = 1;
      }
    }
    res.append(count+''+curSeq[curSeq.length-1]);
    curSeq = res.toString().toCharArray();
  }
  return res.toString();
}


public String countAndSay(int n) {
  if(n==1)
    return '1'
    StringBuilder sb = new StringBuilder();

    String str = countAndSay(n-1);

    char c = '0';
    int count = 0;
    for (int i=0; i<str.length(); i++) {
      c = str.charAt(i);
      count = 1;
      while ((i+1)<str.length() && str.charAt(i+1)==c) {
        count++;
        i++;
      }
      sb.append(count+''+c);
    }
    return sb.toString();
}
