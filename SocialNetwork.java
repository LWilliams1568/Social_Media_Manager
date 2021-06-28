package termproject;

public class SocialNetwork implements Observer, DisplayElement {
    FacebookBehavior facebookBehavior;
    TwitterBehavior twitterBehavior;
    InstagramBehavior instagramBehavior;
    TotalSocial totalsocial;
    int FBfollowers;
    int FBmessages;
    int FBlikes;
    int TWfollowers;
    int TWmessages;
    int TWlikes;
    int ISfollowers;
    int ISmessages;
    int ISlikes;
    

    public void goInstagramBehavior() {
        instagramBehavior.instagramType();
    }
 
    public void goFacebookBehavior() {
        facebookBehavior.faceType();
    } 
    
    public void goTwitterBehavior() {
        twitterBehavior.twitterType();
    } 
    
    public void setTwitterBehavior(TwitterBehavior tb) {
        twitterBehavior = tb;
    }

    public void setInstagramBehavior(InstagramBehavior ib) {
        instagramBehavior = ib;
    }
    
    public void setFacebookBehavior(FacebookBehavior fb) {
        facebookBehavior = fb;
    }
    
     
    public void updateFB(int FBlikes, int FBmessages, int FBfollowers){
        this.FBlikes= FBlikes;
        this.FBmessages= FBmessages;
        this.FBfollowers= FBfollowers;
        displayFB();
    } 
  
    
    public void updateTW(int TWlikes, int TWmessages, int TWfollowers){
        this.TWlikes= TWlikes;
        this.TWmessages= TWmessages;
        this.TWfollowers= TWfollowers;
        displayTW();
    } 
  
    
    public void updateIS(int ISlikes, int ISmessages, int ISfollowers){
        this.ISlikes= ISlikes;
        this.ISmessages= ISmessages;
        this.ISfollowers= ISfollowers;
        displayIS();
    } 
   
      
     public void grandTotal(TotalSocial totalsocial){
        int totalLikes= totalsocial.likes();
        int totalMessages= totalsocial.messages();
        int totalFollowers= totalsocial.followers();
        
       System.out.println("Total Likes " + totalLikes);
       System.out.println("Total Messages " + totalMessages); 
       System.out.println("Total Followers " + totalFollowers); 
       
   }
     
    public void displayFB() {
	System.out.println("Current Facebook likes " + FBlikes);
        System.out.println("Current Facebook messages " + FBmessages);
        System.out.println("Current Facebook followers " + FBfollowers);
    }
    
    public void displayTW() {
        System.out.println("Current Twitter likes " + TWlikes);
        System.out.println("Current Twitter messages " + TWmessages);
        System.out.println("Current Twitter followers " + TWfollowers);
    }
    
    public void displayIS() {
        System.out.println("Current Instagram likes " + ISlikes);
        System.out.println("Current Instagram messages " + ISmessages);
        System.out.println("Current Instagram followers " + ISfollowers);
    }     
}
