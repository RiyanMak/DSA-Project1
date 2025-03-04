class IDedLinkedList <AnyType extends IDedObject>{

    private static class Node<AnyType>{ //Created private class to implement Node for anytype 
        AnyType data; //The data
        Node<AnyType> next; //Refrence to the next node

        public Node(AnyType data){ //Constructor that intialize head and the next node refrence value
            this.data = data;  
            this.next = null;
        }  
        public Node(AnyType data, Node<AnyType> next){
            this.data = data;
            this.next = next;
        }
    }
    
    private Node<AnyType> head  = null;


    public IDedLinkedList(){
        //Default linked list since head is empty
    }

    void makeEmpty(){
        head = null;
    }
    
}