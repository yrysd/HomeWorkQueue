import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Car,InfoCar>infoCarHashMap = new HashMap<>();

        infoCarHashMap.put(new Car(123,"321"),new InfoCar(2017,"Tesla",30000,"White"));
        infoCarHashMap.put(new Car(234,"432"),new InfoCar(2022,"Lamborghini Aventador",150000,"grey"));

        System.out.println(infoCarHashMap.entrySet());

    }
}