package com.meritamerica.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//private Test() {
			String path = ("src/main/java/data.txt");
			long acn;
			double bal;
			double intRate;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			
			
			try {
			//String path = "data.txt";
				File file = new File(path);
				Scanner reader = new Scanner(file);
				ArrayList<String> sList = new ArrayList<String>();		
						
					while(reader.hasNextLine()) {
						String data = reader.nextLine();
						if(data.equals("")) break;
						sList.add(data);
					}
					
					String accountData = sList.get(8);
					System.out.println(accountData);
					
					reader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("Test");
				e.printStackTrace();
			}
			//catch (Exception e) {
		}	//e.printStackTrace(){
				
	}


	
	/*static BankAccount readFromString(String accountData) {
		String path = "data.txt";
		long acn;
		double bal;
		double intRate;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			File file = new File(path);
			Scanner reader = new Scanner(file);
		
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				String nextAcn = data;
				
				
				
				
				
				
				String [] dataSplit = data.split(",");
				//Person p = new Person(dataSplit[0]);
				acn = Long.parseLong(dataSplit[0]);
				bal = Double.parseDouble(dataSplit[1]);
				intRate = Double.parseDouble(dataSplit[2]);
				Date aDate = dateFormat.parse("01/01/2020");
			}
		// add in ParseException
			reader.close();
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}	
}*/
