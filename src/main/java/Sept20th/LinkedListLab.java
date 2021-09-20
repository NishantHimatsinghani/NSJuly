package Sept20th;

public class LinkedListLab {

  public static void main(String[] args) {

    /*
    Head1
      |
      1 -> 2 -> 3 -> 4 -> 5
                           \
                10 -> 11 -> 6 -> 7 -> 8 -> null
                |
               Head2
     */

    LinkedListNode head1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    LinkedListNode node5 = new LinkedListNode(5);
    LinkedListNode node6 = new LinkedListNode(6);
    LinkedListNode node7 = new LinkedListNode(7);
    LinkedListNode node8 = new LinkedListNode(8);
    head1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node7.next = node8;

    LinkedListNode head2 = new LinkedListNode(10);
    LinkedListNode node11 = new LinkedListNode(11);
    head2.next = node11;
    node11.next = node6;

    System.out.println(intersection(head1, head2));

  }

  private static int intersection(LinkedListNode head1, LinkedListNode head2) {
    return 0;
  }


  public static class LinkedListNode{
    int value;
    LinkedListNode next;
    public LinkedListNode(int value){
      this.value = value;
    }
  }
}
