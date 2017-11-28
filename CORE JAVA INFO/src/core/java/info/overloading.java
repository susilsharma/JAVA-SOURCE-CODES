package core.java.info;

public class overloading {
    String name,phone;
    ///OVERLOADING SYSTEM
    public void A(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    public void Display(){
        System.out.println("A person name  & phone number :");
        System.out.println(
          "name="+name+  
          " \nphone="+phone        
        );
    }
    ///Main method
    public static void main(String args[]){
        overloading ld=new overloading();
        ld.A("david","32541");
        ld.Display();
        
        overloadingprocess ldp=new overloadingprocess();
        ldp.A(11,"David");
        ldp.Display();
        
   }
}
class overloadingprocess{
    int id;
    String name;
    ///Verloading means just paramenter change both of method
    public void A(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void Display(){
        System.out.println("A person id  & phone number :");
        System.out.println(
          "id="+id+  
          " \nname="+name        
        );
    }
}