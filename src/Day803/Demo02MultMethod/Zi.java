package Day803.Demo02MultMethod;

public class Zi extends Fu {
    int num = 20;
    int age = 18;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        System.out.println("子类特有方法");
    }

}
