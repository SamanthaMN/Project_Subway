package br.com.transito_sp;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Percentage_data extends process_data {
	
	Calendar cal = GregorianCalendar.getInstance();
	private int current_year = (int) cal.get(Calendar.YEAR);
	
	private int Calculate_Percentage(int value)
	{
		float porcent = (value / 100) * 100;
		return (int) porcent;
	}
	
	public String percentage_idade()
	{
		int parameter = current_year - 25;
		int Quantity_age = roam_age(parameter);
		int porcent_age = Calculate_Percentage(Quantity_age);
		String Result_age = "O porcentual de pessoas maiores de 25 anos é: "+ porcent_age + '%';
		
		return Result_age;
	}
}
