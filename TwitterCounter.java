package termproject;

public class TwitterCounter extends SocialDecorator { 
    TotalSocial totalsocial;
    twitterData twitterdata;
       
    public TwitterCounter( TotalSocial totalsocial, twitterData twitterdata) {
        this.totalsocial = totalsocial;
        this.twitterdata= twitterdata;
    }

    public String getDescription() {
        return totalsocial.getDescription() + "Twitter Totals";
    }

    public int messages() {
	return twitterdata.getTWMessages() + totalsocial.messages();
    }
    
    public int likes() {
	return twitterdata.getTWLikes() + totalsocial.likes();
    }
    
    public int followers() {
	return twitterdata.getTWfollowers() + totalsocial.followers();
    }
}   
