//Interfaces real time scenarios:Same Mobile With Differ Sim Cards
class Mobile  //mobile uses sim
{
	void insert_sim(Sim s)
	{
		System.out.println("Inserted SIM is of:"+s);
		s.call_rate();
		s.sms_rate();
	}
	
}
interface Sim
{
	void call_rate();
	void sms_rate();
}
class Jio implements Sim //jio is a sim
{
	public void call_rate()
	{
		System.out.println("Jio call rate is 199 per month");
	}
	public void sms_rate()
	{
		System.out.println("Jio Sms rate is 1.5Rs per sms");
	}
}

class Airtel implements Sim //Airtel is a sim
{
	public void call_rate()
	{
		System.out.println("Airtel call rate is 249 per month");
	}
	public void sms_rate()
	{
		System.out.println("Jio Sms rate is 2Rs per sms");
	}
}

class Mobile_user
{
	public static void main(String args[])
	{
		Mobile samsung=new Mobile(); //mobile user has a mobile
		
		samsung.insert_sim(new Jio());
		samsung.insert_sim(new Airtel());
	}
}