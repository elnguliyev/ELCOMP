public class Samsung extends Company {

    private final int code;
    private String television;
    private String refrigerator;
    private String microwaves;

    public Samsung(String name, String address, String call, String outputDevices, String inputDevices, String smartPhone, int code, String television, String refrigerator, String microwaves) {
        super(name, address, call, outputDevices, inputDevices, smartPhone);
        this.code = code;
        this.television = television;
        this.refrigerator = refrigerator;
        this.microwaves = microwaves;
    }

    @Override

    public void SmsgSell() {
        System.out.println("Samsung:");

        System.out.print( "Under " + code + " ID, you can buy "
                + television + ", " + refrigerator + ", " + microwaves + ", " + getOutputDevices() + ", " + getInputDevices() +
                ", and " + getSmartPhone());

        super.SmsgSell();
    }

    public int getCode() {
        return code;
    }

    public String getTelevision() {
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(String refrigerator) {
        this.refrigerator = refrigerator;
    }

    public String getMicrowaves() {
        return microwaves;
    }

    public void setMicrowaves(String microwaves) {
        this.microwaves = microwaves;
    }
}
