package termproject;
import java.util.*;

public class twitterData implements Subject  {
    private ArrayList observers;
    private int twFollowers;
    private int twMessages;
    private int twLikes;
 
	
    public twitterData() {
        observers = new ArrayList();
    }
	
    public void registerObserver(Observer o) {
        observers.add(o);
    }
	
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
	
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.updateTW( twLikes, twMessages,twFollowers);
        }
    }
	
    public void twFollowersChanged() {
        notifyObservers();
    }
    
    public void twMessagesChanges(){
        notifyObservers();
    }
    
    public void twLikesChanges(){
        notifyObservers();
    }
    
    public void setTWMessages(int twMessages){
        this.twMessages = twMessages;
        notifyObservers();
    }
    
    public void setTWLikes(int twLikes){
        this.twLikes = twLikes;
        notifyObservers();
    }
    
    public void setTWFollowers(int twFollowers){
        this.twFollowers = twFollowers;
        notifyObservers();
    }
	
    public int getTWfollowers() {
        return twFollowers;
    }
    
    public int getTWMessages() {
        return twMessages;
    }
    
    public int getTWLikes() {
        return twLikes;
    }	
}
