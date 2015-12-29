package shreyk.o.Framework.Implementation;

/**
 * Created by Shrey on 10/24/2015.
 */

import android.graphics.Bitmap;

import shreyk.o.Framework.Graphics;
import shreyk.o.Framework.Image;


public class AndroidImage implements Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;

    public AndroidImage(Bitmap bitmap, Graphics.ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}

