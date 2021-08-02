package Day802.Demo02Relations;

public interface MyinterfaceB {
    void methodB();
    void methodCommon();
    default void methodDefault(){
        System.out.println("BBB");
    }
}
