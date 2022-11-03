package collab;

//객체지향 & 협력 연습

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJ.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        studentT.takeSubway(greenSubway);

        studentT.showInfo();
        studentJ.showInfo();

        bus100.showBusinfo();
        bus500.showBusinfo();
        greenSubway.showSubwayinfo();
    }
}
