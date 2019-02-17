//#1 - Sort 10 schools around your house by distance:
insertion sort

//#2 - eBay sorts listing by the current Bid amount:
radix or counting sort

//#3 - Sport scores on ESPN:
quick sort

//#4 - Massive database (can't fit all into memory) needs to sort through past year's user data:
merge sort

//#5 - Almost sorted Udemy review data needs to update and add 2 new reviews:
insertion sort

//#6 - Temperature records for the past 50 years in Canada:
radix counting sort
quick sort

//#7 - Large user name database needs to be sorted. Data is very random:
merge sort
quick sort

//#8 - you want to teach sorting for the first time
bubble sort
selection sort




const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

function quickSort(array, left, right) {
  const len = array.length;
  let pivot;
  let partitionIndex;

  if (left < right) {
    pivot = right;
    partitionIndex = partition(array, pivot, left, right);

    //sort left and right
    quickSort(array, left, partitionIndex - 1);
    quickSort(array, partitionIndex + 1, right);
  }
  return array;
}

function partition(array, pivot, left, right){
  let pivotValue = array[pivot];
  let partitionIndex = left;

  for (let i = left; i < right; i++) {
    if(array[i] < pivotValue){
      swap(array, i, partitionIndex);
      partitionIndex++;
    }
  }
  swap(array, right, partitionIndex);
  return partitionIndex;
}

function swap(array, firstIndex, secondIndex){
  var temp = array[firstIndex];
  array[firstIndex] = array[secondIndex];
  array[secondIndex] = temp;
}

//select first and last index as 2nd and 3rd parameters

quickSort(numbers, 0, numbers.length-1);
console.log(numbers)
