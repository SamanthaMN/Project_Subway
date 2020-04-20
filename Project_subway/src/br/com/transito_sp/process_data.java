package br.com.transito_sp;
import java.util.ArrayList;

public class process_data {
	
	private ArrayList<String> list = new ArrayList<String>();
	private String n;
	private int position = 0;
	
	protected void Add(int birth,char gender, char cod)
	{
		String save = birth + (",") + gender + (",") + cod + (";");
		list.add(position, save); 
		position = list.size() + 1;
		System.out.println(save);
	}
	
	protected int roam_age(int param)
	{
		int porcent = 0;
		for(String a : list)
		{
			int retorno = Integer.parseInt(a.substring(0, 5));
			if(retorno > param)
			{
			 porcent += 1;
			}
		}
		return porcent;
	}
}
