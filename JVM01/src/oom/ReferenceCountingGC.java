package oom;

public class ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB =1024*1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA =null;
        objB =null;

        System.out.println("Hello");
        System.gc();
        /*try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }
}
