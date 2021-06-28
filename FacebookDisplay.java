package termproject;

public class FacebookDisplay extends SocialNetwork {
    private Subject facebookData;
    

    public FacebookDisplay(Subject facebookData){
        this.facebookData = facebookData;
	facebookData.registerObserver(this);
        facebookBehavior= new PostStatus();
    }

}

