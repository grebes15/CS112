/*
Andreas Landgrebe
cs112 Spring Semester 2013
this is the twitter class for the twitter client
*/


import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Twitter{


    public static void main(String[] args){
	//this setsup the array lists. If the message is valid, then the arraylist will be a tweet and if the message is invalid, then the message will be a string.
	ArrayList<Tweet> valid = new ArrayList<Tweet>();
	ArrayList<String> invalid = new ArrayList<String>();
	Tweet t = new Tweet();
	Scanner file = null;
	Scanner sc = null;
	try {
	//this sets up the scanner in order to scan on the text to test if the message is valid or invalid.
	    sc = new Scanner(new File("Tweets.txt"));
	}
  
	catch(FileNotFoundException e) {
	    e.printStackTrace();
	//the try method will read in a message and if there is an error in the message, the catch method will catch the error.
	}
	while(sc.hasNextLine()) {
	    String line = sc.nextLine();
	    if(t.isValidMessage(line)){
	//this if statement will set up if a message is valid or invalid.
	       Tweet w = new Tweet();
	       w.setMessage(line);
	       valid.add(w);
		}
	       else
		   invalid.add(line);
	       }
	    for(int i = 0; i<valid.size(); i++){
	//this for loop wil read in all of the valid messages.
		valid.get(i);
	    }
	    for(int i = 0; i<invalid.size(); i++){
	//this for loop will read in all of the invalid messages.
		invalid.get(i);
	    }
	    LJV.Context showAllCtx = LJV.newContext();
	    showAllCtx.outputFormat = "pdf";
	    showAllCtx.ignorePrivateFields = false;
	    LJV.setDefaultContext(showAllCtx);
	//this sets up the picture as a pdf. 
	    LJV.drawGraphToFile(valid, "valid.pdf");
	    LJV.drawGraphToFile(invalid, "invalid.pdf");
	    System.out.println("This is an valid message: " + valid);
	    System.out.println("This is an invalid message: " + invalid);
	    
    }
}
