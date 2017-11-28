
package core.java.info;

public class switch_info {
    public static void main(String[] args) {
        int num=20;
        int tm;
        switch(num){
            
            case 10:
                System.out.println(num);
                break;
                
            case 20:
                if(num==20){
                    System.out.println(num);
                }
                break;
            default:
                System.out.println("not match");
                break;
        }
    }
}
