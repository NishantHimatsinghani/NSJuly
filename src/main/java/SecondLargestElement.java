public class SecondLargestElement {

  public static void main(String[] args) {
    int[] input = {45,56,567,679,2346,235,245,356,45756,878,789,689,7346,2345};
    System.out.println(findSecondLargestElement(input));
  }

  private static int findSecondLargestElement(int[] input) {
    /*
    6, 3,2,6, 7,8,9,23

    max = 23
    secondMax = 9

     */
    int n = input.length;

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for(int i = 0; i < n; i++) {

      if(input[i] > max) {
        int temp = max;
        max = input[i];
        secondMax = temp;
      } else  if(input[i] > secondMax){
        secondMax = input[i];
      }
    }
    return secondMax;
  }


}
