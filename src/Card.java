
public class Card {
	
	private String suit;
	private int rank;
	
	public Card() 
	{}
	
	public Card (String suit, int rank) 
	{
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() 
	{
		return suit;
	}

	public void setSuit(String suit) 
	{
		this.suit = suit;
	}

	public int getRank() 
	{
		return rank;
	}

	public void setRank(int rank) 
	{
		this.rank = rank;
	}

	@Override
	public String toString() 
	{
		return  rankCheck() + " of " + suit;
	}
	
	public String rankCheck() {
		
		
		if(rank == 11) 
		{
			Integer.toString(rank);
			return "Jack";
		}
		
		else if (rank == 12)
		{
			Integer.toString(rank);
			return "Queen";
		}
		
		else if (rank == 13)
		{
			Integer.toString(rank);
			return "King";
		}
		
		else if (rank == 1)
		{
			Integer.toString(rank);
			return "Ace";
		}
		
		else
		{
			return Integer.toString(rank);
		}
	}
}
