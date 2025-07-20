package com.newtaxiprime.user.taxiapp.adapters;

/**
 * EmergencyContactAdapter Constructor to intialize getEmergencyContactDetails and Context context
 *
 * @param getEmergencyContactDetails array list
 * @param context                    context of the emergency context
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002+,B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\nH\u0016J\u001c\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\nH\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\nH\u0016J\u000e\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter$ViewHolder;", "getEmergencyContactDetails", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/EmergencyContactModel;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "alterpostion", "", "getAlterpostion", "()I", "setAlterpostion", "(I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getGetEmergencyContactDetails", "()Ljava/util/ArrayList;", "setGetEmergencyContactDetails", "(Ljava/util/ArrayList;)V", "id1", "", "getId1", "()Ljava/lang/String;", "setId1", "(Ljava/lang/String;)V", "inflater", "Landroid/view/LayoutInflater;", "mItemClickListener", "Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter$OnItemClickListener;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "OnItemClickListener", "ViewHolder", "app_debug"})
public final class EmergencyContactAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.EmergencyContactModel> getEmergencyContactDetails;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private int alterpostion = 0;
    public java.lang.String id1;
    @org.jetbrains.annotations.NotNull()
    private final android.view.LayoutInflater inflater = null;
    private com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter.OnItemClickListener mItemClickListener;
    
    public EmergencyContactAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.EmergencyContactModel> getEmergencyContactDetails, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.EmergencyContactModel> getGetEmergencyContactDetails() {
        return null;
    }
    
    public final void setGetEmergencyContactDetails(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.EmergencyContactModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final int getAlterpostion() {
        return 0;
    }
    
    public final void setAlterpostion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId1() {
        return null;
    }
    
    public final void setId1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter.OnItemClickListener mItemClickListener) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.EmergencyContactAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter$OnItemClickListener;", "", "onItemClickListener", "", "number", "", "name", "id", "positionz", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClickListener(@org.jetbrains.annotations.NotNull()
        java.lang.String number, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String positionz);
    }
    
    /**
     * View Holder class for emergency contact
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/adapters/EmergencyContactAdapter;Landroid/view/View;)V", "deleteMenu", "Landroid/widget/ImageView;", "getDeleteMenu", "()Landroid/widget/ImageView;", "testName", "Landroid/widget/TextView;", "getTestName", "()Landroid/widget/TextView;", "testPhoneNumber", "getTestPhoneNumber", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView testName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView testPhoneNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView deleteMenu = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTestName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTestPhoneNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDeleteMenu() {
            return null;
        }
    }
}