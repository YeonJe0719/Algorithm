
class Solution {
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
            return null; // No middle node to delete
        }

        int length = 0;
        ListNode current = head;

        // Calculate the length of the list
        while (current != null) {
            length++;
            current = current.next;
        }

        int middle = length / 2;
        current = head;

        // Traverse to the middle node again
        for (int i = 0; i < middle - 1; i++) {
            current = current.next;
        }

        // Delete the middle node
        current.next = current.next.next;

        return head;
        
    }
}