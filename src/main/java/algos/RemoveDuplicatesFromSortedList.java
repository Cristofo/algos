package algos;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        deleteDuplicates(head);
        // 1 2 2 3 4

    }

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode list = head;

        while (list.next != null){
            if(list.val == list.next.val){
                list.next = list.next.next;
                continue;
            }
            list = list.next;
        }

        return head;
    }

    private static class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

}
