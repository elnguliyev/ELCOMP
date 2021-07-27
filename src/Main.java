public class Main {
    public static void main(String[] args) {

        Company comp = new Company("ElComp", "Baku, 28 May", "+994505005050", "headphones",
                "input devices", "phones");

        Apple app = new Apple("ElComp", "Baku, 28 May", "+994505005050", "airPods", "IMouse",
                "Iphone X.", 55, "Mac", "IPad","IWatch");

        Samsung smsg = new Samsung("ElComp", "Baku, 28 May", "Baku. 28 MAY", "InEar", "Printer",
                "Galaxy S 10", 33, "Samsung Qled TV", "French Door", "CounterTop");

        Employee emp = new Employee("ElComp", "Baku, 28 May", "+994505005050", "headphones",
                "input devices", "phones", 1111, ' ', "FullName",
            "LastName", "male/female", " ", "+994707007070");

        AppleEmployee firstEmployee = new AppleEmployee("ElComp", "Baku, 28 May", "+994505005050",
                "headphones",  "input devices", "phones", 2222, 20,
                "Ali","Isayev",  "male","2 years","+994707007070",
                12,"Ios Developer");

        SamsungEmployee secondEmployee = new SamsungEmployee("ElComp", "Baku, 28 May", "+994505005050",
                "headphones",  "input devices", "phones", 2222, 21,
                "Ibrahim","Sadigov",  "male","3 years","+994516006060",
                23,"Samsung Mechanic");

        comp.sell();
        app.AppSell();
        smsg.SmsgSell();
        emp.gain();
        firstEmployee.AppleGain();
        secondEmployee.SamsungGain();
    }

}
