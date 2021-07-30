package Day730.Demo02;

public interface MyInterfaceDefault {
    public abstract void methodABS();
//    public abstract void methodABS2();
    public default void methodDefault(){
        System.out.println("这是添加的默认方法");
    }
    public default void methodDefault2(){
        System.out.println("这是添加的默认方法2");
    }
}
