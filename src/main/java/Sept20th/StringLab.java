package Sept20th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLab {

  public static void main(String[] args) {
    String s1 = "hello";//It creates one String Literal called "hello" and stores it in SCP(String Constant Pool)
    String s2 = "hello";//Here, it is pointing to the same string literal as above
    //This is how Java saves on significant amount of space as Strings are everywhere in the application.
    //This helps a great deal in memory optimizations and prevents MEMORY_LEAKS in applications
    //String s3 = new String("hello");//this does not use the SCP. It creates a new String Object on the HEAP memory

    String s3 = new String("hello").intern();//interning of String : It is the process of using the String literals from the SCP rather than making a new String OBJECT on the heap
    System.out.println(s1==s2);

    System.out.println(s1==s3);


    String s4 = "Hello";//State of SCP --> "Hello"
    s4 = s4.toUpperCase();//A new String Literal is created in the SCP.

    //State of SCP --> "Hello", "HELLO"

    System.out.println(s4);//HELLO ?? But this is not what is printed.
    //This is because Strings are IMMUTABLE(cannot be changed) in java

    //====================WHY ARE STRINGS IMMUTABLE ?

    String s5 = "hello world"; //State of SCP --> "hello world"
    String s6 = "hello world"; //State of SCP --> "hello world"

    s5.toUpperCase(); //State of SCP --> "hello world", "HELLO WORLD"
    //Assuming that strings are MUTABLE(which they are not), the above operation
    //will change both : s5 as well as s6 since both point to the same String literal in SCP
    //This is a problem : Changing s5 should affect s6 in no sense. And this is a STRICT NO-NO!!!

    //This is the reason why Strings are IMMUTABLE :
      //On Line 34, it will add a new String Literal in the SCP and whoever wants to point at it, can EXPLICITLY do it

    //Caching the Hashcodes : 4634346437554..
    //  --What are Hashcodes ? : Somehow represents the object in java. It helps to determine of equality of two java objects
    //By Default, it will store the value of the Heap Memory location of the Java object


    //Thread-Safety :
    //In an env where there are multiple threads running the the same code
    // and trying to mutate the value variables,
    // it is so possible that the value of a string literal be
    // overridden by one thread and it starts giving unexpected results
    // in the other thread

    /*
    Threads are simply machines on which a single program(process) executes
    T1 which is executing Program1
    T2 which is also executing the same piece of code
    If Strings were mutable, then since there is a single SCP that will be shared between the two threads
    If I change the value of s5 in T1, it might change the value of that string in T2 as well.

    Since Strings are immutable, When T1 changes a string, it creates a NEW string in SCP
    instead of modifying the existing string literal in SCP
     */




    //====================STRINGBUILDER

    StringBuilder sb = new StringBuilder();
    sb.append("eqweasrgdts");
    sb.append("fgwresjtdgx");
    sb.append("wretjdrynfgbdvs");
    sb.reverse();
    //We are not maintaining 3 small string literals in the SCP. WE are asking JVM to override that behaviour and create a single String Literal and keep on Modifying it
    //This gives us the flixibility to avoid the maintainence of small String Literals that as developers, we know that we are not going to use those.
    //The above code will only create one String object.
    //On top of this functionality of Mutability of Strings, it also gives us some helper methods :
    //  --append, reverse



  }
}
