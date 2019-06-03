package com.refresh.library.constant;

/**
 * 顶部和底部的组件在拖动时候的变换方式
 * Created by SCWANG on 2017/5/26.
 */

public class SpinnerStyle {

    public static final SpinnerStyle Translate = new SpinnerStyle(0);
    public static final SpinnerStyle Scale = new SpinnerStyle(1);
    public static final SpinnerStyle FixedBehind = new SpinnerStyle(2);
    public static final SpinnerStyle FixedFront = new SpinnerStyle(3);
    public static final SpinnerStyle MatchLayout = new SpinnerStyle(4);

    public static final SpinnerStyle[] values = new SpinnerStyle[]{
            Translate,
            Scale,
            FixedBehind,
            FixedFront,
            MatchLayout
    };

    public final int ordinal;

    private SpinnerStyle(int ordinal) {
        this.ordinal = ordinal;
    }
}
