package classes;

import java.lang.*;

public class SilverPackage extends IPackage
{
	private String hotelType;
	
	public SilverPackage(){}
	public SilverPackage(String iPackageNumber, Tourist tourist, double amountOfDay, String hotelType)
	{
		super(iPackageNumber, tourist, amountOfDay);
		this.hotelType = hotelType;
	}
	
	public void setHotelType(String hotelType)
	{
		this.hotelType = hotelType;
	}
	public String getHotelType()
	{
		return hotelType;
	}
	
	public void showDetails()
	{
		System.out.println();
		System.out.println("\t\t\t**** Silver Package Information ****");
		System.out.println();

		this.getTourist().showDetails();
		System.out.println("\t\tPackage Number        : " + this.getIPackageNumber());
		System.out.println("\t\tPackage AmountOfDay   : " + this.getAmountOfDay());
		System.out.println("\t\tHotel Type            : " + hotelType);
		System.out.println();
	}
}