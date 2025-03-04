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

    AnyType findID(int ID){

        if(head.data == null){
            return null;
        }
         
        Node<AnyType> temp = head;

        while(temp != null){
            if(temp.data.getID() == ID){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    boolean insertAtFront(AnyType x){

        if(head.data == null){ // if head is null than we want the head to hold the new data x
            head.data = x;
        }
        
        Node<AnyType> temp = head;  //create temp variable for loop
        while(temp != null){
            if(temp.data.getID() == x.getID()){
                return false;  //if its equal means id exist in the list we dont want to insert so return false
            }
            temp = temp.next;
        }

        //ID does not exist insert it at front
        Node<AnyType> newNode = new Node<>(x);
        newNode.next = head; //point to where head was pointing
        head = newNode; //update the head refrence to point to new node
        return true;
  
    }
    
}