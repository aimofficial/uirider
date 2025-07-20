package com.newtaxiprime.user.taxiapp.sidebar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/WrapContentViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mCurrentPagePosition", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpecs", "reMeasureCurrentPage", "position", "app_debug"})
public final class WrapContentViewPager extends androidx.viewpager.widget.ViewPager {
    private int mCurrentPagePosition = 0;
    
    public WrapContentViewPager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public WrapContentViewPager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * Wrap content size measure
     */
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpecs) {
    }
    
    public final void reMeasureCurrentPage(int position) {
    }
}