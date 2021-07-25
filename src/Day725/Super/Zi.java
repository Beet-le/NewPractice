package Day725.Super;

public class Zi extends Fu{
    int num=20;
    public Zi() {
        super();
    }
    public void methodzi(){
        System.out.println(super.num);
    }
    @Override
    public void method() {
        super.method();
        System.out.println("子类成员方法");
    }

}
