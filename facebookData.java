package termproject;
import java.util.*;

public class facebookData implements Subject{
    private ArrayList observers;
    private int fbFollowers;
    private int fbMessages;
    private int fbLikes;
 
	
    public facebookData() {
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
            observer.updateFB(fbLikes,fbMessages,fbFollowers);
        }    
    }
	
    public void fbFollowersChanged() {
        notifyObservers();
    }
    
    public void fbMessagesChanges(){
        notifyObservers();
    }
    
    public void fbLikesChanges(){
        notifyObservers();
    }
    
    public void setFBmessages(int fbMessages) {
        this.fbMessages = fbMessages;
        fbMessagesChanges();
    }
    
        
    public void setFBLikes(int fbLikes) {
        this.fbLikes = fbLikes;
        fbLikesChanges();
    }
    
    public void setFBFollowers(int fbFollowers) {
        this.fbFollowers = fbFollowers;
        fbFollowersChanged();
    }
	
    public int getFBfollowers() {
        return fbFollowers;
    }
    
    public int getFBmessages() {
        return fbMessages;
    }
    
    public int getFBlikes() {
        return fbLikes;
    }	
}


