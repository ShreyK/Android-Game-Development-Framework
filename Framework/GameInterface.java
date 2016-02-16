package shreyk.o.Framework;

/**
 * Created by Shrey on 12/16/2015.
 */
public interface GameInterface {

    public Audio getAudio();

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getInitScreen();
}
