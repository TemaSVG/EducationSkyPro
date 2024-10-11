public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Task 1");
        System.out.println(String.format("%s\n%s\n%s", dog, cat, paper));

        System.out.println("Task 2");
        var dogIncrease = dog + 4;
        var catIncrease = cat + 4;
        var paperIncrease = paper + 4;
        System.out.println(String.format("%s\n%s\n%s", dogIncrease, catIncrease, paperIncrease));

        System.out.println("Task 3");
        var dogDecrease = dog - 3.5;
        var catDecrease = cat - 1.6;
        var paperDecrease = paper - 7639;
        System.out.println(String.format("%s\n%s\n%s", dogDecrease, catDecrease, paperDecrease));

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Task 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var TotalWeight = boxer1 + boxer2;
        var MassDifference = boxer2 - boxer1;
        System.out.println(String.format("Общая масса боксеров %s кг.\nРаздница в весе баксеров %s кг.", TotalWeight, MassDifference));

        System.out.println("Task 7");
        var remainder = boxer2 % boxer1;
        System.out.println("Остаток от деления массы " + remainder);

        System.out.println("Task 8");
        var Employees = 640 / 8;
        var Employees2 = Employees + 94;
        var WorkingHours = Employees2 / 8;
        System.out.println(String.format("Всего работников в компании - %s человек.\nЕсли в компании работает %s человек, то всего %s часов работы может быть поделено между сотредниками.", Employees, Employees2, WorkingHours));
    }
}
