package com.leetcode;

public class Remove_Nth_Node_From_End_of_List {

	private static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
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
		// TODO Auto-generated method stub

	}

}
