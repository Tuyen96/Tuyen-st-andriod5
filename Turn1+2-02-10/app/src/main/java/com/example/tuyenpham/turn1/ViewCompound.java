package com.example.tuyenpham.turn1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created by Tuyen Pham on 02/10/2016.
 */
public class ViewCompound extends RelativeLayout{
    private int tvProgess;
    private String label;



    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        updateUI();
    }

    @BindView(R.id.iv_add)
    public ImageView imAdd;

    @BindView(R.id.iv_remove)
    public ImageView imRemove;

    @BindView(R.id.tv_value)
    public EditText tvValue;

    @BindView(R.id.tv_lable)
    public TextView tvLable;

    public ViewCompound(Context context) {
        super(context);
        initFromContext(context, null);
    }

    public ViewCompound(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFromContext(context, attrs);
    }

    public ViewCompound(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFromContext(context, attrs);
    }

    private void addListeners(){
        imAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvProgess++;
                updateUI();
            }
        });
        imRemove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvProgess--;
                updateUI();
            }
        });
    }
    private void initFromContext(Context context, AttributeSet attrs){
        View rootView = inflate(context, R.layout.view_compound, this);
        ButterKnife.bind(this, rootView);
        if(attrs != null){
            //1
            TypedArray labelArray = context.obtainStyledAttributes(attrs, R.styleable.LableTextView);
            //2
            this.label = labelArray.getString(R.styleable.LableTextView_lable);
            //3
            labelArray.recycle();
            //4
//            this.setLabelTextView(String.format("%s", attrs));

            //1
            TypedArray valueArray = context.obtainStyledAttributes(attrs, R.styleable.ValueTextView);
            //2
            this.tvProgess = valueArray.getInt(R.styleable.ValueTextView_value, -1);
            //3
            valueArray.recycle();
            //4
            Log.d("ad", tvProgess+"" + label);
        }
        updateUI();
        addListeners();
    }
    public int getTvProgess() {
        return tvProgess;
    }
    public void setTvProgess(int tvProgess) {
        this.tvProgess = tvProgess;
        updateUI();
    }
    private void updateUI() {
        Log.d("VIEWCOMPOUNBD", tvProgess+"\t"+label);
        tvValue.setText(String.format("%s", tvProgess));
        tvLable.setText(label);
    }

}
