public class Main {
    public static void main (String[] agrs) {
Plane flyMriya = new Plane();
    String[] passengers = new String[6];
        passengers[0] = "Taras Shevchenko";
        passengers[1] = "Ivan Franko";
        passengers[2] = "Lesia Ukrainka";
        passengers[3] = "Olga Kobyliaska";
        passengers[4] = "Ostap Vyshnya";
        passengers[5] = "Vasyl Stus";
        flyMriya.setPassengerNames(passengers);
    for (int i = 0; i< flyMriya.getPassengerNames().length; i++) {
        System.out.println(flyMriya.getPassenger(i));
        switch (flyMriya.getPassenger(i)){
            case "Taras Shevchenko":
                System.out.println("І мене в сім'ї великій, в сім'ї вольній, новій не забудьте пом'янути незлим тихим словом");
                break;
                case "Ivan Franko":
                System.out.println("Та сльози, анi жаль, нi бiль пекучий тiла, анi прокляття нас не вiдтягли вiд дiла");
               break;
               case "Lesia Ukrainka":
                System.out.println("Жити хочу! Геть думи сумні!");
                    break;
                    case "Olga Kobyliaska":
                System.out.println("Я буду дуже, дуже, дуже щаслива");
                break;
                case "Ostap Vyshnya":
                System.out.println("Талант — це штука дуже тендітна, і про його краще багато не будемо писати");
                    break;
                case "Vasyl Stus":
                System.out.println("За своєю душею треба стежити так само, як за тілом");
                break;
} } } }