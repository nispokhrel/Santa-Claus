package santaClaus;
import java.util.ArrayList;
/**
 * The class implements NicePersonInterface and sets required methods
 * for storing details about nice person and Sant's gifts for them.
 * @author NPokhrel
 */

public class NicePerson<T> implements NicePersonInterface<T>{

	private Name name;                       //Name of the person
	private ArrayList<String> lGifts;        //An ArrayList of gifts
	
	//Constructor
	public NicePerson(Name name) {
		this.name=name;
		this.lGifts=new ArrayList<>();
	}
	@Override
	public Name getName() {
		return name;
	}

	@Override
	public boolean addGift(String aGift) {
		return lGifts.add(aGift);
	}

	@Override
	public boolean removeGift(String aGift) {
		boolean isRemoved=false;
		//if gift exists
		if(lGifts.contains(aGift)) {
			lGifts.remove(aGift);
			isRemoved=true;
		}
		return isRemoved;
	}

	@Override
	public void setGifts(ArrayList<String> gifts) {
		this.lGifts= gifts;
		
	}

	@Override
	public ArrayList<String> getGifts() {
		return this.lGifts;
	}



}//end
