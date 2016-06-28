package amine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteToFile {
	
	public static void writing(String filename){
		
		ArrayList<String> veri= new ArrayList<String>();
		
		for(int i=0;i<100 ;++i){
			veri.add("Merhaba Dünyali :) ");
		}
		FileWriter fwriter=null;
		BufferedWriter writer=null;
		
		try{
			
			fwriter= new FileWriter(filename);
			writer= new BufferedWriter(fwriter);
			
			for(int i=0;i<veri.size();++i){
				writer.write(veri.get(i));
			}
			writer.close();
		}catch(Exception e){
			
		}
	}
}
