package HashCodeEquals;

import java.util.HashMap;

public class lab {

  public static void main(String[] args) {
    Employee emp1 = new Employee(1, "abc");
    Employee emp2 = emp1;
    //Emp2 is pointing to the same memory location on the heap
    //Since we have not implemented an equals method in the Employee class, then the default equals method provided by Object class will compare the memory address of the objects on Heap to check for equality
    System.out.println(emp1.hashCode() + "    " + emp2.hashCode());
    //System.out.println(emp1.equals(emp2));

    //I need a way to say if two employee objects are Functionally Equal
    //For eg, in my application, I consider two employees to be equal if their ids are equal

    emp2 = new Employee(2, "def"); // Now, emp2 is an entirely different object on the heap i.e. both are pointing to two different memory locations on the heap

    //System.out.println(emp1.equals(emp2)); // should be false; as 1 !=2
    emp2.id = 1;
    //System.out.println(emp1.equals(emp2)); // should be true as ids are true

    System.out.println(emp1.hashCode() + "    " + emp2.hashCode());
    //Different hashcodes are printed because the default implementation of hashcode method in Object class uses the MEMORY LOCATION to determine the hashcode
    //However, remember the rule, if two objects are EQUAL i.e. they pass the equals() test, then they should return the the same hashCode
      //This is a fundamental requirement for Hashing datastructures to work correctly.
    //In this print statement, this rule is violated
  }

  public static class Employee {
    int id;
    String name;
    String address;

    public Employee(int id, String name){
      this.id = id;
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      Employee emp2 = (Employee)obj;
      return this.id == emp2.id;
    }

    @Override
    public int hashCode() {
      //What should the hashCode be based upon ?
      //--> It should be based upon the parameters on which two objects of this class are being rendered as EQUAL
      return 5;
    }
  }

}
