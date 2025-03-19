public class Remove_duplicates_from_LinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next!=null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return head;
    }

    public static ListNode arrayToLinked(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Add a newline after printing
    }

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 3};

        ListNode head = arrayToLinked(values); // Convert array to linked list
        head = deleteDuplicates(head); // Remove duplicates

        printLinkedList(head); // Print the updated linked list
    }


}
