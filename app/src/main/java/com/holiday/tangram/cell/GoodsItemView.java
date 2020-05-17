package com.holiday.tangram.cell;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.holiday.tangram.R;
import com.holiday.tangram.view.NetImageView;
import com.tmall.wireless.tangram.structure.BaseCell;
import com.tmall.wireless.tangram.structure.view.ITangramViewLifeCycle;

/**
 * 自定义cell：商品样式
 */
public class GoodsItemView extends LinearLayout implements ITangramViewLifeCycle {
    private NetImageView mImgIcon;
    private TextView mTvTitle;

    public GoodsItemView(Context context) {
        this(context, null);
    }

    public GoodsItemView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GoodsItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(VERTICAL);
        setGravity(Gravity.CENTER);
        inflate(getContext(), R.layout.cell_goods_item, this);
        mImgIcon = findViewById(R.id.img_icon);
        mTvTitle = findViewById(R.id.tv_title);
    }

    @Override
    public void cellInited(BaseCell cell) {
        setOnClickListener(cell);
    }

    @Override
    public void postBindView(BaseCell cell) {
        mImgIcon.load(cell.optStringParam("imgUrl"));
        mTvTitle.setText(cell.optStringParam("title"));

        String itemBgColor = cell.parent.optStringParam("itemBgColor");
        setBackgroundColor(Color.parseColor(TextUtils.isEmpty(itemBgColor) ? "#333333" : itemBgColor));

        String textColor = cell.parent.optStringParam("textColor");
        mTvTitle.setTextColor(Color.parseColor(TextUtils.isEmpty(textColor) ? "#333333" : textColor));
    }

    @Override
    public void postUnBindView(BaseCell cell) {
    }
}
