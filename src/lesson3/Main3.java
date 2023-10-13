package lesson3;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        // нужно написатьь программу которая будет работать без остановки,
        // когда остановим вывести на консоль сколько прошло времени от старта

        for (int year = 0; year < 5; year++) {
            for (int day = 0; day < 365; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    for (int min = 0; min < 60; min++) {
                        for (int sec = 0; sec < 60; sec++) {
                            System.out.printf("Со старта прошло: %d года, %d дней, %d часа, %d минут , %d секунд \n", year, day, hour, min, sec);
                            Thread.sleep(1000);

                        }

                    }

                }

            }

        }
    }
}
