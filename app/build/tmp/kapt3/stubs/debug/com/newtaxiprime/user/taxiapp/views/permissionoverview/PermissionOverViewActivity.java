package com.newtaxiprime.user.taxiapp.views.permissionoverview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/permissionoverview/PermissionOverViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appName", "", "mAdapter", "Lcom/newtaxiprime/user/taxiapp/views/permissionoverview/PermissionOverViewAdapter;", "mBinding", "Lcom/newtaxiprime/user/databinding/ActivityPermissionOverViewBinding;", "customTextView", "", "view", "Landroid/widget/TextView;", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "preparePermissionList", "", "Lcom/newtaxiprime/user/appcommon/data/local/ApplicationPermissionModel;", "app_debug"})
public final class PermissionOverViewActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.newtaxiprime.user.databinding.ActivityPermissionOverViewBinding mBinding;
    private com.newtaxiprime.user.taxiapp.views.permissionoverview.PermissionOverViewAdapter mAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appName = "NewTaxi";
    
    public PermissionOverViewActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final java.util.List<com.newtaxiprime.user.appcommon.data.local.ApplicationPermissionModel> preparePermissionList() {
        return null;
    }
    
    private final void customTextView(android.widget.TextView view) {
    }
}