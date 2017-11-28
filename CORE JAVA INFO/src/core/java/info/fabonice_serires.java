package core.java.info;

public class fabonice_serires {
 
    static int n1=0,n2=0,n3=0;
     
     static void fabonic(int count){
         
         if(count>0){
             n3=n1+n2;
             n1=n2;
             n2=n3;
             System.out.print(" "+n3);
             fabonic(count-1);
         }
     }
     public static void main(String args[]){
         
         int count=15;
         System.out.print(n1+" "+n2);
         fabonic(count-2);
     }
}
