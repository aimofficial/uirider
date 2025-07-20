package com.newtaxiprime.user.taxiapp.views.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB%\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView$RecyclerViewHolder;", "autocompletePredictions", "", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "mContext", "Landroid/content/Context;", "autoCompleteAddressTouchListener", "Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView$AutoCompleteAddressTouchListener;", "(Ljava/util/List;Landroid/content/Context;Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView$AutoCompleteAddressTouchListener;)V", "inflater", "Landroid/view/LayoutInflater;", "clearAddresses", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "AutoCompleteAddressTouchListener", "RecyclerViewHolder", "app_debug"})
public final class GoogleMapPlaceSearchAutoCompleteRecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView.RecyclerViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> autocompletePredictions;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private final com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView.AutoCompleteAddressTouchListener autoCompleteAddressTouchListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.LayoutInflater inflater = null;
    
    public GoogleMapPlaceSearchAutoCompleteRecyclerView(@org.jetbrains.annotations.Nullable()
    java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> autocompletePredictions, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView.AutoCompleteAddressTouchListener autoCompleteAddressTouchListener) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView.RecyclerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.search.GoogleMapPlaceSearchAutoCompleteRecyclerView.RecyclerViewHolder holder, int position) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> autocompletePredictions) {
    }
    
    public final void clearAddresses() {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView$AutoCompleteAddressTouchListener;", "", "selectedAddress", "", "autocompletePrediction", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "app_debug"})
    public static abstract interface AutoCompleteAddressTouchListener {
        
        public abstract void selectedAddress(@org.jetbrains.annotations.Nullable()
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView$RecyclerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/newtaxiprime/user/taxiapp/views/search/GoogleMapPlaceSearchAutoCompleteRecyclerView;Landroid/view/View;)V", "address", "Landroid/widget/TextView;", "getAddress", "()Landroid/widget/TextView;", "setAddress", "(Landroid/widget/TextView;)V", "addressSecondary", "getAddressSecondary", "setAddressSecondary", "predictedRow", "Landroid/widget/RelativeLayout;", "getPredictedRow", "()Landroid/widget/RelativeLayout;", "setPredictedRow", "(Landroid/widget/RelativeLayout;)V", "app_debug"})
    public final class RecyclerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView address;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView addressSecondary;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout predictedRow;
        
        public RecyclerViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAddressSecondary() {
            return null;
        }
        
        public final void setAddressSecondary(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getPredictedRow() {
            return null;
        }
        
        public final void setPredictedRow(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
    }
}