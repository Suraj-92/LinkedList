package javapractice;

public class MyLinkedList<K> {
    public INode head;
    public INode tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if(this.tail == null)
        {
            this.tail = newNode;
        }
        if(this.head == null)
        {
            this.head = newNode;
        }
        else
        {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }

    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Node :");
        INode tempNode =  head;
        while(tempNode.getNext() != null)
        {
            myNodes.append(tempNode.getNext());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getNext());
        System.out.println(myNodes);
    }

    public void append(INode<K> myNode){
        if(this.head == null)
        {
            this.head = myNode;
        }
        if(this.tail == null)
        {
            this.tail = myNode;
        }
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public void insert(INode<K> myNode, INode<K> newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode<K> pop(){
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode<K> popLast(){
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail))
        {
           tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public INode<K> search(K key){
        INode<K> tempNode = head;
        while(tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }

        }
        return null;

    }

    public String toString(){
        return "MyLinkedListNodes"+head;
    }
}
