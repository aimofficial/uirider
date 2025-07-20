package com.newtaxiprime.user.taxiapp.views.peakPricing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0019H\u0007J\b\u0010\u001b\u001a\u00020\u0019H\u0007J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/peakPricing/PeakPricing;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "()V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "tvMinimumFare", "Landroid/widget/TextView;", "getTvMinimumFare", "()Landroid/widget/TextView;", "setTvMinimumFare", "(Landroid/widget/TextView;)V", "tvPeakPricePercentage", "getTvPeakPricePercentage", "setTvPeakPricePercentage", "tvPerDistance", "getTvPerDistance", "setTvPerDistance", "tvPerMinutes", "getTvPerMinutes", "setTvPerMinutes", "acceptHigherPriceButtonClick", "", "closeActivity", "declinedPeakPriceButtonClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class PeakPricing extends com.newtaxiprime.user.appcommon.views.CommonActivity {
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_peak_price_percentage)
    public android.widget.TextView tvPeakPricePercentage;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_minimum_fare)
    public android.widget.TextView tvMinimumFare;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_per_minutes)
    public android.widget.TextView tvPerMinutes;
    @butterknife.BindView(value = com.newtaxiprime.user.R.id.tv_per_distance)
    public android.widget.TextView tvPerDistance;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    
    public PeakPricing() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvPeakPricePercentage() {
        return null;
    }
    
    public final void setTvPeakPricePercentage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvMinimumFare() {
        return null;
    }
    
    public final void setTvMinimumFare(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvPerMinutes() {
        return null;
    }
    
    public final void setTvPerMinutes(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvPerDistance() {
        return null;
    }
    
    public final void setTvPerDistance(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.tv_accept_higherPrice})
    public final void acceptHigherPriceButtonClick() {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.tv_tryLater_higherPrice})
    public final void declinedPeakPriceButtonClick() {
    }
    
    @butterknife.OnClick(value = {com.newtaxiprime.user.R.id.imgvu_close_icon})
    public final void closeActivity() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}