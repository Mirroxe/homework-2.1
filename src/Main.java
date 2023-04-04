public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных и параметров программы
        double ticketPrice = 15064.0; // стоимость билета
        int milesPerRub = 15; // количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = (int) (ticketPrice / milesPerRub);

        // Выводим результат на экран
        System.out.println("За покупку билета стоимостью " + ticketPrice + " руб. начислено " + bonusMiles + " бонусных миль");
    }
}