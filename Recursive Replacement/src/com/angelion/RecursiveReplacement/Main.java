package com.angelion.RecursiveReplacement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Give the file or directory");
			String path = br.readLine();
			System.out.println("Give the word to be replaced");
			String s1 = br.readLine();
			System.out.println("Give the word to replace it");
			String s2 = br.readLine();
			Replacer re = new Replacer();
			re.replaceEverythingHere(path, s1, s2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
//lol