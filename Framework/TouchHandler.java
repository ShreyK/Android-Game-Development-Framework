package shreyk.god.Framework;

import android.view.View;

import java.util.List;

/**
 * Created by Shrey on 12/16/2015.
 */

public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}