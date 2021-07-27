public class Employee extends Company {
    private final int number;
    private int age;
    private String fullName, lastName, gender, experience, phoneNumber;

    public Employee(String name, String address, String call, String outputDevices, String inputDevices, String smartPhone,
                    int number, int age, String fullName, String lastName, String gender, String experience, String phoneNumber) {
        super(name, address, call, outputDevices, inputDevices, smartPhone);
        this.number = number;
        this.age = age;
        this.fullName = fullName;
        this.lastName = lastName;
        this.gender = gender;
        this.experience = experience;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void gain(){
        System.out.println("Our Employees:");
        System.out.println("We pay great attention to our employees");
    }
    public void AppleGain(){
        System.out.println();
    }
    public void SamsungGain(){
        System.out.println();
    }


    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
