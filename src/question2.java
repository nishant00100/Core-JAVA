
class Car{
    String model;
    int year;
    static int numberOfCars = 0;
    Car(){
        numberOfCars++;
    }
}

public class question2 {
    public static void main(String[] args) {
        System.out.println("Detail of cars : ");
        Car c1 = new Car();
        c1.model = "2023-rolls-royce";
        c1.year = 2025;

        System.out.println("model of car1 : " + c1.model);
        System.out.println("year of car1 : " + c1.year);


        Car c2 = new Car();
        c2.model = "2023-g-wagon";
        c2.year = 2023;

        System.out.println("model of car2 : " + c2.model);
        System.out.println("year of car2 : " + c2.year);

        //
//
//        System.out.println("number of cars : " + car.numberOfCars);
    }
}




