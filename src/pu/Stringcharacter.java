package pu;

public class Stringcharacter {
    public static void main(String[] args) {
        String str = "12345";
        int count = 0;
        int a;
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " ");
              a= str.charAt(i)-'0';
              count=count+a;

        }
        System.out.println(sum(str,0));
        //System.out.println(count);
    }

    public static int sum(String str , int index){
        if(index == str.length()){
            return 0;
        }
           return  Character.getNumericValue(str.charAt(index)) + sum(str, index + 1);
    }
            }



