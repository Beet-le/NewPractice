package Day810.Demo02;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }

    //使用设备
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();
        }else if (usb instanceof Ketbord){
            Ketbord ketbord=(Ketbord) usb;
            ketbord.type();
        }
        usb.close();
    }
}
