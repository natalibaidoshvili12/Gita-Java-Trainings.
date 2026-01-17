package january17;

public class Main {

    public static void main(String[] args) {
        Tour cityTour = new CityTour("Rome", 4, 120);
        Tour beachTour = new BeachTour("Bali", 7, 200, 500);
        System.out.println(cityTour.getDescription());
        System.out.println(beachTour.getDescription());
    }

}
