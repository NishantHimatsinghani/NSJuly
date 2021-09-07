public class Sept7thException {

  public static void main(String[] args) throws Exception {
    
    
    /*
    Every thread in Java has its own call stack to track which method/code-block to call next
    
      |                  |
      |                  |
      |                  |
      | main             |
      |------------------|
    
    
    
    
    
    
    
     */
    
    
    //anotherFunction();
    /*
    If we throw the exception from the main method, the JVM thread stops and the application
     */
    

    
    
  }



  private static void anotherFunction() throws Exception {
    /*
      |                  |
      |                  |
      |anotherFunction   |
      | main             |
      |------------------|
     */
    yetAnotherFunction();


  }

  private static void yetAnotherFunction() throws Exception {
    /*
      |                  |
      |yetAnotherFunction|
      |anotherFunction   |
      | main             |
      |------------------|
     */

    //throw an exception
    /*
    I have two options here :
    If I want to handle the exception here ? --> try/catch block...other methods down the call stack need not worry about this exception as it is already handled over here
    Or If I want to delegate/duck away from the exception --> throws keyword in the method signature
     */


  }

}
