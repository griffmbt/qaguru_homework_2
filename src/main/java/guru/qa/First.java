package guru.qa;

public class First {
    public static void main(String[] args) {
        Car volvo = new Car("Sweden", 1999, 150, true, false);
        Car lada = new Car("Russia", 2010, 100, false, false);

        volvo.showCertificate();
        volvo.sendForRecycling();
        volvo.showCarAge();
        volvo.showBudget();
        volvo.provideService();
        volvo.showBudget();

        lada.showCertificate();
        lada.sendForRecycling();
        lada.showCarAge();
        lada.provideService();
        lada.showBudget();
    }
}
