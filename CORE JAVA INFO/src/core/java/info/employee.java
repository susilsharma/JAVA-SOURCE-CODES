package core.java.info;
public class employee {

    int id;
    String name;
    Address address;
    
    public employee(int id,String name,Address addr){
        this.id=id;
        this.name=name;
        this.address=addr;
    }
    
    void display(){
        System.out.println("ID :"+id+" "+"Name :"+name);
        System.out.println(""
                + "City :"+address.city+""
                + " "+"State :"+address.state+""
                + " "+"Country :"+address.country);
    }
    
    public static void main(String args[]){
        Address add1=new Address("Dhanmondi","Dhaka","Bangladesh");
        employee e1=new employee(111,"David",add1);
        
        e1.display();
        //Address.Address("city","Daka","Bangladesh");
    }
}
