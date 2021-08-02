package Day802.Demo01;

public class MyinterfaceImpl implements  MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆写A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("AB都有的抽象方法");
    }

    @Override
    public void methodDefault() {
//        MyInterfaceA.super.methodDefault();
        System.out.println("对AB进行了覆盖重写");
    }


    @Override
    public void methodB() {
        System.out.println("覆写B方法");
    }
}
