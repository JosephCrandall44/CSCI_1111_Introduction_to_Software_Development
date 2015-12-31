import java.util.*;
public class BlueBunny {
	private String Flavor;
	private int Quantity;
	private double Price;
	private int Rate;
	
	public BlueBunny(String Flavor, int Quantity, double Price, int Rate ){
		this.Flavor=Flavor;
		this.Quantity = Quantity;
		this.Price = Price;
		this.Rate = Rate;
	}
	
	@Override
	public String toString(){
		return("Manager:"+ this.getFlavor() + this.getQuantity()+ this.getPrice()+ this.getRate());
	}

	public String getFlavor() {
		return Flavor;
	}

	public void setFlavor(String flavor) {
		Flavor = flavor;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

}