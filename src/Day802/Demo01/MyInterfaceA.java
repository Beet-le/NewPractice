package Day802.Demo01;

public interface MyInterfaceA {
        void methodA();
        void methodAbs();
        public default void methodDefault(){
                System.out.println("默认方法AAA");
        }
}
