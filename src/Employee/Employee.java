package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int nowYear = 2021;
    double tax;
    double bonus;
    double rate = 0.0;
    double maasArtis = 0.0;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary>=1000){
            this.tax = this.salary * 0.03;
        }
        return this.tax;
    }
    double bonus(){
        if(this.workHours>40){
            this.bonus= (this.workHours - 40) * 30;
        }
        return this.bonus;
    }
    double raiseSalary(){
        if((this.nowYear-this.hireYear)<10){
            this.rate = 0.05;
            this.maasArtis = this.salary*this.rate;
        }if((this.nowYear-this.hireYear)>=10 && (this.nowYear-this.hireYear)<20){
            this.rate = 0.1;
            this.maasArtis = this.salary*this.rate;
        }if((this.nowYear-this.hireYear)>=20){
            this.rate = 0.15;
            this.maasArtis = this.salary*this.rate;
        }
        return this.maasArtis;
    }
    void printEmployee(){
        System.out.println("--------------Bilgiler---------------");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.salary * 0.03);
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+ (this.salary+(bonus()-tax())));
        System.out.println("Toplam Maaş :" + (this.salary+raiseSalary()));
    }
}
