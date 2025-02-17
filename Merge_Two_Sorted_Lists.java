public class Merge_Two_Sorted_Lists {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(l1 !=null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        }else{
            current.next = l2;
        }

    return dummy.next;
    }

    static public ListNode arraytolinked(int[] arr){
        if(arr.length == 0){
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for(int i = 1; i < arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        int[] list1 = {1,2,4};
        int[] list2 = {1,3,4};
        ListNode l1 = arraytolinked(list1);
        ListNode l2 = arraytolinked(list2);

        ListNode result = mergeTwoLists(l1, l2);
        printList(result);
    }

}
