package com.newtaxiprime.user.appcommon.utils.userchoice;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/userchoice/UserChoiceSuccessResponse;", "", "onSuccessUserSelected", "", "type", "", "userChoiceData", "userChoiceCode", "app_debug"})
public abstract interface UserChoiceSuccessResponse {
    
    public abstract void onSuccessUserSelected(@org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String userChoiceData, @org.jetbrains.annotations.Nullable()
    java.lang.String userChoiceCode);
}