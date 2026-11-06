public class VirtualMediaProxy implements MediaItem {
    
    private RealMedia realMedia = null;
    private String title;
    private int duration;

    public VirtualMediaProxy(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    private void loadIfNeeded() {
        if (realMedia == null) {
            System.out.println("Loading heavy assets into memory...");
            realMedia = new RealMedia(title, duration);
        }
    }

    @Override
    public String getTitle() {
        loadIfNeeded();
        return realMedia.getTitle();
    }
    
    @Override
    public int getDuration() {
        loadIfNeeded();
        return realMedia.getDuration();
    }   

    @Override
    public void play() {
        loadIfNeeded();
        realMedia.play();
    }
    
}
