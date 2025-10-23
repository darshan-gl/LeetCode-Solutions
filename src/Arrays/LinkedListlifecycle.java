package Arrays;
//LeetCode 141: Linked List Cycle Solution
//Tested and verified on LeetCode platform

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListlifecycle {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true; 
            }
        }

        return false; 
    }
}

