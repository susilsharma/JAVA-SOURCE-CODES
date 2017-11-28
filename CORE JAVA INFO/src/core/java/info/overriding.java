package core.java.info;

class overridingproccess{
    
    ///Overriding method same all function unmutable.
    public void diply(){
        System.out.println(" You should be change 002 ");
    }
}

public class overriding extends overridingproccess{

    ///Overriding method same.
    public void diply(){
       System.out.println(" You should be change  001 ");
    }
    public static void main(String args[]){
        overriding rd=new overriding();
        rd.diply();
        
        overridingproccess rdp=new overridingproccess();
        rdp.diply();
        
        new overriding().diply();
    }
}

