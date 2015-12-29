package shreyk.god.Framework;

import android.graphics.Bitmap;

/**
 * Created by Shrey on 12/16/2015.
 */
public class Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;

    public Image(Bitmap bitmap, Graphics.ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    public int getWidth() {
        return bitmap.getWidth();
    }

    public int getHeight() {
        return bitmap.getHeight();
    }

    public Graphics.ImageFormat getFormat() {
        return format;
    }

    public void dispose() {
        bitmap.recycle();
    }
}
