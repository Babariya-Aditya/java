package assignment;

import java.util.*;
class student{
    private static String college_name="PIET";
    private int studno;
    private int division;
    private String studname;
    private int DAA_marks;
    private int java_marks;
    private int cn_marks;
    private int os_marks;
    private int psnm_marks;
    private int total;
    private int percentage;
    private static student cgpa;
    private student()
    {
        //private constructor
    }
    public student getInstance()
    {
        if(cgpa==null)
        {
            cgpa=new student();
        }

        return cgpa;
    }

    public student(int studno)
    {
        this.studno=studno;
    }
    Scanner sc=new Scanner(System.in);



    public void setdetail()
    {
        System.out.println("enter the student name");
        studname=sc.next();

        System.out.println("enter the student divison");
        division=sc.nextInt();

        System.out.println("enter the daa MARKS:");
        DAA_marks=sc.nextInt();

        System.out.println("enter the java MARKS:");
        java_marks= sc.nextInt();

        System.out.println("enter the cn MARKS:");
        cn_marks=sc.nextInt();

        System.out.println("enter the os MARKS:");
        os_marks=sc.nextInt();

        System.out.println("enter the psnm MARKS:");
        psnm_marks=sc.nextInt();
    }
    public void calculateMarks()
    {
        total=(DAA_marks+psnm_marks+java_marks+os_marks+cn_marks);
        percentage=total/5;
    }
    public void putData()
    {
        System.out.println("NAME :"+studname+"\nDIVISION : "+division+"\n STUDENT ID: "+studno+"\n COLLEGE NAME: "+college_name+"\n DAA MARKS :"+DAA_marks+"\n " +
                "JAVA MARKS : "+java_marks+"\n OS MARKS : "+os_marks+"\nCN MARKS : "+cn_marks+"\n PSNM MARKS: "+psnm_marks+"\ntotal of the marks is:"+total+"" +
                "\n percentage : "+percentage);
    }
    public void typecasting()
    {
        float total1=total;
        float percentage2=percentage;
        System.out.println("value of the total and percentage after type casting: "+total1+","+percentage2);
    }
    public void change(student obj)
    {
        System.out.println("enter new no.");
        studno=sc.nextInt();
        obj.studno=studno;
    }

    public static void main(String[] args) {
        student s1= new student(101);
        s1.setdetail();
        s1.calculateMarks();
        s1.putData();
        s1.typecasting();
        s1.change(s1);
        s1.putData();
    }
}
