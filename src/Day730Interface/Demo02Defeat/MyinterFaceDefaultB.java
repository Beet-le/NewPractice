package Day730Interface.Demo02Defeat;

public class MyinterFaceDefaultB implements MyInterfaceDefault{


    @Override
    public void methodABS() {
        System.out.println("实现抽象方法BBB");
    }

    /*@Override
    public void methodABS2() {

    }*/
    @Override
    public  void methodDefault(){
        System.out.println("这是添加的默认方法3");
    }
}
