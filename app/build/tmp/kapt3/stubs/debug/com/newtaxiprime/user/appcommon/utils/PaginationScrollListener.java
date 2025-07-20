package com.newtaxiprime.user.appcommon.utils;

/**
 * Pagination
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000bH$J \u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/PaginationScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "getTotalPageCount", "", "isLastPage", "", "isLoading", "loadMoreItems", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "app_debug"})
public abstract class PaginationScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    @org.jetbrains.annotations.Nullable()
    private final androidx.recyclerview.widget.LinearLayoutManager layoutManager = null;
    
    protected PaginationScrollListener(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.LinearLayoutManager layoutManager) {
        super();
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    protected abstract void loadMoreItems();
    
    public abstract boolean isLastPage();
    
    public abstract boolean isLoading();
    
    public abstract int getTotalPageCount();
}