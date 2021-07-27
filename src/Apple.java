public class Apple extends Company {
    private final int num;

    private String computer;
    private String tablet;
    private String watch;

    public Apple(String name, String address, String call, String outputDevices, String inputDevices, String smartPhone, int num, String computer, String tablet, String watch) {
        super(name, address, call, outputDevices, inputDevices, smartPhone);
        this.num = num;
        this.computer = computer;
        this.tablet = tablet;
        this.watch = watch;
    }

    @Override

    public void AppSell() {

        /*System.out.println(getName() + " company is located at " + getAddress() + ". Call number is " + getCall() +
                ". There are Apple products such as " + getOutputDevices() + ", " + getInputDevices() + ", and " + getSmartPhone());*/
        System.out.println("Apple:");
        System.out.print(" Under " + num + " ID, you can buy "
                + computer + ", " + tablet + ", " + watch + ", " + getOutputDevices() + ", " + getInputDevices() +
                ", and " + getSmartPhone());

        super.AppSell();
    }

    public  void AppGain(){


    }


    public int getNum() {
        return num;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getTablet() {
        return tablet;
    }

    public void setTablet(String tablet) {
        this.tablet = tablet;
    }

    public String getWatch() {
        return watch;
    }

    public void setWatch(String watch) {
        this.watch = watch;

    }
}
