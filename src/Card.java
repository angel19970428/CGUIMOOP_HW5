
/*
 * Description:  �B�z�C�ƵP�����B�I�ƪ�class�A�æ�printCard�BgetSuit
 * �BgetRank���T�ؤ�k�C
 */
class Card {
	enum Suit{Club,Diamond,Heart,Spade}; //Declare the Suit enumerated type.
	private Suit  suit;//Club,Diamond,Heart,Spade
	private int rank; // 1~13

	public Card(Suit s, int r) {//Constructors
	    suit = s;
		rank = r;
	}

	public void printCard() {
		System.out.println(suit+" "+ rank);

		// Hint: print (System.out.println) card as suit,rank, for example:
		// print Club,1 as Clubs Ace

	}

	public Suit getSuit() {
		return suit;//Return type is Suit
	}

	public int getRank() {
		return rank;//Return type is int
	}
}


