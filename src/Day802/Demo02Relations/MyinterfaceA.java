package Day802.Demo02Relations;

public interface MyinterfaceA {
    void methodA();
    void methodCommon();
    default void methodDefault(){
        System.out.println("AAA");
    }
}
