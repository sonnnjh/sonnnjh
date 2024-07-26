package www.son.vo;

public class MgrVO {

	private int num = 0;
	private String name = null;
	private String category = null;
	private String place = null;
	private String bestMenu = null;
	private String price = null;
	
	@Override
	public String toString() {
		return "MhrVO [num=" + num + ", name=" + name + ", category=" + category + ", place=" + place + ", bestMenu="
				+ bestMenu + ", price=" + price + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getBestMenu() {
		return bestMenu;
	}
	public void setBestMenu(String bestMenu) {
		this.bestMenu = bestMenu;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
