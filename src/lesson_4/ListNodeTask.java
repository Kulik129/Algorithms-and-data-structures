package lesson_4;

public class ListNodeTask {
    public static ListNode addFirst(int value, ListNode node) {
        ListNode newNode = new ListNode();
        newNode.val = value;
        if (node != null) {
            newNode.next = node;
        }
        return newNode;
    }
    public static ListNode removeFirst(ListNode remove) {
        if (remove != null) {
            remove = remove.next;
        }
        return remove;
    }
    public static ListNode reverse(ListNode reverse) {
        ListNode previous = null;
        while (reverse != null) {
            ListNode nextElement = reverse.next;
            reverse.next = previous;
            previous = reverse;
            reverse = nextElement;
        }
        return previous;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
