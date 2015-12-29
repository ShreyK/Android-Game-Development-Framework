package shreyk.o.Framework;

/**
 * Created by Shrey on 10/24/2015.
 */

import android.view.View.OnTouchListener;

import java.util.List;

import shreyk.o.Framework.Input;


public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
