public class Recursive26thAug {

  public static void main(String[] args) {
    //checkIfNumberIsPalindrome();
    implementAtoi();

    findLengthOfAString();
  }

  private static void findLengthOfAString() {
    String input = "";
    if(input==null) throw new RuntimeException();
    System.out.println(getLengthOfrStringRecursively(input));
  }

  private static int getLengthOfrStringRecursively(String input) {
    //Base case :
    if(input.length()==0) {
      return 0;
    }
    return 1 + getLengthOfrStringRecursively(input.substring(1));

  }

  private static void implementAtoi() {
    //Converting a string to integer
    //"123" --> 123
    //Cases : 1. Integer overflow...-2^32 till  2^32-1
    //2.Trailing and prefix spaces :         123
    //3.Handle non-digit characters
    String input = "123a";
    // 3 + 20 + 100 = 123
    //
    // input[i] + 10 * currResult
    //ASCII equivalent in Java:
    // every symbol is assigned a mathematical numeric value.
    //'0' -> 48
    //'1' -> 49
    //'2' -> 50
    //'3' -> 51
    //...'9' -> 58
    // 'a' -> 'z' and 'A' to 'Z'
    int result = 0;
    for(int i = 0; i < input.length(); i++) {
      Integer currDigit = input.charAt(i) - '0' ;//'3'
      result = 10 * result + currDigit;
    }//iterative

    //recursively ?
    try {
      System.out.println(getAtoIRecursively(input, input.length()));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  private static int getAtoIRecursively(String input, int length) throws Exception {
//    if(length == 0) {
//      return 0;
//    }
    if(length == 1) {
      return input.charAt(0) - '0';
    }
    //"123"
    //3 + 12 * 10
    // Take the digit in the unit place..
    //Add it to the integer that we get from the rest of
    //the string

    if(input.charAt(length-1) - '0' > 9) {
      throw new Exception("Not a valid integer");
    }

    return (input.charAt(length-1) - '0') +
        getAtoIRecursively(input, length-1)*10;
  }

  private static void checkIfNumberIsPalindrome() {
    int input = 1233215; //which reads the same forward and backward

    //we need to write a recursive program to achieve this
    //when we have to look at individual digits of a number,
    //we often use /10(gives me all the digits except the unit digit)
    // and %10(gives me the unit place digit) operations

    //If I have two numbers...both a copy of each other..
    /*
    input = 123321, duplicateInput = 123321
    input = 123321, duplicateInput = 12332
    input = 123321, duplicateInput = 1233
    input = 1233, duplicateInput = 123


     */


    //input = 123321, duplicateInput = 1
    //input = 12332, duplicateInput = 12
    int duplicateInput = input;
    try {
      checkPalindromeUsingRecursion(input, duplicateInput);
      System.out.println("The number " + input + " is a palindrome");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }


  }

  private static int checkPalindromeUsingRecursion(int input, int duplicateInput) throws Exception {
    if(duplicateInput == 0) {
      //base case
      return input;
    }else {
      input = checkPalindromeUsingRecursion(input, duplicateInput/10);
    }
    if(duplicateInput % 10 == input % 10) {
      return input/10;
    }else{
      throw new Exception("Number is not a palindrome");
    }
  }
}
