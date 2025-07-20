package com.newtaxiprime.user.taxiapp.views.customize;

/**
 * ***************************************************************
 * Custom dialog box fragment
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011B\'\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0013B7\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0014B?\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0017B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog;", "Lcom/newtaxiprime/user/taxiapp/views/customize/BaseDialogFragment;", "message", "", "confirmTxt", "okClickListener", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;", "(Ljava/lang/String;Ljava/lang/String;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;)V", "isProgressDialog", "", "(Z)V", "(ZLjava/lang/String;)V", "positiveBtnTxt", "negativeBtnTxt", "allowClickListener", "denyClickListener", "Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnDenyClick;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnDenyClick;)V", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnDenyClick;)V", "index", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnDenyClick;)V", "()V", "tvAllow", "Landroid/widget/TextView;", "tvDeny", "initEvent", "", "initViews", "v", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "BtnAllowClick", "BtnDenyClick", "app_debug"})
@android.annotation.SuppressLint(value = {"ValidFragment"})
public final class CustomDialog extends com.newtaxiprime.user.taxiapp.views.customize.BaseDialogFragment {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String positiveBtnTxt = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String negativeBtnTxt = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String confirmTxt = "";
    private int index = -1;
    private android.widget.TextView tvAllow;
    private android.widget.TextView tvDeny;
    private com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnAllowClick allowClickListener;
    private com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnDenyClick denyClickListener;
    private boolean isProgressDialog = false;
    
    public CustomDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmTxt, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnAllowClick okClickListener) {
        super();
    }
    
    public CustomDialog(boolean isProgressDialog) {
        super();
    }
    
    public CustomDialog(boolean isProgressDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super();
    }
    
    public CustomDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveBtnTxt, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeBtnTxt, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnAllowClick allowClickListener, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnDenyClick denyClickListener) {
        super();
    }
    
    public CustomDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmTxt, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnAllowClick okClickListener) {
        super();
    }
    
    public CustomDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveBtnTxt, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeBtnTxt, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnAllowClick allowClickListener, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnDenyClick denyClickListener) {
        super();
    }
    
    public CustomDialog(int index, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveBtnTxt, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeBtnTxt, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnAllowClick allowClickListener, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.customize.CustomDialog.BtnDenyClick denyClickListener) {
        super();
    }
    
    public CustomDialog() {
        super();
    }
    
    @java.lang.Override()
    public void initViews(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initEvent() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnAllowClick;", "", "clicked", "", "app_debug"})
    public static abstract interface BtnAllowClick {
        
        public abstract void clicked();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/customize/CustomDialog$BtnDenyClick;", "", "clicked", "", "app_debug"})
    public static abstract interface BtnDenyClick {
        
        public abstract void clicked();
    }
}