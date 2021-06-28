package termproject;

public abstract class TotalSocial {
    String description = "unknown";
    

    public String getDescription() {
        return description;
    }
    
    public abstract int likes();
    public abstract int messages();
    public abstract int followers();
}
  
