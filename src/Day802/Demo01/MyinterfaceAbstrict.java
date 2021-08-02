package Day802.Demo01;

public abstract class  MyinterfaceAbstrict implements MyInterfaceB,MyInterfaceA{
    @Override
    public void methodA() {

    }


    @Override
    public void methodB() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        MyInterfaceB.super.methodDefault();
    }
}
