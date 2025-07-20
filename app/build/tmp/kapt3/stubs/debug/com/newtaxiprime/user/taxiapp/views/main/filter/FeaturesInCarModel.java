package com.newtaxiprime.user.taxiapp.views.main.filter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInCarModel;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()I", "setId", "(I)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "app_debug"})
public final class FeaturesInCarModel implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
    private int id = 0;
    @com.google.gson.annotations.SerializedName(value = "name")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @com.google.gson.annotations.SerializedName(value = "isSelected")
    @com.google.gson.annotations.Expose()
    private boolean isSelected = false;
    
    public FeaturesInCarModel() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
}