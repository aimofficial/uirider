package com.newtaxiprime.user.taxiapp.views.main.filter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInVehicleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInVehicleAdapter$ViewHolder;", "featuresInCarModel", "", "Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInCarModel;", "featureSelectListener", "Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeatureSelectListener;", "(Ljava/util/List;Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeatureSelectListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FeaturesInVehicleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInVehicleAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel> featuresInCarModel = null;
    @org.jetbrains.annotations.NotNull()
    private com.newtaxiprime.user.taxiapp.views.main.filter.FeatureSelectListener featureSelectListener;
    
    public FeaturesInVehicleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel> featuresInCarModel, @org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.main.filter.FeatureSelectListener featureSelectListener) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInVehicleAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInVehicleAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInVehicleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/newtaxiprime/user/databinding/UpdateFiltersBinding;", "(Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInVehicleAdapter;Lcom/newtaxiprime/user/databinding/UpdateFiltersBinding;)V", "getBinding", "()Lcom/newtaxiprime/user/databinding/UpdateFiltersBinding;", "bind", "", "featuresInCarModel", "Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInCarModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.newtaxiprime.user.databinding.UpdateFiltersBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.newtaxiprime.user.databinding.UpdateFiltersBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.newtaxiprime.user.databinding.UpdateFiltersBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel featuresInCarModel) {
        }
    }
}