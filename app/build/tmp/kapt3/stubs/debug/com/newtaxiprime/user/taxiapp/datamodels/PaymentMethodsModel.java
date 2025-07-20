package com.newtaxiprime.user.taxiapp.datamodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/PaymentMethodsModel;", "Ljava/io/Serializable;", "()V", "paymentlist", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/taxiapp/datamodels/PaymentMethodsModel$PaymentMethods;", "getPaymentlist", "()Ljava/util/ArrayList;", "setPaymentlist", "(Ljava/util/ArrayList;)V", "statusCode", "", "getStatusCode", "()Ljava/lang/String;", "setStatusCode", "(Ljava/lang/String;)V", "statusMessage", "getStatusMessage", "setStatusMessage", "PaymentMethods", "app_debug"})
public final class PaymentMethodsModel implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "status_code")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusCode = "";
    @com.google.gson.annotations.SerializedName(value = "status_message")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusMessage = "";
    @com.google.gson.annotations.SerializedName(value = "payment_list")
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.PaymentMethodsModel.PaymentMethods> paymentlist;
    
    public PaymentMethodsModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusMessage() {
        return null;
    }
    
    public final void setStatusMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.PaymentMethodsModel.PaymentMethods> getPaymentlist() {
        return null;
    }
    
    public final void setPaymentlist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.taxiapp.datamodels.PaymentMethodsModel.PaymentMethods> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/taxiapp/datamodels/PaymentMethodsModel$PaymentMethods;", "", "(Lcom/newtaxiprime/user/taxiapp/datamodels/PaymentMethodsModel;)V", "isDefaultPaymentMethod", "", "()Z", "setDefaultPaymentMethod", "(Z)V", "paymenMethodIcon", "", "getPaymenMethodIcon", "()Ljava/lang/String;", "setPaymenMethodIcon", "(Ljava/lang/String;)V", "paymenMethodKey", "getPaymenMethodKey", "setPaymenMethodKey", "paymenMethodvalue", "getPaymenMethodvalue", "setPaymenMethodvalue", "app_debug"})
    public final class PaymentMethods {
        @com.google.gson.annotations.SerializedName(value = "key")
        @com.google.gson.annotations.Expose()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String paymenMethodKey = "";
        @com.google.gson.annotations.SerializedName(value = "value")
        @com.google.gson.annotations.Expose()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String paymenMethodvalue = "";
        @com.google.gson.annotations.SerializedName(value = "icon")
        @com.google.gson.annotations.Expose()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String paymenMethodIcon = "";
        @com.google.gson.annotations.SerializedName(value = "is_default")
        @com.google.gson.annotations.Expose()
        private boolean isDefaultPaymentMethod = false;
        
        public PaymentMethods() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPaymenMethodKey() {
            return null;
        }
        
        public final void setPaymenMethodKey(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPaymenMethodvalue() {
            return null;
        }
        
        public final void setPaymenMethodvalue(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPaymenMethodIcon() {
            return null;
        }
        
        public final void setPaymenMethodIcon(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final boolean isDefaultPaymentMethod() {
            return false;
        }
        
        public final void setDefaultPaymentMethod(boolean p0) {
        }
    }
}