package com.newtaxiprime.user.taxiapp.sidebar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\b\u0010,\u001a\u00020*H\u0016J\u0012\u0010-\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00061"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/DriverContactActivity;", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "()V", "binding", "Lcom/newtaxiprime/user/databinding/AppActivityDriverContactBinding;", "callbutton", "Landroid/widget/LinearLayout;", "getCallbutton", "()Landroid/widget/LinearLayout;", "setCallbutton", "(Landroid/widget/LinearLayout;)V", "callerId", "", "getCallerId", "()Ljava/lang/String;", "setCallerId", "(Ljava/lang/String;)V", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "driver_name_contact", "Landroid/widget/TextView;", "getDriver_name_contact", "()Landroid/widget/TextView;", "setDriver_name_contact", "(Landroid/widget/TextView;)V", "driver_phone_contact", "getDriver_phone_contact", "setDriver_phone_contact", "messageButton", "getMessageButton", "setMessageButton", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "messageDriver", "", "onBack", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class DriverContactActivity extends com.newtaxiprime.user.appcommon.views.CommonActivity {
    public android.widget.TextView driver_name_contact;
    public android.widget.TextView driver_phone_contact;
    public android.widget.LinearLayout callbutton;
    public android.widget.LinearLayout messageButton;
    private com.newtaxiprime.user.databinding.AppActivityDriverContactBinding binding;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String callerId = "";
    private static final int CALL = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.taxiapp.sidebar.DriverContactActivity.Companion Companion = null;
    
    public DriverContactActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDriver_name_contact() {
        return null;
    }
    
    public final void setDriver_name_contact(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDriver_phone_contact() {
        return null;
    }
    
    public final void setDriver_phone_contact(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getCallbutton() {
        return null;
    }
    
    public final void setCallbutton(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getMessageButton() {
        return null;
    }
    
    public final void setMessageButton(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCallerId() {
        return null;
    }
    
    public final void setCallerId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void onBack() {
    }
    
    public final void messageDriver() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/sidebar/DriverContactActivity$Companion;", "", "()V", "CALL", "", "getCALL", "()I", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getCALL() {
            return 0;
        }
    }
}