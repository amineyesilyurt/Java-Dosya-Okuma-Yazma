package amine;

import java.io.*;

public class ReadFile {
	
	private  String filename="test.txt";
	
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	

	
	//dosyadan bir satır okur ve sonucu döndürü
	public static String readLine(){
		
		String str=null;
		
		
	
		try{
			ReadFile rd1=new ReadFile();
			
			FileInputStream fstream= new FileInputStream(rd1.filename);
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader breader = new  BufferedReader(new InputStreamReader(dstream));
			
			str= breader.readLine();
			
			dstream.close();
		}catch(Exception e){
			System.err.println("Hata "+e.getMessage());
			
		}
		
		return str;
	}
	
	public static  void splitLine(String splitter){
		ReadFile rd2=new ReadFile();
		
		String str="";
		String allLines="";
		
		try{
			FileInputStream fstream= new FileInputStream(rd2.filename);
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader breader = new  BufferedReader(new InputStreamReader(dstream));
		
			while( (str=breader.readLine()) !=null)
			
			allLines += str ;
			
			dstream.close();
		}catch(Exception e){
			System.err.println("Hata "+e.getMessage());
			
		}
		
		String [] splittedLine= allLines.split(splitter);
		
		for(int i=0; i<splittedLine.length;++i){
			
			System.out.println(splittedLine[i]);
		}
	}


}
