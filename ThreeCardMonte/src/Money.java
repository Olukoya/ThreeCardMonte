
public class Money 
{
	private double bet, earning, amount;
	int choice;
	
	public Money()
	{
		bet = 0;
		earning = 0;
		amount = 0;
	}
	
		public void setBet (double bet)
		{
			this.bet = bet;
		}
		
		public double getBet ()
		{
			return bet;
		}
		
		public void setEarning (double earning)
		{
			this.earning = earning;
		}
		
		public double getEarning ()
		{
			return earning;
		}
		
		public void setAmount (double amount)
		{
			this.amount = amount;
		}
		
		public double getAmount ()
		{
			return amount;
		}
		
		public void setChoice (int choice)
		{
			this.choice = choice;
		}
		
		public int getChoice ()
		{
			return choice;
		}
}
