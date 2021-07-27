public class AppleEmployee extends Employee {

    private final int ApId;
    private String AppEmp;

    public AppleEmployee(String name, String address, String call, String outputDevices, String inputDevices, String smartPhone,
                         int number, int age, String fullName, String lastName, String gender, String experience,
                         String phoneNumber, int apId, String appEmp) {
        super(name, address, call, outputDevices, inputDevices, smartPhone, number, age, fullName, lastName,
                gender, experience, phoneNumber);
        ApId = apId;
        AppEmp = appEmp;
    }
    public void AppleGain(){
        System.out.println("Apple Employee:");

        System.out.println("Under " + ApId + " ID, our employee " + AppEmp + ", " + getFullName() + " " + getLastName() +
                "gain 20 man per day. ");
    }
    public int getApId() {
        return ApId;
    }

    public String getAppEmp() {
        return AppEmp;
    }

    public void setAppEmp(String appEmp) {
        AppEmp = appEmp;
    }


}
