package JavaCollections;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> head;

    private int numNodes;

    public MyLinkedList(int i){
        this.head = null;
    }

    @Override
    public int getSize() {
        return numNodes;
    }

    @Override
    public E get(int index) {
        Node<E> temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    @Override
    public void add(E e) {
        if (this.head == null) {
            this.head = new Node<>(e);
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(e);
        numNodes++;
    }

    @Override
    public void add(int index, E e) {
        Node temp = this.head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node<>(e);
        temp.next.next = holder;
        numNodes++;
    }

    @Override
    public E remove(int index) {
        Node<E> temp = this.head;
        Node holder;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next=temp.next.next;
        numNodes--;
        return temp.data;


    }

    @Override
    public boolean contain(E e) {
        if (numNodes == 0) return false;
        else {
            Node<E> temp = head;

            while (temp != null) {
                if (temp.getData() == e)
                    return true;
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        Node<E> temp = this.head;
        int count=0;
        while (temp.next!=null){
          if (temp.getData()== e){
              return count;
          }
          count++;
          temp=temp.next;
        }
        return -1;
    }

    @Override
    public void clear() {
          numNodes=0;
          head=null;
    }

    public void printList() {
        Node<E> temp = head;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public class Node<E>{
        private Node<E> next;
        private E data;

        public Node(E e) {
            this.data = e;
        }

        public E getData(){
            return this.data;
        }
    }
}