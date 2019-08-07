package com.company;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      //构造函数，传入一个数组
      public ListNode (int [] arr){

          if(arr==null||arr.length==0){
              throw new IllegalArgumentException("");
          }
          this.val = arr[0];
          ListNode cur = this;
          for(int i = 1 ; i < arr.length ; i++ ){
              cur.next = new ListNode(arr[i]);
              cur = cur.next;
          }
      }
      @Override
      public String toString(){
          StringBuilder res = new StringBuilder();
          ListNode cur = this;
          while (cur != null){
              res.append(cur.val + "->");
              cur = cur.next;
          }
          res.append("NULL");
          return  res.toString();
      }
}
public class Solution {
    public ListNode prev ;
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        while (head.val == val){
            if(head.next!=null)
                head = head.next;
            else {
                return null;
            }
        }
        prev = head;
        while (prev.next!=null){
            if(prev.next.val == val){
                prev.next=prev.next.next;
            }
            else
                prev=prev.next;
        }
        return head;
    }
}
