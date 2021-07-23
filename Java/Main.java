class BankData
{
    public static void main(String[] args)
    {
        Account Mahesh = new Account("101","Mahesh","Morvis",23000.00f);
        Transaction t1 = new Transaction("P12459823");
        t1.diposit(Mahesh,7000.00f);
        System.out.println("Account Blanace: "+Mahesh.getBalance());
        Transaction t2 = new Transaction("P12459824");
        t2.withDraw(Mahesh,40000.00f);
        System.out.println("Account Blanace: "+Mahesh.getBalance());
        Transaction t3 = new Transaction("P12459825");
        t3.withDraw(Mahesh, 20000.00f);
        System.out.println("Account Blanace: "+Mahesh.getBalance());
        Transaction t4 = new Transaction("P12459826");
        t4.diposit(Mahesh,-7000.00f);
        System.out.println("Account Blanace: "+Mahesh.getBalance());
    }
}

class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException()
    {
        super("Your Withdraw Ammount is to more, Please enter Ammount which is less than or equals to Account Balance");
    }
    InsufficientBalanceException(String s)
    {
        super(s);
    }
}
class NegativeValueException extends Exception
{
    NegativeValueException()
    {
        super("Your Entered Value is Negative");
    }
    NegativeValueException(String s)
    {
        super(s);
    }
}
class Transaction
{
    String tnxID;
    Transaction(String tnxID)
    {
        this.tnxID = tnxID;
    }
    void withDraw(Account ac , float withDrawAmmount)
    {
        try
        {
            if(ac.AccBalance >= withDrawAmmount)
            {
            ac.AccBalance = ac.AccBalance - withDrawAmmount;
            }
            else
            {
                throw new InsufficientBalanceException();
            }
        }
        catch(InsufficientBalanceException ibe)
        {
            System.out.println(ibe);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void diposit(Account ac, float dipositAmmount)
    {
        try
        {
    
            if(dipositAmmount >=0)
            {
                ac.AccBalance = ac.AccBalance + dipositAmmount;
            }
            else
            {
                throw new NegativeValueException("Diposit Ammount is less than zero, Ammount must be greater than or equals to zero");
            }
        }
        catch(NegativeValueException nve)
        {
            nve.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class Account
{
    String accNo;
    String accHolderName;
    String Address;
    float AccBalance;
    Account(String accNo,String accHolderName,String Address,float AccBalance)
    {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.Address = Address;
        this.AccBalance = AccBalance;
    }
    void setBalance(float balance)
    {
        this.AccBalance = balance;
    }
    float getBalance()
    {
        return this.AccBalance;
    }
}
