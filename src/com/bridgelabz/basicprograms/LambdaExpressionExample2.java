package com.bridgelabz.basicprograms;
//@FunctionalInterface
/*interface Drawable{  
    public String say(String name);  
}  
  
public class LambdaExpressionExample2{  
    public static void main(String[] args) {  
    	
    	Drawable d = (name)->{
    		return name +" hello!";
    	};
        System.out.println(d.say("kishore"));
    }  
}  */


/*
 * interface MethodExpression{ public void say(); } public class
 * LambdaExpressionExample2{
 * 
 * public static void saySomrthing() { System.out.println("hai hello world1"); }
 * public static void main(String[] args) {
 * 
 * MethodExpression me = LambdaExpressionExample2::saySomrthing; me.say();
 * 
 * }
 * 
 * }
 */
/*
 * interface reference{ public void say() ; } public class
 * LambdaExpressionExample2{
 * 
 * public void saySomrthing() { System.out.println("hai how are you"); } public
 * static void main(String[] args) { LambdaExpressionExample2 le = new
 * LambdaExpressionExample2(); reference r = le::saySomrthing; r.say(); } }
 */

interface MessageDisplay{
	Message getMessage(String msg);
}

class Message{
	public Message(String msg) {
		System.out.println(msg);
	}
}
public class LambdaExpressionExample2{
	public static void main(String[] args) { 
	MessageDisplay md = Message::new;
	md.getMessage("hello");
}
}

