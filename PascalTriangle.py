// Any row can be constructed using the offset sum of the previous row
//  1 3 3 1 0
//+ 0 1 3 3 1
//= 1 4 6 4 1
def generate(self, numRows):
  res = [[1]]
  for i in range(1, numRows):
    res += [map(lambda x, y: x+y, res[-1]+[0], [0]+res[-1])]
  return res[:numRows]


// method 2 java
//Two loops, one go through the row, one go through the column
//ArrayList
//calculate element value: K(i)(j) = K(i-1)(j-1)+K(i-1)(j) except for the first and last element

public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    if (numRows <= 0) {
      return triangle;
    }
    for (int i=0; i<numRows; i++) {
      List<Integer> row = new ArrayList<Integer>();
      for (int j=0; j<i+1; j++) {
        if (j==0 || j==i) {
          row.add(1);
        } else {
          row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
        }
      }
      triangle.add(row);
    }
    return triangle;
  }
}
