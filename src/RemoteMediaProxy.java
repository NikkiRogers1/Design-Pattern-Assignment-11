public class RemoteMediaProxy  implements MediaItem {
    
    private RealMedia realMedia;
    private boolean isConnected = false;

    public RemoteMediaProxy(RealMedia realMedia) {
        this.realMedia = realMedia;
    }
   
    private void connectToServer() {
        if (!isConnected) {
            System.out.println("connecting to remote server...");
            isConnected = true;
        }
    }


    @Override
    public String getTitle() {
        connectToServer();
        return realMedia.getTitle();
    }
    
    @Override
    public int getDuration() {  
        connectToServer();
        return realMedia.getDuration();
    }

    @Override
    public void play() {
        connectToServer();
        realMedia.play();
    }


    
}
