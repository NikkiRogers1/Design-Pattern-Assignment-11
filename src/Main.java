public class Main {
    public static void main(String[] args) {
     RealMedia real =new RealMedia("Sample Media", 120); 
     MediaItem media = new RemoteMediaProxy(real);

     System.out.println("Title: " + media.getTitle());
        System.out.println("Duration: " + media.getDuration() + " seconds");
        media.play();
    }
}
