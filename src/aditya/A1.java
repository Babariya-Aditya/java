package aditya;

  class Staff{
    int code;
    String name;

    public Staff(int code,String name){
        this.code=code;
        this.name=name;

    }

    public Staff() {

    }


      public String toString(){
          return "code="+code+"\n"+"name= "+name;
      }
}
class Teacher extends Staff {
    String subject;
    String publication;
    String name;
    Teacher(String subject,String publication,String name){
        super();
        this.publication=publication;
        this.name=name;
        this.subject=subject;


    }

    public String toString(){
        return "name of teacher= "+name+" \n"+"subject= "+subject+"\n"+"publication= "+publication;
    }
}
class Officer extends Staff {
    String grade;
    Officer(String grade){
        this.grade=grade;

    }

    public String toString(){
        return "grade of officer is ="+grade;
    }
}
class Typiest extends Staff {
    int speed ;
    public Typiest(int speed ){
        this.speed=speed;

    }

    public Typiest() {

    }

    public String toString(){
        return "the speed of the typist is "+speed;
    }
}
class Regular extends Typiest {


    Regular() {
        super();

    }
    public String toString(){
        return "no parameter is passed";
    }
}
class Casual extends Typiest {
    int dailywages;
    Casual(int dailywages){
        super();
        this.dailywages=dailywages;

    }
    public String toString(){
        return "the daillywages are "+dailywages;
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

        System.out.println(s);
        System.out.println(t);
        System.out.println(o);
        System.out.println(ty);
        System.out.println(c);
        System.out.println(r);





    }
}

