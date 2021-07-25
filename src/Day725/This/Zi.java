package Day725.This;

public class Zi extends Fu{
    int num=20;
    int a;
    int v;


    public Zi() {
        this(2);

    }

    public Zi(int ca) {
       this(1,1);
            v=ca/a;
    }
    public Zi(int n ,int m) {

        a=(n+m);
    }

    public void showNum(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("aaa");
    }
    public  void methodB(){
        this.showNum();
        System.out.println("bbbbb");
    }
}
