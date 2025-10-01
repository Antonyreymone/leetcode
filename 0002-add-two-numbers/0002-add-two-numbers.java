class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(0); // dummy node to simplify result handling
        ListNode current = dummy;
        int carry = 0;

        // Loop through both linked lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // start with carry from last addition

            if (l1 != null) {
                sum += l1.val; // add value from l1
                l1 = l1.next;  // move to next node
            }

            if (l2 != null) {
                sum += l2.val; // add value from l2
                l2 = l2.next;  // move to next node
            }

            carry = sum / 10; // calculate carry for next step
            current.next = new ListNode(sum % 10); // store digit in new node
            current = current.next;
        }
        return dummy.next;  
    }
}

