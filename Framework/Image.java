package shreyk.o.Framework;

/**
 * Created by Shrey on 10/24/2015.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();
}
