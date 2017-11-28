package core.java.info;

class AB{
    
    int num=90;
    void run(){
        System.out.println("Running....!");
    }
}
public class polimorphism extends AB{
    
    int num=100;
     void run(){
        System.out.println("Running...time.!");
    }
     public static void main(String args[]){
         
         //this is called  polimorphism
         AB ab=new polimorphism();
         ab.run();
         System.out.println(" "+ab.num);
         
         AB abb=new AB();
         abb.run();
     }
     
}
