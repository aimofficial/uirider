package com.newtaxiprime.user.taxiapp.datamodels.trip;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/trip/PromoDetail;", "Ljava/io/Serializable;", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "code", "getCode", "setCode", "expireDate", "getExpireDate", "setExpireDate", "id", "", "getId", "()I", "setId", "(I)V", "app_debug"})
public final class PromoDetail implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
    private int id = 0;
    @com.google.gson.annotations.SerializedName(value = "code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code = "";
    @com.google.gson.annotations.SerializedName(value = "amount")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String amount = "";
    @com.google.gson.annotations.SerializedName(value = "expire_date")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String expireDate = "";
    
    public PromoDetail() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpireDate() {
        return null;
    }
    
    public final void setExpireDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}