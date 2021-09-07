package Sept7th;

public class EmptyStringException extends Exception {
  /*
  Custom Exception...Exceptions like these are created to increase the readability of the code
  EmptyStringException IS-A type of Exception...In this case, this renders it as a Compile time exception i.e. Checked exception

   */


  private String message;
  public EmptyStringException(String message) {
    super(message);
  }
}
