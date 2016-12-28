
/**
 * Created by Administrator on 2016/11/16.
 * 《Understanding JVM》 Page94: 大对象直接进入老年代
  虚拟机参数
  -verbose:gc
 -Xms20m
 -Xmx20m
 -Xmn10m
 -XX:+PrintGCDetails
 -XX:SurvivorRatio=8
 -XX:PretenureSizeThreshold=3145728
 */

public class TestPretenureThreshold {
    private static final int _1MB = 1024*1024;

    public static void main(String []args){
        byte[] allo1 = new byte[4*_1MB];
    }
}
