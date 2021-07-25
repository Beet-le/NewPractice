package Day725.DemoConstructor;

public class Fu {
    public Fu() {
        System.out.println("无参构造");
    }
    public Fu(int num){
        int a=num+2;
        System.out.println("有参构造"+a);
    }
}
