package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.workerLevel;

public class worker {
	
	private String name;
	private workerLevel level;
	private Double baseSalary;
	
	private department department;
	private List<hourContract> contracts = new ArrayList<>();
	
	public worker() {		
	}

	public worker(String name, workerLevel level, Double baseSalary, entities.department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public workerLevel getLevel() {
		return level;
	}

	public void setLevel(workerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public department getDepartment() {
		return department;
	}

	public void setDepartment(department department) {
		this.department = department;
	}

	public List<hourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(hourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(hourContract contract) {
		contracts.remove(contract);
	}

	public double income (int year, int month) {
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (hourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				soma += c.totalValue();
			}
		}
		return soma;
	}

}
