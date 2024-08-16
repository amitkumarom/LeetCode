class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or contains only one element, return it as is
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize the current node as the head of the list
        ListNode current = head;

        // Traverse the linked list
        while (current != null && current.next != null) {
            // If the current node's value is equal to the next node's value, skip the next node
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                // Otherwise, move to the next node
                current = current.next;
            }
        }

        // Return the modified linked list
        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1: LinkedList: 1 -> 1 -> 2
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);

        // Example 2: LinkedList: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);

        // Deleting duplicates from Example 1
        System.out.print("List after removing duplicates (Example 1): ");
        ListNode result1 = deleteDuplicates(head1);
        printList(result1);

        // Deleting duplicates from Example 2
        System.out.print("List after removing duplicates (Example 2): ");
        ListNode result2 = deleteDuplicates(head2);
        printList(result2);
    }
}
