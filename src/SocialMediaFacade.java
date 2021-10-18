public class SocialMediaFacade {
    private Facebook facebook;
    private LinkedIn linkedIn;
    private  Twitter twitter;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn){
        this.facebook = facebook;
        this.linkedIn = linkedIn;
        this.twitter = twitter;
    }
    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.linkedIn.share();
        this.facebook.share();
    }
}
