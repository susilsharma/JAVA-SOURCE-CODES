package core.java.info;


abstract class bike{
    abstract void run();           
}
public class abstracts{
     
    void bike(){
        System.out.println("running safely abstract funciton");
    }
    public static void main(String agrs[]){
        abstracts abst=new abstracts();
         abst.bike();
    }
}
