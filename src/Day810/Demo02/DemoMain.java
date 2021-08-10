package Day810.Demo02;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
//        Mouse mouse=new Mouse();
        USB usbMouse = new Mouse();//向上转型
        computer.useDevice(usbMouse);
        Ketbord ketbord=new Ketbord();
        computer.useDevice(ketbord);

        computer.powerOff();
        System.out.println("=================================");
        method(10.0);
        method(10);
    }
    public static void method(double num){
        System.out.println(num);
    }
}
