package termproject;

public class InstagramCounter extends SocialDecorator { 
    TotalSocial totalsocial;
    instagramData instagramdata;
       
    public InstagramCounter( TotalSocial totalsocial, instagramData instagramdata) {
        this.totalsocial = totalsocial;
        this.instagramdata= instagramdata;
    }

    public String getDescription() {
        return totalsocial.getDescription() + "Instagram";
    }

    public int messages() {
	return instagramdata.getINSTAmessages() + totalsocial.messages();
    }
    
    public int likes() {
	return instagramdata.getINSTAlikes() + totalsocial.likes();
    }
    
    public int followers() {
	return instagramdata.getINSTAfollowers() + totalsocial.followers();
    }
}   
