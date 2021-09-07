package Sept7th;

public class Propagate {

  public static void main(String[] args) {

    String input = "";

    try {
      String reversedInput = reverse(input);
      System.out.println(reversedInput);
    } catch (EmptyStringException e) {
      /*
      You can leave this empty. It is something that you should never do
       */
      System.out.println(e.getMessage());
    }
    finally {//finally is ALWAYS executed
      System.out.println("Completed the reversal program execution");
    }

  }

  private static String reverse(String input) throws EmptyStringException {
    if(input.length()==0) {
      throw new EmptyStringException("The string length is empty. Hence cannot be reversed");
    }
    StringBuilder sb = new StringBuilder(input);
    return sb.reverse().toString();

  }
}
