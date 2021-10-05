import java.text.DateFormat;

/*
Hello folks, lets wait a couple more minutes for other students to join over
In the mean time, if any one has any questions/doubts, please feel free to unmute yourselves and speak up OR type here in the chat and I would be glad to help you out

 */
public class Aug19thSnippets {
  public static void main(String[] args) {
    insertionSortDesc(false);
    timeComplexityExamples();
    findMaximumForce();

    DateFormat dateFormat = DateFormat.getInstance();

  }

  private static void findMaximumForce() {
    /*
    Given an array A of size n, and an integer k.
     Find the maximum force by involving only k elements.
     Force of an element is the square of its value.
     */

    int[] A = {123,1234,34,54,356,456};
    int n = A.length;
    int k = 3; //0 <= k <= n

    //find the k largest elements in this array
    //If we the sort the array, then we can fetch the k rightmost elements
    //you take care of overflow scenarios. i.e. when the total summation exceeds 2^32

  }

  private static void timeComplexityExamples() {

    /*
    Complexity Analysis of Algorithms :
      Time :
        --how long the programs takes time to give an output
          log(starttime);
          perform activity;
          log(endtime);
          endtime-starttime --> The runtime of my algorithm
          --This kind of analysis of platform and hardware dependent. So it is not of much use to programmers to coomunicate the efficiency of a program
          --We need to figure out to way to make our analysis calculation platform and hardware agnostic(independent)
          --What we use ? is the size of our input --> N is the size of our input(array, LL, etc)
          --Wherever we see constants, we ignore them
          --This analysis gives the capability to compare the efficiency of two different algorithms
      Space :
        --
     */
    determineComplexityConstantRuntime(10, 15);
    int[] input = {12,1234,235,6,4567,67,456};
    determineComplexityBigOofN(input);




  }

  private static void determineComplexityBigOofN(int[] input) {
    //we want to calculate the sum of all elements in this array
    //Time complexity : if the size of input is N -->
    int sum = 0; // 1 computation to assign 0 to sum
    for(int i = 0; i < input.length; i++) {
      sum = sum + input[i]; //2 operations per element
    } // 2*N computations to process through the for loop
    //1.....N == N operations
    //0....N-1 == N operations

    System.out.println(sum);// 1 computations to print

    //Total = 1 + 2N + 1 --> O(N)
  }

  private static void determineComplexityConstantRuntime(Integer a, Integer b) {
    int sum = a + b; //2 computations to calculate the sum, 1 to store in a variable
    //O(1) indicating that the processing of this piece of code is independent of the size of inputs passed to it
    System.out.println(sum);//1 computation to print it
    //Total = 2 + 1 + 1 = 4 --> Constant
  }

  private static void insertionSortDesc(Boolean isAscending) {
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
    4,4,0 currEle = 8
    8,4,0 currentEle = 0

     */

    //the first element is ALWAYS sorted.
    int n = input.length;

    for(int currentPointer = 1; currentPointer < n ; currentPointer++) {
      int currentElement = input[currentPointer];

      for(int backPointer = currentPointer - 1; backPointer >= 0; backPointer--) {

        if(currentElement > input[backPointer]) {
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
