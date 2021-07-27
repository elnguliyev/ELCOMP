public class SamsungEmployee extends Employee {

    private final int smsgId;
    private String smsgEmp;

    public SamsungEmployee(String name, String address, String call, String outputDevices, String inputDevices,
                           String smartPhone, int number, int age, String fullName, String lastName, String gender,
                           String experience, String phoneNumber, int smsgId, String smsgEmp) {
        super(name, address, call, outputDevices, inputDevices, smartPhone, number, age, fullName, lastName, gender, experience, phoneNumber);
        this.smsgId = smsgId;
        this.smsgEmp = smsgEmp;
    }
    public void SamsungGain(){
        System.out.println("Samsung Employee:");
        System.out.print("Under " + smsgId + " ID, our employee " + smsgEmp + ", " + getFullName() + " " + getLastName() +
                "gain 15 man per day. ");
    }
    public int getSmsgId() {
        return smsgId;
    }

    public String getSmsgEmp() {
        return smsgEmp;
    }

    public void setSmsgEmp(String smsgEmp) {
        this.smsgEmp = smsgEmp;
    }
}
