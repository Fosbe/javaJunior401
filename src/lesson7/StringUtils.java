package lesson7;

public class StringUtils {
    // метод который ПРИНИМАЕТ входящим параметром емейл
    // делает проверку на валидацию емейла
    // и ПИШЕТ НА КОНСОЛЬ это корректный емейл илил нет

    public static void checkValidMail(String email) {
        // email =
        /** 1. проверяем содержание @ если ее нет , не валидный
         * 2. проверяем что @ только одна . если нет то не валидный
         * 3. Собачка должна стоять не в начале и не в конце если нет то не валидный
         * 4. должна быть точка после собачки хотя бы одна
         * 5. точка после собачки не может быть в начале или в конце
         * ДЗ добавить проверку емейлу
         */
        if (!email.contains("@")) {
            System.out.println("не содержит собачку!!!");
            return;
        }
        String[] partsJfEmeil = email.split("@");
        if (partsJfEmeil.length >2 ){
            System.out.println("собачек больше одной");
            return;
        }
        if(email.startsWith("@") || email.endsWith("@")){
            System.out.println("не может начинаться или заканчиваться с собачки");
            return;
        }

        String lastPart = partsJfEmeil[1];
        if(!lastPart.contains(".")){
            System.out.println("не содержит точку во второй части после собачки");
            return;
        }
        System.out.println("ok");
    }

}
