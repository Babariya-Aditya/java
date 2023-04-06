package enums;
enum DAYS{
    MON,TUE,WED,THU,FRI,SAT
}

public class FOR {
    public static void main(String[]args){

    DAYS arr[]=DAYS.values();
    for(DAYS a:arr){
        System.out.println(a+"is index"+a.ordinal());
    }


    }


}
