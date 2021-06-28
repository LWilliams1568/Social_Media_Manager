package termproject;

public class InstagramDisplay extends SocialNetwork {
    private Subject instagramData;

    public InstagramDisplay(Subject instagramData){
        this.instagramData = instagramData;
	instagramData.registerObserver(this);
        instagramBehavior= new PostPicture();    
    }
}

