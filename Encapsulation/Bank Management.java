class Bank{
    String acc_No;
    String name;
    private int bal;
    Bank(String acc_no,String name,int bal)
    {
        this.acc_No=acc_no;
        this.name=name;
        this.bal=bal;
    }
    public void setBalance(int amt)
    {
        this.bal=amt;
    }
    public void deposit(int amt)
    {
        if(amt<0)
            System.out.println("Amount cannot be negative");
        else{
            setBalance(bal+amt);
            System.out.println("Deposited Successfully!!!");
        }
    }
    public void withdrawal(int amt)
    {
        if(amt>bal)
            System.out.println("Insufficient Balance");
        else  if(amt<0)
            System.out.println("Amount cannot be negative");
        else{
            setBalance(bal-amt);
            System.out.println("Withdrawal Successfully!!!");
        }
    }
    public void getBalance()
    {
        System.out.println("Account Number:"+acc_No);
        System.out.println("Acc_Holder's Name:"+name);
        System.out.println("Balance:"+bal);
    }
}public class main{
    public static void main(String[] args)
    {
        Bank b1=new Bank("123456","Dharanish",500);
        Bank b2=new Bank("456722","Ronaldo",2000);
        Bank b3=new Bank("987653","Dhoni",1000);
        b1.deposit(200);
        b2.deposit(500);
        b3.deposit(1000);
        b2.withdrawal(300);
        b2.getBalance();
        b1.getBalance();
        b3.withdrawal(400);
        b3.getBalance();
    }
}
