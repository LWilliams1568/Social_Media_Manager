package termproject;

public class CombinedDisplay extends SocialNetwork {
      public void display() {
	System.out.println("Current Facebook likes " + FBlikes);
        System.out.println("Current Facebook messages " + FBmessages);
        System.out.println("Current Facebook followers " + FBfollowers);
        System.out.println("Current Twitter likes " + TWlikes);
        System.out.println("Current Twitter messages " + TWmessages);
        System.out.println("Current Twitter followers " + TWfollowers);
        System.out.println("Current Instagram likes " + ISlikes);
        System.out.println("Current Instagram messages " + ISmessages);
        System.out.println("Current Instagram followers " + ISfollowers);
    } 
}

