package entities;

import java.util.Date;

public class hourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;		
	
	public hourContract() {		
	}
	
	public hourContract(Date date, Double valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public double totalValue() {
		return valuePerHour * hours;
	}

}
