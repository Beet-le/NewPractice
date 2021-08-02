package Day802.Demo01;

public class MyinterfaceImpl implements  MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("A方法");
    }

    @Override
    public void methodB() {
        System.out.println("B方法");
    }
}
