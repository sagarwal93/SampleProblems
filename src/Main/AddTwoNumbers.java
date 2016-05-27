package Main;

/**
 * Created by Samarth on 5/26/16.
 */
//You are given two linked lists representing two non-negative numbers.
//The digits are stored in reverse order and each of their nodes contain a single digit.
//Add the two numbers and return it as a linked list.

public class AddTwoNumbers {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode curr = head;
        int sum = 0, carry = 0;

        while (l1 != null || l2 != null) {

            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            sum = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;

            ListNode next = new ListNode(sum);

            if (head == null) {
                head = next;
                curr = head;
            }
            else {
                curr.next = next;
                curr = curr.next;
            }

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return head;
    }
}
