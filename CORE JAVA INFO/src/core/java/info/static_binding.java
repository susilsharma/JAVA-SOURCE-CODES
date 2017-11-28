package core.java.info;

public class static_binding {
       
    void run(){
        System.out.println("  this is static binding");
    }
    public static void main(String args[]){
      
        static_binding sbb=new static_binding();
        sbb.run();
    }
}
