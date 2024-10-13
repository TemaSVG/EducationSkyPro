public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(String.format("Task 1\n%s\n%s\n%s", dog, cat, paper));

        var dogIncrease = dog + 4;
        var catIncrease = cat + 4;
        var paperIncrease = paper + 4;
        System.out.println(String.format("Task 2\n%s\n%s\n%s", dogIncrease, catIncrease, paperIncrease));

        var dogDecrease = dog - 3.5;
        var catDecrease = cat - 1.6;
        var paperDecrease = paper - 7639;
        System.out.println(String.format("Task 3\n%s\n%s\n%s", dogDecrease, catDecrease, paperDecrease));

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("Task 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var TotalWeight = boxer1 + boxer2;
        var MassDifference = Math.abs(boxer1 - boxer2);
        System.out.println(String.format("Общая масса боксеров %s кг.\nРаздница в весе баксеров %s кг.", TotalWeight, MassDifference));

        System.out.println("Task 7");
        var remainder = boxer2 % boxer1;
        System.out.println("Остаток от деления массы " + remainder);

        System.out.println("Task 8");
        var Employees = 640 / 8;
        var EmployeesNew = Employees + 94;
        var WorkingHours = EmployeesNew * 8;
        System.out.println(String.format("Всего работников в компании - %s человек.\nЕсли в компании работает %s человек, то всего %s часов работы может быть поделено между сотредниками.", Employees, EmployeesNew, WorkingHours));
    }
}
