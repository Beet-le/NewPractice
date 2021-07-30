package Day730Interface.Demo04Private;

public interface MyinterfaceStaticB {
   static void methodDefault1(){
        System.out.println("静态方法1 ");
    }
    static void methodDefault2(){
        System.out.println("静态方法2 ");
           methodCStatic();
    }
     private static void methodCStatic(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
