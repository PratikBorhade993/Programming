//Interface real time scenarios:Amazon having various banks
class Bank
{
	void insert_bank(Amazon a)
	{
		System.out.println("Bank Inserted is:"+a);
	    
		a.head_quarter();
		a.BankType();
	}
}
interface Amazon
{
	void head_quarter();
	void BankType();
}
class SBI implements Amazon
{
	public void head_quarter()
	{
		System.out.println("Head quarter is in mumbai");
		
	}
	public void BankType()
	{
		System.out.println("SBI is nationalized bank");
	}
}
class ADC implements Amazon
{
	public void head_quarter()
	{
		System.out.println("Head quarter is in Ahemadnagar");
		
	}
	public void BankType()
	{
		System.out.println("ADC is District level bank");
	}
}
class Bank_user
{
	public static void main(String args[])
	{
		Bank RBI=new Bank();
		RBI.insert_bank(new SBI());
		RBI.insert_bank(new ADC());
	}
}