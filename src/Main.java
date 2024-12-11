public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 45_876;
        int miles = service.calculate(price);
        System.out.println("Бонусные мили: " + miles);
    }
}