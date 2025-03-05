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

        if(head == null){
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

        if(findID(x.getID()) != null){ // if head is null than we want the head to hold the new data x
            return false;
        }
        


        // Create a new node and insert at front
        Node<AnyType> newNode = new Node<>(x);
        newNode.next = head;
        head = newNode;
        return true;
  
    }

    AnyType deleteFromFront(){
        if(head == null){
            return null;
        }

        AnyType DeletedData = head.data; //Save the data of the first node
        head = head.next; //move the pointer of head to the next node
        return DeletedData; //return the first node information

    }

    AnyType delete(int ID){
        
        if(head == null){
            return null;
        }

        if(head.data.getID() == ID){
            return deleteFromFront();
        }

        Node<AnyType> prev = head;
        Node<AnyType> current = head.next;

        while(current != null){
            if(current.data.getID() == ID){
                AnyType deletedData = current.data;
                prev.next = current.next;
                return deletedData;
            }
            prev = prev.next;
            current = current.next;

        }
    
        return null;


    }

    int printTotal(){

        if(head == null){
            return -1;
        }

        int sumOfIds = 0;
        Node<AnyType> current = head;


        while(current != null){
            sumOfIds += current.data.getID();
            current = current.next;
        }

    return sumOfIds;

    }
    
}