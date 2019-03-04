// python
class Solution(object):
  def twoSum(self, nums, target):
    if len(nums) <= 1:
      return False
    buff_dict = {}
    for i in range(len(nums)):
      if nums[i] in buff_dict:
        return [buff_dict[nums[i]], i]
      else:
        buff_dict[target - nums[i]] = i


// java HashMap
public int[] twoSum(int[], numbers, int target) {
  int[] result = new int[2];
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  for (int i = 0; i<numbers.length; i++) {
    if (map.containsKey(target - numbers[i])) {
      result[1] = i+1;
      result[0] = map.get(target - numbers[i]);
      return result;
    }
    map.put(numbers[i], i+1);
  }
  return result;
}

// Easy Understand
public int[] twoSum2(int nums, int target) {
  Map<Integer, Integer> map=new HashMap<>();
  for (int i=0; i<nums.length; i++) {
    map.put(nums[i], i);
  }
  for (int i=0; i<nums.length; i++) {
    int sub=target-nums[i];
    if (map.containsKey(sub) && map.get(sub) != i) {
      return new int[] {i, map.get(sub)};
    }
  }
  throw new IllegalArgumentException('No two sum solution');
}

// simplify two for loop
public int[] twoSum2(int nums, int target) {
  Map<Integer, Integer> map=new HashMap<>();
  for (int i=0; i<nums.length; i++) {
    int sub = target-nums[i];
    if (map.containsKey(sub)) {
      return new int[] {i, map.get(sub)};
    }
    map.put(nums[i], i);
  }
  throw new IllegalArgumentException('No two sum solution')
}
