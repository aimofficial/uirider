package com.newtaxiprime.user.taxiapp.adapters;

/**
 * Constructor for Car details list adapter
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001-B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0016J\u0006\u0010%\u001a\u00020&J\u001c\u0010\'\u001a\u00020&2\n\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020\u0017H\u0016J\u001c\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006."}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/CarDetailsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/adapters/CarDetailsListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "modelItems", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/main/NearestCar;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "first", "", "getFirst", "()Z", "setFirst", "(Z)V", "selectcar", "getSelectcar", "setSelectcar", "selectedItem", "", "getSelectedItem", "()I", "setSelectedItem", "(I)V", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "getItem", "position", "getItemCount", "notifyDataChanged", "", "onBindViewHolder", "viewHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class CarDetailsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> modelItems = null;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    private int selectedItem = -1;
    private boolean selectcar = true;
    private boolean first = true;
    
    public CarDetailsListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar> modelItems) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    public final int getSelectedItem() {
        return 0;
    }
    
    public final void setSelectedItem(int p0) {
    }
    
    public final boolean getSelectcar() {
        return false;
    }
    
    public final void setSelectcar(boolean p0) {
    }
    
    public final boolean getFirst() {
        return false;
    }
    
    public final void setFirst(boolean p0) {
    }
    
    /**
     * View holder
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    /**
     * Bind View holder
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter.ViewHolder viewHolder, int i) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * Get Car details for given position
     */
    private final com.newtaxiprime.user.taxiapp.datamodels.main.NearestCar getItem(int position) {
        return null;
    }
    
    /**
     * Reload list
     */
    public final void notifyDataChanged() {
    }
    
    /**
     * View holder
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/CarDetailsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/adapters/CarDetailsListAdapter;Landroid/view/View;)V", "car_amount", "Landroid/widget/TextView;", "getCar_amount", "()Landroid/widget/TextView;", "car_min", "getCar_min", "car_name", "getCar_name", "carimage", "Landroid/widget/ImageView;", "getCarimage", "()Landroid/widget/ImageView;", "setCarimage", "(Landroid/widget/ImageView;)V", "image_pool", "getImage_pool", "lltView", "Landroid/widget/LinearLayout;", "getLltView", "()Landroid/widget/LinearLayout;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView carimage;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView car_min = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView car_amount = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView car_name = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView image_pool = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout lltView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCarimage() {
            return null;
        }
        
        public final void setCarimage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCar_min() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCar_amount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCar_name() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getImage_pool() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLltView() {
            return null;
        }
    }
}