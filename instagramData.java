package termproject;
import java.util.*;

public class instagramData implements Subject{
    private ArrayList observers;
    private int instaFollowers;
    private int instaMessages;
    private int instaLikes;
 
	
    public instagramData() {
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
            observer.updateIS(instaLikes,instaMessages,instaFollowers);
                
        }
    }
	
    public void instaFollowersChanged() {
        notifyObservers();
    }
    
    public void instaMessagesChanges(){
        notifyObservers();
    }
    
    public void instaLikesChanges(){
        notifyObservers();
    }
    
    public void setInstaMessages(int instaMessages){
        this.instaMessages = instaMessages;
        notifyObservers();
    }
    
    public void setInstaLikes(int instaLikes){
        this.instaLikes = instaLikes;
        notifyObservers();
    }
    
    public void setInstaFollowers(int instaFollowers){
        this.instaFollowers = instaFollowers;
        notifyObservers();
    }
	
    public int getINSTAfollowers() {
        return instaFollowers;
    }
    
    public int getINSTAmessages() {
        return instaMessages;
    }
    
    public int getINSTAlikes() {
        return instaLikes;
    }	
}

