package core.java.info;

public class call_by_vlaue {
  
    int data=50;
    
    public int change(int datatwo){
        
        this.data=data+datatwo;
        return data;
    }
    
    public static void main(String args[]){
        
        call_by_vlaue cbv=new call_by_vlaue();
        System.out.println("before position = " +cbv.data);
         //int ddata=cbv.change(100);
        System.out.println("after position = "+cbv.change(100) );
        
    }
}
