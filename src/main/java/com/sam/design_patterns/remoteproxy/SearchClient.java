package com.sam.design_patterns.remoteproxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class SearchClient {
	
	public static void main(String args[]) {
		try {
			Search search = (Search) Naming.lookup("rmi://localhost:1900/searchTopic");
			System.out.println("class name=== >"+search.getClass().getName());
			int integerToExitOrContinue=1;
			while(integerToExitOrContinue!=0){
				System.out.println("Enter the Query..");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String query = input.readLine();
				String yesOrNo = search.query(query);
				System.out.println(yesOrNo);
				System.out.println("If you want to exit press 0..");
				BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
				integerToExitOrContinue= Integer.parseInt(input2.readLine());
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
