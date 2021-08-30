import java.util.Arrays;
import java.util.Random;

public class TimeComplexity30thAug {

  public static void main(String[] args) {
    //whatIsTimeComplexity();
    //logNComplexity();
    binarySearch();
  }

  private static void binarySearch() {
    int[] input = generateRandomArray(100000);
    int targetSearchValue = input[0];
    Arrays.sort(input);
    //log100000 to the base 2 = 16.609640474437.


    int startIndex = 0 ;
    int endIndex = input.length-1;
    int counter = 0;
    while(startIndex <= endIndex) {
      int midIndex = startIndex + (endIndex - startIndex)/2;
      //( start + end )/2...the only reason is Integer overflow...2 to the power 32
      //I would suggest to read on integer data type

      if(input[midIndex] < targetSearchValue) {
        //it makes no sense to search the left part of array
        startIndex = midIndex ;
      } else if(input[midIndex] > targetSearchValue){
        //it makes no sense to search the right part of array
        endIndex = midIndex ;
      } else {
        System.out.println("We have found" + targetSearchValue + " the value in " + counter + " iterations");
        break;
      }
      counter++;
    }

  }

  private static void logNComplexity() {

    //Mathematically, what is logN :


    int N = 16;
    while(N > 0) {
      N/=2; // How many times will this loop execute ?? that is what logarithm is...
      //16 --> 8 --> 4 --> 2 --> 1 --> 0
      //In english, how many times do I have to divide N with the value 2 so that I get 0 == logN to the base 2
    }




  }

  private static void whatIsTimeComplexity() {
    int[] input = {12,23,34,4567,58,678,45,235,467,679,5684,790,790,57,246,235};

      //calculate the sum of this array
    int sum = 0;  //1operation for variable assignment
    for(int i = 0; i < input.length; i++) {
      sum=sum + input[i]; //C(where C is a constant) operation for increment.. this will be executed N times...
    }
    System.out.println(sum); // 1operation for printing the output

    //we need to print all the unique pairs of numbers from the input
    for(int i  = 0; i < input.length-1; i++) {
      for(int j = i+1; j < input.length; j++) {
        System.out.println(input[i] + " " + input[j]);//1 operation...
        /*
        For i = 0:
          this statement executes n-1 times
        For i = 1 :
          this statement executes n-2 times...
         */

        //Total Number = n-1 + n-2 + n-3 + n-4 + ....... + 3 + 2 + 1 = Sum of first N natural numbers
        //f(N) = N(N+1)/2 = (N2 + N)
        //N = 10 : f(N) = 100 + 10 = 110 .. . N term is contributing ~10% to the overall complexity
        //N = 10000 : F(N) = 100000000 + 100000 = 100100000 ..N term is contributing less than 1% to the overall complexity
        //makes us want to ignore the less significant terms from the overall formula
        //Overall complexity for this example to be O(N2)...
      }
    }


    //f(N) = 1 + CN + 1 = CN + 2
    /*
    C=2 : f(N) = 2 * 1000000000 = C * 1000000000
    ignoring the constants : the TC becomes :
      f(N) = N....O(N)


     */


  }


  public static int[] generateRandomArray(int N) {
    int[] input = new int[N];
    Random random = new Random();
    for(int i = 0 ; i < N; i++) {
      input[i] = random.nextInt();
    }
    return input;
  }

}
