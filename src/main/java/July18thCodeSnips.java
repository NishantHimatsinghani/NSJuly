public class July18thCodeSnips {

  public static void main(String[] args) {
    insertionSort();



  }

  private static void insertionSort() {
    //We assume that the left side of the input is already sorted.
    /*
    say there are 10 elements in the input,
      and we are at the 2nd element, we assume the 1st to be sorted. And accordingly we place the 2nd element in its sorted position.
        --The first two elements of the input would be sorted
      we are at the 3rd element, we assume the left 2 elements to be sorted.   And accordingly we place the 3rd element in its sorted position
        --The first three elements of the input would be sorted

      .........until we reach 10th element. we assume the left nine elements to be sorted. And accordingly we place the 10th element in its sorted position.
     */
    int[] input = {12,2134,1234,235,23,2345,56, 67,7,8,9,78,7,8,8,2};
    /*
    8, 7, 5
    8, 8, 5 currentEle = 7
    7,8,5 currentElement = 5
    7, 8, 8 | currentElement = 5
    7, 7, 8
    5, 7, 8



    4, 8, 0
    4, 8, 8 currentEle = 0
    4, 4, 8
     */

    //the first element is ALWAYS sorted.
    int n = input.length;

    for(int currentPointer = 1; currentPointer < n ; currentPointer++) {
      int currentElement = input[currentPointer];

      for(int backPointer = currentPointer - 1; backPointer >= 0; backPointer--) {

        if(currentElement < input[backPointer]) {
          //write a code that shifts the element at backPointer one to the right
          input[backPointer + 1] = input[backPointer];
        } else {
          //we reach here and that indicates it has reached its correct position
          input[backPointer+1] = currentElement;
          break;
        }

        if(backPointer == 0) {
          input[0] = currentElement;
        }

      }
      printArray(input);
    }

    //reverse the array here...


  }
  private static void printArray(int[] input) {
    for(int i = 0 ; i < input.length; i++) {
      System.out.print(input[i] + " ");
    }
    System.out.println();
  }

}
