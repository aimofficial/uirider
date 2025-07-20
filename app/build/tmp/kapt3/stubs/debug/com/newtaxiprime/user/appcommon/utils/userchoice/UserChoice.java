package com.newtaxiprime.user.appcommon.utils.userchoice;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u001d\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ2\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010 \u001a\u00020\u001eH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/userchoice/UserChoice;", "", "()V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "getCommonMethods", "()Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "setCommonMethods", "(Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;)V", "context", "Landroid/content/Context;", "currencyList", "Ljava/util/ArrayList;", "Lcom/newtaxiprime/user/appcommon/datamodels/settings/CurrencyListModel;", "languageList", "", "Lcom/newtaxiprime/user/taxiapp/sidebar/currency/CurrencyModel;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "getSessionManager", "()Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "setSessionManager", "(Lcom/newtaxiprime/user/appcommon/configs/SessionManager;)V", "type", "", "userChoiceSuccessResponse", "Lcom/newtaxiprime/user/appcommon/utils/userchoice/UserChoiceSuccessResponse;", "getUserCurrency", "", "getUsersLanguages", "showBottomSheet", "app_debug"})
public final class UserChoice {
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager;
    @javax.inject.Inject()
    public com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private java.util.List<com.newtaxiprime.user.taxiapp.sidebar.currency.CurrencyModel> languageList;
    private java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.settings.CurrencyListModel> currencyList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private com.newtaxiprime.user.appcommon.utils.userchoice.UserChoiceSuccessResponse userChoiceSuccessResponse;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    
    public UserChoice() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.configs.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newtaxiprime.user.appcommon.utils.CommonMethods getCommonMethods() {
        return null;
    }
    
    public final void setCommonMethods(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods p0) {
    }
    
    public final void getUsersLanguages(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.newtaxiprime.user.taxiapp.sidebar.currency.CurrencyModel> languageList, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.appcommon.utils.userchoice.UserChoiceSuccessResponse userChoiceSuccessResponse) {
    }
    
    public final void getUserCurrency(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newtaxiprime.user.appcommon.datamodels.settings.CurrencyListModel> currencyList, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.newtaxiprime.user.appcommon.utils.userchoice.UserChoiceSuccessResponse userChoiceSuccessResponse) {
    }
    
    /**
     * init BottomSheet
     */
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final void showBottomSheet() {
    }
}