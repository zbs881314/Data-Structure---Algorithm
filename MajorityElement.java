class Solution {
  public int majorityElement(int[] num) {
    int major = num[0], count = 1;
    for (int i = 1; i<num.length; i++) {
      if(count == 0) {
        count++;
        major=num[i];
      }
      else if (major==num[i]) {
        count++;
      } else count--;
    }
    return major;
  }
}


// quick sort

class Solution {
  public int majorityElement(vector<int> & nums) {
    if (nums.size() == 0) {
      //special case
      return -1;
    }
    int start = 0, end = nums.size() - 1;
    int index = partition(nums, start, end);
    while (index != (nums.size() / 2)) {
      if(index > nums.size()/2) {
        //majority element will certainly be in the left part
        end = index - 1;
        index = partition(nums, start, end);
      }
      else if(index < nums.size()/2) {
        //majority element will certatnly be in the right part
        start = index + 1;
        index = partition(nums, start, end);
      }
    }
    return nums[nums.size()/2];
  }
  private int partition(vector<int> & nums, int begin, int end) {
    int value = nums[begin];
    while(begin < end) {
      while(begin < end && value < nums[begin]) {
        --end;
      }
      if(begin < end) {
        nums[begin++] = nums[end];
      }
      while(begin < end && value > nums[begin]) {
        ++begin;
      }
      if(begin < end) {
        nums[end--] = nums[begin];
      }
    }
    nums[begin] = value;
    return begin;
  }
}

// Moore

class Solution {
  public int majorityElement(vector<int> & nums) {
    if (nums.size() == 0) {
      return -1;
    }
    int num = nums[0], count = 1;
    for (int i = 1; i < nums.size(); ++i) {
      if(nums[i] == num) {
        ++count;
      }
      else {
        --count;
        if (count == 0) {
          num = nums[i];
          count = 1;
        }
      }
    }
    return num;
  }
}
