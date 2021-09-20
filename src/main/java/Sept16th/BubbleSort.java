package Sept16th;

public class BubbleSort {

  public static void main(String[] args) {
    int[] input = {12,32,345,456,57,57,90,8,875,76,563,45,425,32,4,234,324,24,36,475858769,689};
    sort(input);
  }

  private static void sort(int[] input) {
    /*
      6 54 67 45 34 5 56 67 76
      Use Bubble Sort to sort this :
        --Take 2 elements
        --Compare the two elements
        --After first pass, the maximum element is sorted
        --we keep on making passes.
        --When do we stop ? :
          --when every element is sorted..when do we know every element is sorted? :
            --When no Swapping happens --> This indicates that the sorting is complete
     */

    boolean swap = true;//just to determine if a swap has happened.
    int end = input.length-1;
    while(swap) {
      swap = false;
      for(int i = 0; i<= end-1; i++) {
        if(input[i] > input[i+1]){
          swap(input, i, i+1);
          swap = true;
        }
        //if I do a swap here, then I will do swap = true
      }
      end--;
    }

    for(int i = 0; i < input.length; i++) {
      System.out.print(input[i] + " ");
    }

  }

  private static void swap(int[] input, int a, int b) {
    int temp = input[a];
    input[a] = input[b];
    input[b] = temp;
  }

}
