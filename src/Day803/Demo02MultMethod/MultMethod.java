package Day803.Demo02MultMethod;

public class MultMethod {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();//父子都有优先用子
        obj.methodFu();
//        obj.methodZi();
    }
}
