class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList() {
        head = null;

    }

    public int get(int index) {
        int i = 0;
        Node temp = head;
        while(temp!=null){
            if(i == index)
                return temp.data;
            temp = temp.next;
            i++;
        }
        return -1;
        
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;    
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean remove(int index) {
        if(head == null)
            return false;
        if(index == 0){
            head = head.next;
            return true;
        }
        int i = 0;
        Node temp = head;
        Node prev = null;
        while(temp.next != null && i != index){
            i++;
            prev = temp;
            temp = temp.next;
        }
        if(i!=index){
            return false;
        }else{
            prev.next = temp.next;
            return true;
        }
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> i = new ArrayList<Integer>();
        Node temp = head;
        while(temp != null){
            i.add(temp.data);
            temp = temp.next;
        }
        return i;
    }
}
