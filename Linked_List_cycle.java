public class Linked_List_cycle {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if list is empty or has only one node
        }

        ListNode slow = head; // Moves one step
        ListNode fast = head; // Moves two steps

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1 step
            fast = fast.next.next;    // Move fast by 2 steps

            if (slow == fast) { // If they meet, there's a cycle
                return true;
            }
        }

        return false; // If fast reaches null, no cycle exists
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creates a cycle

        System.out.println(hasCycle(head)); // Output: true
    }
}
