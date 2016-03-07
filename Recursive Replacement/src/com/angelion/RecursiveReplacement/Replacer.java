package com.angelion.RecursiveReplacement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Replacer {
		public void replaceEverythingHere(String path, String s1, String s2)throws Exception {
		File f = new File(path);
		if(f.isFile()){
			replaceFile(path, s1, s2);
		}
		else if(f.isDirectory()) {
			File fa[] = f.listFiles();
			for(File ce : fa){
				replaceEverythingHere(ce.getAbsolutePath(), s1, s2);
			}
		}
		else {
			IOException e = new IOException("Bhai path tw sahi bta");
			throw e;
		}
	}
	
	public void replaceFile(String path, String s1, String s2) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String text ="";
			String s = br.readLine();
			while(s!=null){
				text = text + s + "\r\n";
				text = text.replaceAll(s1, s2);
				s = br.readLine();
			}
			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			pw.write(text);
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
