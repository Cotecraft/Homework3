public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1-2");
        float apple = 27.2F;
        double banana = 987.678965549;
        double pineapple = 2.786;
        short lemon = 569;
        short lime = -159;
        short cherry = 27897;
        byte orange = 67;
        System.out.println("Значение переменной apple с типом float равно " + apple);
        System.out.println("Значение переменной banana с типом double равно " + banana);
        System.out.println("Значение переменной pineapple с типом double равно " + pineapple);
        System.out.println("Значение переменной lemon с типом short равно " + lemon);
        System.out.println("Значение переменной lime с типом short равно " + lime);
        System.out.println("Значение переменной cherry с типом short равно " + cherry);
        System.out.println("Значение переменной orange с типом byte равно " + orange);

        System.out.println("Задача 3");

        byte Lidia = 23;
        byte Anna = 27;
        byte Ekaterina =30;
        int people = Lidia + Anna + Ekaterina;
        int paper = 480;
        System.out.println(people + " Учеников у Лиды");
        System.out.println(Anna + " Учеников у Анны");
        System.out.println(Ekaterina + " Учеников у Екатерины");
        System.out.println(people + " Учеников Всего");
        System.out.println(paper + " Листов бумаги закуплено");
        int notebook = paper / people;
        System.out.println(notebook + " Листов бумаги на каждого");

        System.out.println("Задача 4");

        byte twoMin = 16;
        byte oneMin = 8;
        int twenty = oneMin * 20;
        int day = oneMin * 1440;
        int threeDays = day * 3;
        int month = day * 30;
        System.out.println(twenty + " Бутылок - производительность за 20 минут");
        System.out.println(day + " Бутылок - производительность за 1 день");
        System.out.println(threeDays + " Бутылок - производительность за 3 дня");
        System.out.println(month+ " Бутылок - производительность за месяц");

        System.out.println("Задача 5");

        byte paint = 120;
        byte classroom = 6;
        int rooms = paint / classroom;
        byte white = 2;
        byte brown = 4;
        int whiteAll = white * rooms;
        int brownAll = brown * rooms;
        System.out.println(paint + " Всего банок раски куплено");
        System.out.println(white + " белой " + brown + " коринченовй Банок на класс");
        System.out.println(rooms + " Классов всего");
        System.out.println(whiteAll + " Банок белой краски закуплено");
        System.out.println(brownAll + " Банок коричневой краски закуплено");

        System.out.println("Задача 6");

        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int mix = bananas + milk + iceCream + eggs;
        float mixKg = mix / 1000f;
        System.out.println(mix + " Вес в г");
        System.out.println(mixKg + " Вес в кг");

        System.out.println("Задача 7");

        float goal = 7.000f;
        float rationOne = 0.250f;
        float rationTwo = 0.500f;
        float pathOne = goal / rationOne;
        float pathTwo = goal / rationTwo;
        System.out.println(pathOne + " Дней понадобится в первом случае");
        System.out.println(pathTwo + " Дней понадобится во втором случае");

        System.out.println("Задача 8");

        float mashaNow = 67760f;
        float denisNow = 83690f;
        float krisNow = 76230f;
        double mashaBonus = mashaNow / 100 * 10;
        double denisBonus = denisNow / 100 * 10;
        double krisBonus = krisNow / 100 * 10;
        System.out.println(mashaBonus + " Рублей рибавка Маши");
        System.out.println(denisBonus + " Рублей рибавка Дениса");
        System.out.println(krisBonus + " Рублей рибавка Кристины");
        double mashaNew = mashaNow + mashaBonus;
        double denisNew = denisNow + denisBonus;
        double krisNew = krisNow + krisBonus;
        double mashaYearNew = mashaNew * 12;
        double mashaYearOld = mashaNow * 12;
        double denisYearNew = denisNew * 12;
        double denisYearOld = denisNow * 12;
        double krisYearNew = krisNew * 12;
        double krisYearOld = krisNow * 12;
        double mashaDiff = mashaYearNew - mashaYearOld;
        double denisDiff = denisYearNew - denisYearOld;
        double krisDiff = krisYearNew - krisYearOld;
        System.out.println(mashaYearNew + " Рублей Маша получает теперь в год, это на " + mashaDiff + " рублей больше");
        System.out.println(denisYearNew + " Рублей Денис получает теперь в год, это на " + denisDiff + " рублей больше");
        System.out.println(krisYearNew + " Рублей Кристина получает теперь в год, это на " + krisDiff + " рублей больше");



    }
}