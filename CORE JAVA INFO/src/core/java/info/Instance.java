package core.java.info;

class A{
    A(){
        System.out.println("parent class instructor invoked 001");
    }
}
public class Instance extends A {
    
    Instance(){
        super();
        System.out.println(" Child class insturctor invoked 002");
    }
    
    {System.out.println(" Child class insturctor invoked 003 ");}
    
    public static void main(String args[]){
        A a=new A();
         
        Instance b=new Instance();
    }
}
