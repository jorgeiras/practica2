package practica1x;

import java.time.LocalDate;
import java.util.ResourceBundle;

public class SaleBook extends Book2{
	
	private double price;

	public SaleBook(String title, int isbn, int pages, String type, LocalDate date, double price) {
		super(title, isbn, pages, type, date);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
public void printBook(ResourceBundle messages) {
		
		System.out.println(messages.getString("sale"));
		System.out.println(messages.getString("printtitle") + super.getTitle() + "\n" + messages.getString("printisbn") + super.getIsbn() +  "\n" + messages.getString("printpages") + super.getPages() + "\n" + messages.getString("printtype") + super.getType() + "\n" + messages.getString("printdate") + super.getDate() + "\n" + messages.getString("printprice")  + this.price + "\n");
		
	}
	

}
