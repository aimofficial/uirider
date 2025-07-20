package com.newtaxiprime.user.taxiapp.sidebar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00101\u001a\u000202J\b\u00103\u001a\u000202H\u0016J\u0012\u00104\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000106H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u00067"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/FareBreakdown;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "()V", "amount1", "Landroid/widget/TextView;", "getAmount1", "()Landroid/widget/TextView;", "setAmount1", "(Landroid/widget/TextView;)V", "amount2", "getAmount2", "setAmount2", "amount3", "getAmount3", "setAmount3", "amount4", "getAmount4", "setAmount4", "binding", "Lcom/newtaxiprime/user/databinding/AppActivityFareBreakdownBinding;", "getBinding", "()Lcom/newtaxiprime/user/databinding/AppActivityFareBreakdownBinding;", "setBinding", "(Lcom/newtaxiprime/user/databinding/AppActivityFareBreakdownBinding;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "searchlist", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearestCar;", "getSearchlist", "()Ljava/util/ArrayList;", "setSearchlist", "(Ljava/util/ArrayList;)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "back", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class FareBreakdown extends com.newtaxiprime.user.appcommon.views.CommonActivity {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    public android.widget.TextView amount1;
    public android.widget.TextView amount2;
    public android.widget.TextView amount3;
    public android.widget.TextView amount4;
    public java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> searchlist;
    private int position = 0;
    public com.newtaxiprime.user.databinding.AppActivityFareBreakdownBinding binding;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    
    public FareBreakdown() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAmount1() {
        return null;
    }
    
    public final void setAmount1(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAmount2() {
        return null;
    }
    
    public final void setAmount2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAmount3() {
        return null;
    }
    
    public final void setAmount3(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAmount4() {
        return null;
    }
    
    public final void setAmount4(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> getSearchlist() {
        return null;
    }
    
    public final void setSearchlist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.databinding.AppActivityFareBreakdownBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.databinding.AppActivityFareBreakdownBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    public final void back() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Back button to close
     */
    @java.lang.Override()
    public void onBackPressed() {
    }
}