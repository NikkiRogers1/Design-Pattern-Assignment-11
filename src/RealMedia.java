public class RealMedia implements MediaItem {

    private String title;
    private int duration;

    public RealMedia(String title, int duration) {
        this.title = title;
        this.duration = duration;
        System.out.println("Establishing connection to remote server... [Success]");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing media: " + title);
    }
}