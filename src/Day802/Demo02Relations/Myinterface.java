package Day802.Demo02Relations;
/*
子接口
*/
public interface Myinterface extends MyinterfaceA,MyinterfaceB{
    void method();

    @Override
    default void methodDefault() {
        MyinterfaceA.super.methodDefault();
    }
}
