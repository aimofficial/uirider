package com.newtaxiprime.user.taxiapp.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/SeatsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newtaxiprime/user/taxiapp/adapters/SeatsListAdapter$SeatsAdapter;", "onClickListener", "Lcom/newtaxiprime/user/taxiapp/adapters/SeatsListAdapter$OnClickListener;", "context", "Landroid/content/Context;", "seatslist", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Lcom/newtaxiprime/user/taxiapp/adapters/SeatsListAdapter$OnClickListener;Landroid/content/Context;Ljava/util/ArrayList;)V", "rowPosition", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickListener", "SeatsAdapter", "app_debug"})
public final class SeatsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newtaxiprime.user.taxiapp.adapters.SeatsListAdapter.SeatsAdapter> {
    @org.jetbrains.annotations.NotNull()
    private com.newtaxiprime.user.taxiapp.adapters.SeatsListAdapter.OnClickListener onClickListener;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> seatslist = null;
    private int rowPosition = 0;
    
    public SeatsListAdapter(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.SeatsListAdapter.OnClickListener onClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> seatslist) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.newtaxiprime.user.taxiapp.adapters.SeatsListAdapter.SeatsAdapter onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.SeatsListAdapter.SeatsAdapter holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/SeatsListAdapter$OnClickListener;", "", "onClick", "", "pos", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        java.lang.String pos);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/adapters/SeatsListAdapter$SeatsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowView", "Landroid/view/View;", "(Landroid/view/View;)V", "tv_seat", "Landroid/widget/TextView;", "getTv_seat$app_debug", "()Landroid/widget/TextView;", "app_debug"})
    public static final class SeatsAdapter extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View rowView;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tv_seat = null;
        
        public SeatsAdapter(@org.jetbrains.annotations.NotNull()
        android.view.View rowView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTv_seat$app_debug() {
            return null;
        }
    }
}