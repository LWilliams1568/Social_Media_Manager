package termproject;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream o = new PrintStream(new File("output_Williams.txt")); 
        PrintStream console = System.out; 
        System.setOut(o); 
        
        facebookData Facebookdata = new facebookData();
        instagramData instagramdata= new instagramData();
        twitterData twitterdata= new twitterData();
        System.out.println("");
        
        System.out.println("Instagram Display:");
        SocialNetwork instagram1= new InstagramDisplay(instagramdata);
        SocialNetwork twitter1= new TwitterDisplay(twitterdata);
        SocialNetwork facebook1= new FacebookDisplay(Facebookdata);
        SocialNetwork myDisplay= new CombinedDisplay();
        
        instagramdata.setInstaFollowers(500);
        instagramdata.setInstaLikes(200);
        instagramdata.setInstaMessages(50);
        instagram1.displayIS();
        instagram1.goInstagramBehavior();
        System.out.println("");
        
        System.out.println("Twitter Display:");
        twitterdata.setTWLikes(777);
        twitterdata.setTWMessages(888);
        twitterdata.setTWFollowers(555);
        twitter1.displayTW();
        twitter1.goTwitterBehavior();
        System.out.println("");
        
        System.out.println("Facebook Display:");
        Facebookdata.setFBLikes(2000);    
        Facebookdata.setFBmessages(44);
        Facebookdata.setFBFollowers(1000);
        facebook1.displayFB();
        facebook1.goFacebookBehavior();
        System.out.println("");
        
        TotalSocial tsocial = new BasicSocial();
        tsocial = new FacebookCounter(tsocial, Facebookdata);
        tsocial = new InstagramCounter(tsocial, instagramdata);
        tsocial = new TwitterCounter(tsocial, twitterdata);
        System.out.println("Total Display:");
        myDisplay.grandTotal(tsocial);
        
        System.setOut(console); 
    }
}
