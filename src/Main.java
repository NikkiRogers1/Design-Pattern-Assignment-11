public class Main {
    public static void main(String[] args) {
     RealMedia real =new RealMedia("Sample Media", 120); 
     MediaItem media = new RemoteMediaProxy(real);


     System.out.println("\nUser 1 is accessing the media:");
     System.out.println("Title: " + media.getTitle());
        System.out.println("Duration: " + media.getDuration() + " seconds");
        media.play();
    System.out.println("Title: " + media.getTitle());
    System.out.println("Duration: " + media.getDuration() + " seconds");
    media.play();
    

    System.out.println("\nUser 2 is accessing the media:");
    MediaItem virtualMedia = new VirtualMediaProxy("Virtual Media", 90);
        System.out.println("Title: " + virtualMedia.getTitle());
        System.out.println("Duration: " + virtualMedia.getDuration() + " seconds");
        virtualMedia.play();

        System.out.println("Title: " + virtualMedia.getTitle());
        System.out.println("Duration: " + virtualMedia.getDuration() + " seconds"); 
        virtualMedia.play();
        
    
    }
}
