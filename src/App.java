import DayOfWeek.DayOfWeek;
import ForLoop.SumOfTwoNumbers;
import NumberInWord.NumberInWord;
import NumberOfDaysInMonth.NumberOfDaysInMonth;
import SumOdd.SumOdd;
import Switch.Switch;

public class App {
    public static void app(){
        // Switch.Switch with int Testing
        System.out.println("Switch.Switch with int");
        System.out.println(Switch.switchCase(5));
        System.out.println(Switch.switchCase(10));
        System.out.println(Switch.switchCase(1));
        System.out.println("-------------------------------");

        // Switch.Switch with char Testing
        System.out.println("Switch.Switch with char");
        System.out.println(Switch.switchCase('A'));
        System.out.println(Switch.switchCase('C'));
        System.out.println(Switch.switchCase('K'));
        System.out.println("-------------------------------");

        // Switch.Switch with String Testing
        System.out.println("Switch.Switch with String");
        System.out.println(Switch.switchCase("March"));
        System.out.println(Switch.switchCase("June"));
        System.out.println(Switch.switchCase("jaNuaRy"));
        System.out.println("-------------------------------");

        // Switch.Switch Day Of Week Testing
        System.out.println("Switch.Switch Day Of Week");
        DayOfWeek.printDayOfTheWeekSwitch(1);
        DayOfWeek.printDayOfTheWeekSwitch(7);
        DayOfWeek.printDayOfTheWeekSwitch(10);
        DayOfWeek.printDayOfTheWeekSwitch(3);
        System.out.println("-------------------------------");

        // If Day Of Week Testing
        System.out.println("If Day Of Week");
        DayOfWeek.printDayOfTheWeekIf(2);
        DayOfWeek.printDayOfTheWeekIf(6);
        DayOfWeek.printDayOfTheWeekIf(11);
        DayOfWeek.printDayOfTheWeekIf(5);
        System.out.println("-------------------------------");

        // Number In Word Testing
        System.out.println("Number In Word");
        NumberInWord.printNumberInWord(2);
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(10);
        System.out.println("-------------------------------");

        // Number Of Days In Month Testing
        System.out.println("Number Of Days In Month");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 1999));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(10, 1997));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-4, 1830));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(5, -1900));
        System.out.println("-------------------------------");

        // Sum Of Two Numbers Testing
        System.out.println("Sum Of Two Numbers");
        SumOfTwoNumbers.sumOf3And5();
        System.out.println("-------------------------------");

        // Sum of Odd Numbers Testing
        System.out.println("Sum of Odd Numbers");
        System.out.println(SumOdd.sumOdd(2,8));
        System.out.println(SumOdd.sumOdd(-2,20));
        System.out.println(SumOdd.sumOdd(30,100));
        System.out.println(SumOdd.sumOdd(17,17));
        System.out.println("-------------------------------");
    }
}
