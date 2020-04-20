package br.com.transito_sp;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data_Traffic extends process_data {
	
	    private int birth;
	    private char cod;
	    private char gender;
	    private boolean error;
	    
		Calendar cal = GregorianCalendar.getInstance();
		private int current_year = (int) cal.get(Calendar.YEAR);
		
		//Construtor
		public Data_Traffic(int a, char b, char c)
	    {
	    	this.setYear_birthday(a);
	    	this.setGender(b);
	    	this.setRegister_code(c);
	    	save(a, b, c);
	    }
		
	    //Sets
	    public void setYear_birthday(int birthday)
	    {
	        if(((current_year - birthday) < 18) && birthday >= current_year)
	        {
	            System.out.println("Ano de nascimento incorreto");
	            this.error = true;
	        }
	        else
	        {
	        birth = birthday;
	        }
	    }
	    public void setGender(char gender_motorist)
	    {
	        if (gender_motorist == 'M' || gender_motorist == 'F')
	        {
	        	this.gender = gender_motorist;
	        }
	        else
	        {
	            System.out.println("Informação incorreta. Por favor, informe corretamente:\nM = Masculino\nF = Feminino");
	            this.error = true;
	        }
	    }
	    public void setRegister_code(char cod_reg)
	    {
	    	 if(cod_reg == 'n' || cod_reg == 's')
		        {
		            this.cod = cod_reg;
		        }
		        else
		        {
		            System.out.println("Informação incorreta. Por favor, informe corretamente:\ns = São Paulo\nn = Outro estado ");
	    	 		this.error = true;
		        }
	    }     

	    private void save(int birth_date, char gender, char cod)
	    {
	    	if(error == true)
	    	{
	    		System.out.println("Não foi cadastrado");
	    	}
	    	else {
	    	super.Add(birth, gender, cod);
	    	}
	    }
}
