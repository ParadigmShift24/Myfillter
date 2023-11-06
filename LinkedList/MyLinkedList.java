package LinkedList;

public class MyLinkedList {

    static class ListNode{
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode tail;

    //添加一个结点(尾插)：
    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //添加一个结点（头插）
    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }
    }

    //插入节点到指定位置（index）
    public void InsertNode(int data, int index){
        if(index < 0 || index > size()){
            System.out.println("Index out of the List.");
            return;
        }

        ListNode newNode = new ListNode(data);

        if(index == 0){
            addNode(data);
        }else if(index == size()){
            addLast(data);
        }else{
            ListNode currentNode = head;
            for(int i = 0; i < index -1; i++){
                currentNode = currentNode.next;
            }

            newNode.next = currentNode.next;
            newNode.prev = currentNode.prev;
            currentNode.next.prev = newNode;
            currentNode.next = newNode;
        }
    }


    //返回链表的长度：
    public int size() {

        ListNode cur = head;
        int count = 0;

        if(head == null){
            return 0;
        }
        while(cur != null){
            count++;
            cur = cur.next;
        }

        return count;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    //查找是否包含key关键字：
    public boolean contains(int key){

        ListNode current = head;
        while(current != null){
            if(current.val == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args){
        MyLinkedList newList = new MyLinkedList();
        newList.addNode(4);
        newList.addNode(3);
        newList.addNode(2);
        newList.addNode(1);

        newList.InsertNode(5, 2);

        System.out.println(newList.size());
        System.out.println(newList.contains(7));
        newList.display();
    }
}
