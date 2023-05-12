import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class NumDaysOfMonth {
    public static void main(String[] args) {
        Hashtable<String, Integer> months = new Hashtable<String, Integer>();

        months.put("January", 1);
        months.put("Jan.", 1);
        months.put("Jan", 1);
        months.put("February", 2);
        months.put("Feb.", 2);
        months.put("Feb", 2);
        months.put("March", 3);
        months.put("Mar.", 3);
        months.put("Mar", 3);
        months.put("April", 4);
        months.put("Apr.", 4);
        months.put("Apr", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("Jun", 6);
        months.put("July", 7);
        months.put("Jul", 7);
        months.put("August", 8);
        months.put("Aug.", 8);
        months.put("Aug", 8);
        months.put("September", 9);
        months.put("Sept.", 9);
        months.put("Sep", 9);
        months.put("October", 10);
        months.put("Oct.", 10);
        months.put("Oct", 10);
        months.put("November", 11);
        months.put("Nov.", 11);
        months.put("Nov", 11);
        months.put("December", 12);
        months.put("Dec.", 12);
        months.put("Dec", 12);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter month: ");
        String strMonth = keyboard.nextLine();

        System.out.print("Enter year: ");
        int year = keyboard.nextInt();

        int month;

        try {
            month = Integer.parseInt(strMonth);
        }
        catch(Exception e) {
            month = months.get(strMonth);
        }

        if (month == 1 || month == 3 || month == 5 || 
            month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(31);
        }
        else if (month == 2) {
            if (year % 4 != 0) 
                System.out.println(28);
            else if (year % 100 == 0 && year % 400 != 0)
                System.out.println(28);
            else
                System.out.println(29);
        }
        else
            System.out.println(30);
    }
}
