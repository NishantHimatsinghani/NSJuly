package Oct5thCode.LinkedList;

public class LinkedListExamples {

  public static void main(String[] args) {
    Node head =  new Node(1);

    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);

    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = null;

    printList(head);
    Node reverseHead = reverse(head);
    printList(reverseHead);


    printList(reverseRecursively(reverseHead));



  }

  private static void printList(Node head) {
    Node current = head;
    while(current != null) {
      System.out.print(current.data);
      current = current.next;
    }
    System.out.println();
  }

  public static Node reverse(Node head) {

    /*
null    <----1     2 ---------> 3 ------> 4 ---> null


    2 ---------> 1 ------> null


    4 -----> 3 ----> 2 ------> 1 -------> null

     */
    Node previous = null;

    Node current = head;
    Node immediateNext = null;

    while(current != null) {
      immediateNext = current.next;
      current.next = previous;
      previous = current;
      current = immediateNext;
    }
    /*
    TC : O(N)./...since we are accessing every element of the LL only once
    Space : O(1)...Since no extra space is being used
     */

    return previous;
  }




  public static Node reverseRecursively(Node head) {

    /*
    1 ------->  2 <--------- 3 <------ 4
                              |-------->
    We  might have to travel to the last node
    While coming back in the call stack, we need to manipulate the pointers so as to reverse it

    2 ---------> 1 ------> null


    4 -----> 3 ----> 2 ------> 1 -------> null

     */

    if(head == null || head.next == null) {
      return head;
    }
    Node newHead = reverseRecursively(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;

  }


}
