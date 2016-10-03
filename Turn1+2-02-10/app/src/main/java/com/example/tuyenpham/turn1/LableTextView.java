package com.example.tuyenpham.turn1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Tuyen Pham on 03/10/2016.
 */

public class LableTextView extends TextView {
    public LableTextView(Context context) {
        super(context);
        initUI(context, null);
    }

    public LableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUI(context, attrs);
    }

    public LableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initUI(context, attrs);
    }
    private void initUI(Context  context, AttributeSet attrs) {
    }
}
