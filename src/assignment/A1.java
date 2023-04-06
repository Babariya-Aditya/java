package assignment;
class Staff{
     int code;
     String name;

     public Staff(int code,String name){
        this.code=code;
        this.name=name;

    }

    public Staff() {

    }

    void display(){
        System.out.println("code="+code+"\n"+"name= "+name);

    }
}
class Teacher extends Staff{
    String subject;
    String publication;
    String name;
    Teacher(String subject,String publication,String name){
        super();
        this.publication=publication;
        this.name=name;
        this.subject=subject;


    }
    void display(){
        System.out.println("name of teacher= "+name+" \n"+"subject= "+subject+"\n"+"publication= "+publication);
    }
}
class Officer extends Staff{
    String grade;
    Officer(String grade){
        this.grade=grade;

    }
    void display(){
        System.out.println("grade of officer is ="+grade);

    }
}
class Typiest extends Staff{
    int speed ;
    public Typiest(int speed ){
        this.speed=speed;

    }

    public Typiest() {

    }

    void display(){
        System.out.println("the speed of the typist is "+speed);
    }
}
class Regular extends Typiest{


    Regular() {
        super();

    }
    void display(){
        System.out.println("no parameter is passed");
    }
}
class Casual extends Typiest{
    int dailywages;
    Casual(int dailywages){
        super();
        this.dailywages=dailywages;

    }
    void display(){
        System.out.println("the daillywages are "+dailywages);
    }

}

public class A1 {
    public static void main(String[]args){
        Staff s=new Staff(123,"john");
        Teacher t=new Teacher("CN","h&d","Geeta");
        Officer o=new Officer("A");
        Typiest ty=new Typiest(30);
        Casual c=new Casual(300);
        Regular r=new Regular();

        s.display();
        t.display();
        o.display();
        ty.display();
        c.display();
        r.display();





    }
}
