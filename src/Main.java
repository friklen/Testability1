public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_000;
        int miles = service.calculate(price); // должно получиться 1000
        System.out.println(miles);
    }
}
