package Lab01;

import java.util.Scanner;

public class DayInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputMonth = sc.next();
        int year = sc.nextInt();
        if(year < 0){
            System.out.println("Re-entered year: ");
            year = sc.nextInt();
        }
        while(true){
            int val = numDaysInMonth(inputMonth, year);
            if(val != -1) break;
            System.out.println("Re-entered month and year: ");
            inputMonth = sc.next();
            year = sc.nextInt();
        }
        System.out.println(numDaysInMonth(inputMonth, year));
        System.exit(0);
    }

    public static int numDaysInMonth(String month, int years) {
        boolean leapYear;
        if((years%4 == 0 && years%100 != 0) || (years%400 == 0)) leapYear = true;
        else leapYear = false;
        switch (month) {
            case "1", "January", "Jan", "Jan.": return 31;
            case "2", "February", "Feb", "Feb.": return leapYear? 29:28;
            case "3", "March", "Mar", "Mar.": return 31;
            case "4", "April", "Apr", "Apr.": return 30;
            case "5", "May": return 31;
            case "6", "June", "Jun": return 30;
            case "7", "July", "Jul": return 31;
            case "8", "August", "Aug", "Aug.": return 31;
            case "9", "September", "Sep", "Sept.": return 30;
            case "10", "October", "Oct", "Oct.": return 31;
            case "11", "November", "Nov", "Nov.": return 30;
            case "12", "December", "Dec", "Dec.": return 31;
            default: return -1;
        }
    }
}
