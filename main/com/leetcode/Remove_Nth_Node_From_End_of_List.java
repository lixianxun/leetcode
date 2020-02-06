package com.leetcode;

public class Remove_Nth_Node_From_End_of_List {

	private static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow, fast, curr;
        slow = head; fast = head;
        for (int i = 0; i < n; i++)
            fast = fast.next;
        // n == len
        if (fast == null) {
            head = head.next;
            return head;
        }
        // Move both pointers, until reach tail
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        curr = slow.next;
        slow.next = curr.next;
        return head;
    }
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		System.out.println(head.next.val);
		System.out.println(removeNthFromEnd(head, 3).next.val);
	}

}
