package com.belhard.univercity;

public class App {

	public static void main(String[] args) {
		
		Student student1 = new Student("Philosophy", "1", 29.0);
		Personal data1 = new Personal("Vasia", "Rogov");
		student1.setPersonal(data1);
		student1.getPersonal();
		Address address1 = new Address("Belarus ", "Minsk ", "Pinskaia", 10);
		student1.setAddress(address1);
		System.out.println(student1.toString());
//		System.out.println(address1.toString());
		
		Student student2 = new Student("Philosophy", "1", 29.0);
		Student student3 = new Student("Philosophy", "1", 58.0);
		Student student4 = new Student("Philosophy", "1", 58.0);
		Student student5 = new Student("Philosophy", "1", 29.0);
		Student student6 = new Student("Philosophy", "1", 29.0);
		Student student7 = new Student("Philosophy", "1", 14.5);
		Student student8 = new Student("Philosophy", "1", 29.0);
		
		Personal data2 = new Personal("Olga", "Loyko");
		Personal data3 = new Personal("Oleg", "Veschiy");
		Personal data4 = new Personal("Sergey", "Chaliy");
		Personal data5 = new Personal("Slava", "Komisarenko");
		Personal data6 = new Personal("George", "Kluni");
		Personal data7 = new Personal("Grisha", "Ozverevhiy");
		Personal data8 = new Personal("Masha", "Nasha");
		student2.setPersonal(data2);
		student3.setPersonal(data3);
		student4.setPersonal(data4);
		student5.setPersonal(data5);
		student6.setPersonal(data6);
		student7.setPersonal(data7);
		student8.setPersonal(data8);
		
		Address address2 = new Address("Belarus ", "Minsk ", "Levaia", 18, 56);
		Address address3 = new Address("Belarus ", "Minsk ", "Kosmosa", 12, 1);
		Address address4 = new Address("Belarus ", "Minsk ", "Panskaia", 26, 8);
		Address address5 = new Address("Belarus ", "Minsk ", "Koneva", 6, 96, "B");
		Address address6 = new Address("USA", "Ney York", "Fisrt", 10, 69, "C");
		Address address7 = new Address("Belarus ", "Minsk ", "Podmuhina", 133, 56);
		Address address8 = new Address("Belarus ", "Minsk ", "Neviadomaia", 1);
		
		student2.setAddress(address2);
		student3.setAddress(address3);
		student4.setAddress(address4);
		student5.setAddress(address5);
		student6.setAddress(address6);
		student7.setAddress(address7);
		student8.setAddress(address8);
		
		Teacher teacher = new Teacher();
		teacher.setSalary(1200.0);
		Personal data9 = new Personal("Vasiliy", "Nepiterskiy");
		teacher.setPersonal(data9);
		Address address9 = new Address("Germany", "Berlin", "Rohde Shtrasse" , 35, 458, "A");
		teacher.setAddress(address9);
		
		System.out.println(teacher.toString());
		
	}

}
