//The purpose of this class is to model a television
//David Icaza 10/04/2024
public class Television 
{
	private String MANUFACTURER; //holds brand name
	private int SCREEN_SIZE; // holds size of tv screen
	private boolean powerOn; // holds value true if power is on
	private int channel; //holds value of the channel tv is on
	private int volume; //holds a number value representing volume of tv
	
	/**
	 * This constructor brings in information for the manufacturer and the screen size
	 * It also sets the power of the tv to false, meaning its off, the volume to 20
	 * and the channel to 2
	 * @param manufacturer
	 * @param screenSize
	 */
	public Television(String manufacturer, int screenSize)
	{
		MANUFACTURER = manufacturer;
		SCREEN_SIZE = screenSize;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	
	//Accesor Methods
	/**
	 * 
	 * @return
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	//Mutator Methods
	/**
	 * 
	 * @param c
	 */
	public void setChannel(int c)
	{
		channel = c;
	}
	
	/**
	 * 
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	 * 
	 */
	public void increaseVolume()
	{
		volume +=1;
	}
	
	/**
	 * 
	 */
	public void decreaseVolume()
	{
		volume -= 1;
	}
	
}
