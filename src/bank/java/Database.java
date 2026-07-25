package bank.java;

public class Database {
    private String[] dataQueue;
    private int arrSize;
    
    public Database() {
        this(6);
    }
    public Database(int arrSize) {
        this.arrSize = arrSize;
        this.dataQueue = new String[arrSize];
    }
    //set
    public void setData(int index, String item){this.dataQueue[index]=item;}
    //get
    public String getData(int index){return dataQueue[index];} 
}
