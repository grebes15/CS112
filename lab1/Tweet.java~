/*
Andreas Landgrebe
cs112 Spring Semester 2013
this is the tweet class for the twitter cilent
*/

import java.util.Date;
//this sets up the class Tweet where there are two instance variables are message and current date in the constructor.
public class Tweet{
    
    private String message;
    private Date currentDate;

    public Tweet(){
	currentDate = new Date();
}

    public static boolean isValidMessage(String message){
	//this method sets up an if statement that returns false is the message is larger than 140 or equal to 0. If the message is in between 1 to 139, the Message will be true.
	if(message.length() > 140 || message.length() == 0 )
	    return false;
	else
	    return true;
    }
    public void setMessage(String message){
	//this method sets up the setter for the message
	this.message = message;

    }
    //this is the toString that returns the current date and the message
    public String toString(){
	return "Date" + currentDate + "Message" + message;
    }
}
