package Sept7th.lab;

public class QuickSort {

  public static void main(String[] args) {
    Integer[] input = {213,56,578,8987,58,2312,457,78689,790,689,568,5,245};

    quickSort(input);


  }

  private static void quickSort(Integer[] input) {
    /*
    This is a Divide and Conquer Algorithm...
    In these algorithms, we divide our bigger/difficult problems into smaller/easier subproblems.
    This easy sub-problem is solved manually
    Then combine the results to get the required result..

    QuickSort :
      --Select a partition key///this basically divides my array into two parts(preferably equal)
      --the left part will contain values that are lesser than the partition key value
      --the right part will contain values that are greater than or equal to the partition key value.

      --Now, we keep on applying the same logic in these individual two part.

    for each (unsorted) partition
    set first element as pivot

      storeIndex = pivotIndex + 1

      for i = pivotIndex + 1 to rightmostIndex

        if element[i] < element[pivot]

          swap(i, storeIndex); storeIndex++

      swap(pivot, storeIndex - 1)
     */
    //current array : using indexes....initially, it is my entire array
    int startIndex = 0;
    int endIndex = input.length-1;


    quickSortUtil(input, startIndex, endIndex);

  }

  private static void quickSortUtil(Integer[] input, int startIndex, int endIndex) {



    //select a partition key..
    //suppose we select the last element of the current array as the partition point
    if(startIndex <= endIndex) {
      int parititionKey = input[endIndex];
      //here, you can select any random index between start and end
      //You can use a Random Partition Key generator to generate the paritionKey for you...

      //start to paritionKeyIndex-1.........partitionKeyIndex + 1 to endIndex
      int partitionKeyIndex = partitionUsingKey(input, startIndex, endIndex, parititionKey);

      quickSortUtil(input, startIndex, partitionKeyIndex - 1);
      quickSortUtil(input, partitionKeyIndex + 1, endIndex);
    }

  }

  private static int partitionUsingKey(Integer[] input, int startIndex, int endIndex, int parititionKey) {
    //It is the sorted position of the partitionKey

    int partitionKeyIndex = 0;



    return partitionKeyIndex;

  }


}
