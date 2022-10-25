package algos;

public class Merge2SortedLists {


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode l1next = new ListNode(2);
        ListNode l1next2 = new ListNode(3);
        list1.next = l1next;
        l1next.next = l1next2;

        ListNode list2 = new ListNode(1);
        ListNode l2next = new ListNode(5);
        ListNode l2next2 = new ListNode(6);
        list2.next = l2next;
        l2next.next = l2next2;

        //printList(mergeTwoLists(list1, list2));
        printList(mergeTwoListsRecursive(list1, list2));


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;


        ListNode head = new ListNode(0);
        ListNode current = head;

        while(list1 != null && list2 != null ){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }

        return head.next;

    }

    public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        //Else 1 2 3--1 5 6--- 1 1 2 3 5 6
        //IF 2 3 - 1 5 6-- 1 2 3 5 6
        //Else 2 3 - 5 6-- 2 3 5 6
        //Else 3 - 5 6---3 5 6
        // Return list2
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val > list2.val){
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }else{
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        }
    }

    public static void printList(ListNode list1){

        while(list1 != null){
            System.out.println(list1.val);
            list1 = list1.next;
        }
    }


    private static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
