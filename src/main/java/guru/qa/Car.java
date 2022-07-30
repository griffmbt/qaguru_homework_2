package guru.qa;

public class Car {
    private String origin;
    private int year;
    private int budget;
    private boolean isCarWashOutside;
    private boolean isCleanInterior;

    public Car(String origin, int year, int budget, boolean isCarWashOutside, boolean isCleanInterior) {
        this.origin = origin;
        this.year = year;
        this.budget = budget;
        this.isCarWashOutside = isCarWashOutside;
        this.isCleanInterior = isCleanInterior;
    }

    void showCertificate() {
        System.out.println("Origin: " + origin + ",\nYear: " + year);
    }

    void sendForRecycling() {
        if (year < 2000) {
            System.out.println("Ваше авто " + year + " года пора утилизировать!");
        } else if (year > 2000 && year < 2010) {
            System.out.println("Ваше авто " + year + " года скоро надо будет утилизировать");
        } else {
            System.out.println("Ваше авто " + year + " года еще актуально!");
        }
    }

    void showCarAge() {
        int carAge = 2022 - year;
        System.out.println("Возраст вашего авто: " + carAge);
    }

    void showBudget() {
        System.out.println(budget + "$");
    }

    void provideService() {
        if (isCarWashOutside) {
            System.out.println("Авто снаружи чистое!");
        } else {
            isCarWashOutside = true;
            int carWashOutside = 20;
            budget = budget - carWashOutside;

            System.out.println("Мы помыли снаружи ваше авто. Остаток бюджета: " + budget + "$");
        }

        if (isCleanInterior) {
            System.out.println("Авто внутри чистое!");
        } else {
            isCleanInterior = true;
            int cleanInterior = 10;
            budget = budget - cleanInterior;
            System.out.println("Мы помыли внутри ваше авто. Остаток бюджета: " + budget + "$");
        }
    }
}
