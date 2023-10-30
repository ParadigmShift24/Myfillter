package SingleLIst;

public class SingleLIst {
    static class ListNode{
        public int value;
        public ListNode next;

        public ListNode(int value){
            this.value = value;
            this.next = next;
        }
    }

    private ListNode head = null;

    //创建一个新结点：
    public void AddNode(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }else{
            ListNode pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = newNode;
        }
    }

    //删除一个结点：
    public void DelNode(int value){
        if(head == null){
            return;
        }else{
            ListNode pointer = head;

            while (pointer.next != null && pointer.next.value != value){
                pointer = pointer.next;
            }
            if(pointer.next != null){
                pointer.next = pointer.next.next;
            }
        }
    }

    //打印当前链表的内容：
    public void Display(){
        ListNode pointer = head;
        while (pointer != null){
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }

    public static void main(String[] args){
        SingleLIst myList = new SingleLIst();

        myList.AddNode(23);
        myList.AddNode(34);
        myList.AddNode(45);
        myList.AddNode(56);
        myList.AddNode(67);

        myList.DelNode(56);
        myList.DelNode(67);

        myList.Display();

    }

}
