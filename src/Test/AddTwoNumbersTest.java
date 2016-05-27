package Test;

import Main.AddTwoNumbers;
import org.junit.Assert;

/**
 * Created by Samarth on 5/27/16.
 */
public class AddTwoNumbersTest {

    @org.junit.Test
    public void addTwoNumbersTest() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode param1 = l1;
        l1.next = new AddTwoNumbers.ListNode(4);
        l1 = l1.next;
        l1.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode param2 = l2;
        l2.next = new AddTwoNumbers.ListNode(6);
        l2 = l2.next;
        l2.next = new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.ListNode retList = AddTwoNumbers.addTwoNumbers(param1, param2);

        Assert.assertTrue((retList.val == 7));
        Assert.assertTrue((retList.next.val == 0));
        Assert.assertTrue((retList.next.next.val == 8));
    }

    @org.junit.Test
    public void addTwoNumbersTest2() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode param1 = l1;
        l1.next = new AddTwoNumbers.ListNode(0);
        l1 = l1.next;
        l1.next = new AddTwoNumbers.ListNode(8);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode param2 = l2;
        l2.next = new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.ListNode retList = AddTwoNumbers.addTwoNumbers(param1, param2);

        Assert.assertTrue((retList.val == 0));
        Assert.assertTrue((retList.next.val == 5));
        Assert.assertTrue((retList.next.next.val == 8));
    }

}
