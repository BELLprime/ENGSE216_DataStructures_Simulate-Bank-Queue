package bank.java;

public class Queue {
    private Database db ;
    private int front,rear,count,size;
    //constructor
    public Queue() {
        this(5);
    }
    public Queue(int size){
        this.size=size;
        this.db = new Database(size);
        this.count=0;
        this.front=-1;
        this.rear=-1;
    }
    
    public void enqueue(String item){
        if(!isFull()){
            if (isEmpty()) {
                this.front=0;
                this.rear=0;
                db.setData(rear, item);
            } else {
                rear=(rear+1)%size;//(-1) satar intdex at 1 to ...
                db.setData(rear,item);
            }
            count++;
        } else System.out.println("Queue is full," + item + " will not collect.");
    }
    public String dequeue(){
        String data="";
        if (!isEmpty()) {
            data=db.getData(front);
            if (front==rear) { //force reset
                this.front=-1;
                this.rear=-1;
            } else front=(front+1)%this.size;
            count--;
        } else System.out.println("Queue is empty,You can't dequeue.");
        return data;
    }
    //check
    public boolean isEmpty(){return front==-1 && rear==-1;}
    public boolean isFull(){return count==size;}
    //get count
    public int getFront() {return this.front;}
    public String getData() {
        if (!isEmpty()) {
            return db.getData(front);
        }
        return "";
    }
}
