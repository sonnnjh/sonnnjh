package www.son.vo;

public class TravelVO {
	private String contry = null;
	private String days = null;
	private String charact = null;
	
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getCharact() {
		return charact;
	}
	public void setCharact(String charact) {
		this.charact = charact;
	}
	
	@Override
	public String toString() {
		return "TravelVO [contry=" + contry + ", days=" + days + ", charact=" + charact + "]";
	}
	
	
}
