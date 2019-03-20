function mergeSortedArrays(array1, array2) {
  const mergedArray = [];
  let array1Item = array1[0];
  let array2Item = array2[0];
  let i = 1;
  let j = 1;

  //check input
  if (array1.length === 0) {
    return array2;
  }
  if (array2.length === 0) {
    return array1;
  }

  while (array1Item || array2Item) {
    if (!array2Item || array1Item < array2Item) {
      mergedArray.push(array1Item);
      array1Item = array1[i];
      i++;
    } else {
      mergedArray.push(array2Item);
      array2Item = array2[j];
      j++;
    }
  }

  return mergedArray;
}


mergeSortedArrays([0, 3, 4], [4, 6, 30]);


// java

class Solution {
  public void merge(int A[], int m, int B[], int n) {
      int i = m-1;
      int j = n-1;
      int k = m+n-1;
      while(i>=0 && j>=0) {
        if(A[i]>B[j])
          A[k--] = A[i--];
        else
          A[k--] = B[j--];
      }
      while(j>=0)
        A[k--] = B[j--];
    }
}


// python

def merge(self, nums1, m, nums2, n):
  while m>0 and n>0:
    if nums1[m-1] >= nums2[n-1]:
      nums1[m+n-1] = nums1[m-1]
      m -= 1
    else:
      nums1[m+n-1] = nums2[n-1]
      n -= 1
  if n>0:
    nums1[:n] = nums2[:n]
