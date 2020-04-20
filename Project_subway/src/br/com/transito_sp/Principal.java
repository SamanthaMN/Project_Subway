package br.com.transito_sp;

public class Principal {

	public static void main(String[] args) {
		
		Data_Traffic new_data = new Data_Traffic(1950,'M','s');
		Data_Traffic new_data1 = new Data_Traffic(2000,'F','n');
		
		Percentage_data age = new Percentage_data();
		System.out.println(age.percentage_idade());
	}
}
