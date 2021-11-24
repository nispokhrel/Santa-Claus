package santaClaus;

import java.util.List;
import java.util.ArrayList;

/**
 * This interface describes the operations of a person on the nice list.
 * 
 * @author NPokhrel
 */
public interface NicePersonInterface<T> {
	// We want the constructor to set the person's name,
	// but we do not want the client to be able to change it.
	// So we are omitting a method setName.

	/**
	 * Gets the name of this person.
	 * 
	 * @return The name of a person on the nice list.
	 */
	public Name getName();

	/**
	 * Adds a gift to this person's gift list.
	 * 
	 * @param aPresent A string that describes the gift.
	 * @return True if the gift was added, or false if not.
	 */
	public boolean addGift(String aGift);

	/**
	 * Removes a gift from this person's gift list.
	 * 
	 * @param aGift A string that describes the gift.
	 * @return True if the gift was removed, or false if not.
	 */
	public boolean removeGift(String aGift);

	/**
	 * Sets this person's gift list.
	 * 
	 * @param aGift A string that describes the gift.
	 */
	public void setGifts(ArrayList<String> gifts);

	/**
	 * Gets this person's gift list.
	 * 
	 * @return This person's gift list.
	 */
	public ArrayList<String> getGifts();
} // end NicePersonInterface