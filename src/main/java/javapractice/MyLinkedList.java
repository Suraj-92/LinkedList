package javapractice;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
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
}
