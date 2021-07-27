import java.util.ArrayList;

public class Company {
    private String name, address, call;
    private String outputDevices;
    private String inputDevices;
    private String smartPhone;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name, String address, String call, String outputDevices, String inputDevices, String smartPhone) {
        this.name = name;
        this.address = address;
        this.call = call;
        this.outputDevices = outputDevices;
        this.inputDevices = inputDevices;
        this.smartPhone = smartPhone;
        this.employees = employees;
    }

    public void sell() {
        System.out.println(name + " company is located at " + address + ". Call number is " + call +
                ". There are Apple & Samsung products.");
        System.out.println();

    }

    public void AppSell() {
        System.out.println(", " + outputDevices + ", " + inputDevices + ", "+ smartPhone);
        System.out.println();


    }

    public void SmsgSell() {
        System.out.println(", " + outputDevices + ", " + inputDevices + ", "+ smartPhone);

        System.out.println();

    }

    public void gain(){
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getOutputDevices() {
        return outputDevices;
    }

    public void setOutputDevices(String outputDevices) {
        this.outputDevices = outputDevices;
    }

    public String getInputDevices() {
        return inputDevices;
    }

    public void setInputDevices(String inputDevices) {
        this.inputDevices = inputDevices;
    }

    public String getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(String smartPhone) {
        this.smartPhone = smartPhone;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}