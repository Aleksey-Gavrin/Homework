public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        var firstBoxerWeith = 78.2;
        var secondBoxerWeith = 82.7;
        var bothBoxersWeith = firstBoxerWeith + secondBoxerWeith;
        System.out.println (bothBoxersWeith);
        var weithDifference = secondBoxerWeith - firstBoxerWeith;
        System.out.println (weithDifference);

        weithDifference = secondBoxerWeith - firstBoxerWeith;
        System.out.println (weithDifference);
        weithDifference = secondBoxerWeith % firstBoxerWeith;
        System.out.println (weithDifference);

        var timeTotal = 640;
        var timePerEmployee = 8;
        var employeesNumber = timeTotal / timePerEmployee;
        System.out.println ("Всего работников в компании - " + employeesNumber + " человек.");

        var employeesNumberNew = employeesNumber + 94;
        var timeTotalNew = employeesNumberNew * timePerEmployee;
        System.out.println ("Если в компании работает " + employeesNumberNew + " человек, то всего " + timeTotalNew + " часов работы может быть поделено между сотрудниками.");



    }
}