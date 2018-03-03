class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        ListNode current1 = l1;
		ListNode current2 = l2;
		ListNode result = new ListNode(0);
		ListNode temp = result;
		int carry = 0;
		while (null != current1 || null != current2 || 1 == carry) {
			int sum = (null == current1? 0 : current1.val) + (null == current2? 0 : current2.val) + carry;
			if (sum >= 10) {
				sum = sum - 10;
				carry = 1;
			} else {
				carry = 0;
			}
			temp.next = new ListNode(sum);
			temp = temp.next;
			current1 = (null == current1) ? null : current1.next;
			current2 = (null == current2) ? null : current2.next;
		}
		return result.next;    
    }
}