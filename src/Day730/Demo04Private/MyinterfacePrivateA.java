package Day730.Demo04Private;

public interface MyinterfacePrivateA {
    default void methodDefault1(){
        System.out.println("默认方法1 ");
    }
    default void methodDefault2(){
        System.out.println("默认方法2 ");
        this.methodCommon();
    }
    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
