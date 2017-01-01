package org.fawzone.emptykeybord;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.KeyboardView;

/**
 * Created by mmedjahed on 01/01/17.
 */

public class NOPInputMethodService extends InputMethodService implements KeyboardView.OnKeyboardActionListener {
    @Override
    public void onPress(int i) {
    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int i, int[] ints) {

    }

    @Override
    public void onText(CharSequence charSequence) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
