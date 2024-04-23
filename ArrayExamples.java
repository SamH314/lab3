

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < (arr.length / 2); i += 1) {
    final int oldValue = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = oldValue;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];//newArray should be the one being updated
    }
    return newArray;//should return newArray, not arr
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int lowestCount = 1; // Track the count of lowest value
    for(double num: arr) {
      if(num < lowest) {
        lowest = num;
        lowestCount = 1; // Reset the count if a new lowest value is found
      } else if (num == lowest) {
        lowestCount++; // Increment the count if the current number equals the lowest value
      }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest || lowestCount > 1) { // Include one occurrence of lowest value
        sum += num;
      }
    }
    return sum / (arr.length - lowestCount);
}


}

