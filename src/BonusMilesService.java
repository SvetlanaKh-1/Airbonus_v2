public class BonusMilesService {

    public int calculate(int price) {
        int oneMile = 20;
        int result = price / oneMile;
        return result;
    }
}