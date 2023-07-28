// Sort Colors Problem of LeetCode

/* ===== Time Complexity: O(n) =====
    ===== Space Complexity: O(1) =====
*/

// Function to sort the array
let sortColors = function (arr) {
  let curr = 0;
  let j = arr.length - 1;

  let i = 0;

  // Loop to sort the array
  while (curr <= j) {
    if (arr[curr] == 0) {
      let temp = arr[curr];
      arr[curr] = arr[i];
      arr[i] = temp;

      i++;
      curr++;
    } else if (arr[curr] == 2) {
      let temp = arr[curr];
      arr[curr] = arr[j];
      arr[j] = temp;

      j--;
    } else {
      curr++;
    }
  }
};

let arr = [2, 0, 2, 1, 1, 0];  // Input Array
sortColors(arr);    // Function Call
console.log(arr);       // Output Array
