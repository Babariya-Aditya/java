package enums;

import java.util.Scanner;

enum MONTHS{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEB,OCT,NOV,DEC
}
 class enummonths{
    MONTHS months;
    public enummonths(MONTHS months){
        this.months=months;
    }
    public void exam(){
        switch(months){
            case JAN:
                System.out.println("we have exams");
                break;
            case MAR:
                System.out.println("we have external exams");
                break;
            case APR:
                System.out.println("no study");
                break;
            case NOV:
                System.out.println("no exam only chill");
                break;
            default:
                System.out.println("only chill");
                break;
        }
    }

 }
public class month {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month");
        String str=sc.nextLine();
        enummonths a=new enummonths(MONTHS.valueOf(str));
        a.exam();

    }



}
