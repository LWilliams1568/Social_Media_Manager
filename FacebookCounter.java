package termproject;

public class FacebookCounter extends SocialDecorator { 
    TotalSocial totalsocial;
    facebookData  facebookdata;
       
    public FacebookCounter( TotalSocial totalsocial, facebookData facebookdata){
        this.totalsocial = totalsocial;
        this.facebookdata= facebookdata;
    }

    public String getDescription() {
        return totalsocial.getDescription() + "Facebook";
    }

    public int messages() {
	return facebookdata.getFBmessages() + totalsocial.messages();
    }
    
    public int likes() {
	return facebookdata.getFBlikes() + totalsocial.likes();
    }
    
    public int followers() {
	return facebookdata.getFBfollowers() + totalsocial.followers();
    }
}   

