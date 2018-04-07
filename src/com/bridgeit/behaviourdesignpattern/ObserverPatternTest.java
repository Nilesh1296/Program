
/******************************************************************************
  
 *  Purpose: Observer design pattern is useful when you are interested in the 
 *  state of an object and want to get notified whenever there is any change. 
 *  In observer pattern, the object that watch on the state of another object
 *  are called Observer and the object that is being watched is called Subject.  
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/





package com.bridgeit.behaviourdesignpattern;

import com.bridgeit.utilitydesignpattern.MyTopic;
import com.bridgeit.utilitydesignpattern.MyTopicSubscriber;
import com.bridgeit.utilitydesignpattern.Observer;

public class ObserverPatternTest
{
	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer obj1 = new MyTopicSubscriber("Obj1");
		Observer obj2 = new MyTopicSubscriber("Obj2");
		Observer obj3 = new MyTopicSubscriber("Obj3");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
	}
}
