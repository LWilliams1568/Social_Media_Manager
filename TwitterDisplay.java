package termproject;

public class TwitterDisplay extends SocialNetwork{
    private Subject twitterData;

    public TwitterDisplay(Subject twitterData){
        this.twitterData = twitterData;
	twitterData.registerObserver(this);
        twitterBehavior= new PostTweet();    
    }
}
