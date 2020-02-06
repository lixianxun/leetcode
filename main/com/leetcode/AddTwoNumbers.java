package com.leetcode;

/**
 * Leetcode ¨C Add Two Numbers (Java) You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list. Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8. Java Solution.
 * 
 * 
 * 
*/
public class AddTwoNumbers {
	
	private static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p=l1, q=l2, curr = dummyHead;
		int carry = 0;
		
		while(null != p || null != q) {
			int x = (null != p) ? p.val : 0;
			int y = (null != q) ? q.val : 0;
			int digit = carry + x + y;
			carry = digit / 10;
			
			curr.next = new ListNode(digit % 10);
			curr = curr.next;
			
			if(null != p) p = p.next;
			if(null != q) q = q.next;
		}
		if(carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
	

	public static void main(String[] args) {
		ListNode dummyHead = new ListNode(0);
		
	}

}
