
/**
 * Created by Administrator on 2016/11/16.
 */
public class TestTenuringThreshold {
    private static final int _1MB = 1024*1024;

    public static void main(String []args){
        byte[] allo1;
        byte[] allo2;
        byte[] allo3;
        allo1 = new byte[1024*102];
     
        allo2 = new byte[1024*102*4];
        allo3 = new byte[4*1024*102];
        System.out.println("Hello");
        allo3 = null;
        System.out.println("Hello world!");

        allo3 = new byte[4*1024*102];
    }
}
