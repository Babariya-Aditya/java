package assignment;

class account
{
    int AccNO;
    String AccName;
    float Balance;

    account()
    {

        System.out.println("account created");
    }
    account(int accno,String accname,float bal)
    {
        this.AccNO=accno;
        this.AccName=accname;
        this.Balance=bal;
    }


    void deposit(Object o,float money)
    {
        account ob = (account)o;
        ob.Balance=ob.Balance+money;
        System.out.println("Money : "+money+"\n is deposited to account : "+ob.AccNO+"\n the current Balance is : "+ob.Balance);
    }


    void withdraw(Object o,float money)
    {
        account ob = (account)o;
        if (ob.Balance-money<=0)
        {
            System.out.println("!!!Not enough money in account!!!");
        }
        else{
            ob.Balance=ob.Balance-money;
            System.out.println("Money : "+money+"\n is withdrawed from account : "+ob.AccNO+"\n the current Balance is : "+ob.Balance);
        }
    }


    int maxbal(Object o1,Object o2)
    {
        account obj1 = (account) o1;
        account obj2 = (account) o2;
        if(obj1.Balance>obj2.Balance)
        {
            System.out.println("Account no."+obj1.AccNO+" is having max balance");
            return 0;
        }
        else if(obj1.Balance==obj2.Balance)
        {
            System.out.println("Both the account have the same balance");
            return 0;
        }
        else
        {
            System.out.println("Account no."+obj2.AccNO+" is having max balance");
            return 0;
        }
    }
}
public class L5
{
    public static void main(String[] args)
    {
        account a1 = new account(8746,"john",16800);
        account a2 = new account(8874,"jack",14500);
        a1.deposit(a1,8650);
        a1.withdraw(a1,4560);
        a1.maxbal(a2, a1);
    }
}