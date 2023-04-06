package inheritance;
class Empid{
    int id;
    int salary;
    String name;
    Empid(int id,int salary,String name){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("   id = "+id+"   name =  "+name+"   salary =  "+salary);
    }

}
class Address{
    int house_no;
    String Street;
    String state;
    String country;

    Address(int house_no,String Street,String state,String country){
        this.house_no=house_no;
        this.Street=Street;
        this.state=state;
        this.country=country;


    }
    void fun(){
        System.out.println("house_no= "+house_no+"  Street  ="+Street+"  state   "+state+"  country  "+country);
    }
}


public class employee {
    public static void main(String[] args ){
        Address a=new Address(8,"h1","guj","india");
        Empid a1=new Empid(15,8777,"aditya");
        a.fun();
        a1.display();
    }
}
