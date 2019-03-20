public class MinStack {
  long min;
  Stack<Long> stack;

  public MinStack() {
    stack = new Stack<>();
  }

  public void push(int x) {
    if(stack.isEmpty()) {
      stack.push(0L);
      min = x;
    } else {
      stack.push(x-min);
      if(x<min) min = x;
    }
  }

  public void pop() {
    if(stack.isEmpty()) return;
    long pop = stack.pop();
    if(pop<0) min = min-pop;
  }

  public int top() {
    long top = stack.peek();
    if(top>0) {
      return (int)(min);
    }
  }

  public int getMin() {
    return (int)min;
  }
}



class MinStack {
  int min = Integer.MAX_VALUE;
  Stack<Integer> stack = new Stack<Integer>();
  public void push(int x) {
    // only push the old minimum value when the current
    // minimum value changes after pushing the new value x
    if(x <= min) {
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public void pop() {
    // if pop operation could result in the changing of the current minimum value
    // pop twice and change the current minimum value to the last minimum value
    if(stack.pop() == min) min = stack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }
}

// python

class MinStack:
  def __init__(self):
    self.q = []

  def push(self, x):
    curMin = self.getMin()
    if curMin == None or x < curMin:
      curMin = x
    self.q.append((x, curMin));

  def pop(self):
    self.q.pop()

  def top(self):
    if len(self.q) == 0:
      return None
    else:
      return self.q[len(self.q) - 1][0]
  
  def getMin(self):
    if len(self.q) == 0:
      return None
    else:
      return self.q[len(self.q) - 1][1]
