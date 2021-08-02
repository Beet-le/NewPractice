package Day802.Demo01;

public interface MyInterfaceB {
    void methodB();
    void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
