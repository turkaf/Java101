
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name, int salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if(this.salary <= 1000) {
			return salary;
		}
		return salary*0.03;
	}
	
	double bonus(){
		if(workHours<=40) {
			return 0;
		}
		return (workHours - 40)*30;
	}
	
	double raiseSalary() {
		if((2021-hireYear) < 10) {
			return salary*0.05;
		}else if((2021-hireYear)>9 && (2021-hireYear)<20) {
			return salary*0.10;
		}else if((2021-hireYear)>19) {
			return salary*0.15;
		}
		return 0;
	}
	
	public String toString() {
		String infos = "Adı: " + this.name +
				"\nMaaı: " + this.salary + " ₺" +
				"\nÇalışma Saati: " + this.workHours +
				"\nBaşlangıç Yılı: " + this.hireYear +
				"\nVergi: " + tax() +
				"\nBonus: " + bonus() +
				"\nMaaş Artışı: " + raiseSalary() +
				"\nVergi ve Bonuslar ile birlikte maaş: " + (this.salary + raiseSalary() + bonus() - tax());
				
		return infos;
	}
	
	
	
}
