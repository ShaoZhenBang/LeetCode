//给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
//请你将两个数相加，并以相同形式返回一个表示和的链表。
//你可以假设除了数字 0 之外，这两个数都不会以 0开头。

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    //链表数据结构
}
class S0002{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1,val2,sum,step=0;
        ListNode result=new ListNode(0);
        ListNode temp=result;
        while(l1!=null||l2!=null||step!=0){
            //两数相加牢记进位问题，当两个链表都读完时，拥有进位可能
            val1=l1!=null? l1.val:0;
            val2=l2!=null? l2.val:0;
            sum=val1+val2+step;
            step=sum/10;
            //step是int类型变量，因此step的取值其实只有两种，需要进位则为1，不需要进位则为0
            temp.next= new ListNode(sum%10);
            temp=temp.next;
            if(l1!=null){l1=l1.next;}
            if(l2!=null){l2=l2.next;}
        }
        return result.next;
    }
}