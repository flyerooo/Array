class Solution {
    //    删除链表中等于给定值val的所有元素
    public ListNode removeElement(ListNode head, int val){
        while (head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head==null){
            return null;
        }

        ListNode prev = head;
        while (prev.next != null){
            if (prev.next.val == val){
                ListNode delNode =prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }else {
                prev = prev.next;
            }
        }

        return head;
    }
}
