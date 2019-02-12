let counter = 0;
function inception() {
  console.log(counter)
  if (counter > 3) { //the base case
    return 'done!';
  }
  counter++;
  return inception(); // the recursive case
}

inception()


// 1. Identify the base case
// 2. Identify the recursive case
// 3. Get closer and closer and return when needed. Usually you have 2 returns


function findFactorialRecursive(number) {
  if (number === 2) {
    return 2;
  }
  return number * findFactorialRecursive(number-1);
}

findFactorialRecursive(5)


function findFactorialIterative(number) {
  let answer = 1;
  if (number === 2) {
    answer = 2;
  }
  for (let i = 2; i <= number; i++) {
    answer = answer * i;
  }
  return answer;
}

findFactorialIterative(5)
