/*
  Andreas Landgrebe
  cs112 Spring Semester 2013
  this is the twitter class for the twitter client
*/

import twitter4j.*;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class TwitterClient{


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
	/*	LJV.Context showAllCtx = LJV.newContext();
	showAllCtx.outputFormat = "pdf";
	showAllCtx.ignorePrivateFields = false;
	LJV.setDefaultContext(showAllCtx);
	//this sets up the picture as a pdf. 
	LJV.drawGraphToFile(valid, "valid.pdf");
	LJV.drawGraphToFile(invalid, "invalid.pdf");
	System.out.println("This is an valid message: " + valid);
	System.out.println("This is an invalid message: " + invalid);
	*/
	try {
	    
	    // gets Twitter instance with default credentials
	    Twitter twitter = new TwitterFactory().getInstance();
	    Twitter twitterMessage = TwitterFactory.getSingleton();
	    User user = twitter.verifyCredentials();
	    List<Status> statuses = twitter.getHomeTimeline();
	    //this will get the status of my timeline
	    if(args[0].equals("both") || args[0].equals("timeline")){
		//this will show my timeline from my twitter account by implementing an if statement whether I write both or timeline when I am running the program
		System.out.println("Showing @" + user.getScreenName() + "'s home timeline.");
	    }
	    for (Status status : statuses) {
		System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
		if(args[0].equals("both") || args[0].equals ("message")){
		    //this will show my message form my twitter account by implementing an if statement whether I write both of message when I am running the program
	
		    for(int i = 0; i < valid.size(); i++){
			Status x = twitterMessage.updateStatus(valid.get(i).getMessage());
		    }
		}
	    }
	    if(args[0].equals("directMessage")){
		    Scanner scan = new Scanner(System.in);
		    System.out.println("enter the direct message:");
		    String directMessage = scan.nextLine();
		    System.out.println("What is the recipientID? ");
		    String recipientID = scan.nextLine();
		    DirectMessage message = twitterMessage.sendDirectMessage(recipientID , directMessage);
		    System.out.println("Sent: " + message.getText() + " to @" + message.getRecipientScreenName());
	    }
	}
		
	catch (TwitterException te) {
	    
	    te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            
	}
    }
}
