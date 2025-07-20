package com.newtaxiprime.user.appcommon.utils;

/**
 * ***************************************************************
 * Enums
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/newtaxiprime/user/appcommon/utils/Enums;", "", "()V", "REG_GET_CHECK_VERSION", "", "REG_GET_PAYMENTMETHOD", "REQ_ADD_CARD", "REQ_ADD_PROMO", "REQ_ADD_WALLET", "REQ_AFTER_PAY", "REQ_CANCEL", "REQ_CANCEL_TRIP", "REQ_COMMON_DATA", "REQ_CURRENCYLIST", "REQ_CURRENCY_CONVERT", "REQ_GET_DRIVER", "REQ_GET_INVOICE", "REQ_GET_PROMO", "REQ_GET_RIDER_PROFILE", "REQ_LOGOUT", "REQ_NEAREST_CARS", "REQ_OTP_VERIFIACTION", "REQ_PAST_TRIPS", "REQ_PAYPAL_CURRENCY", "REQ_PAYTM_CURRENCY", "REQ_RESEND_OTP", "REQ_SEARCH_CARS", "REQ_SEND_REQUEST", "REQ_SIGNUP", "REQ_TRIP_DETAIL", "REQ_UPCOMING_TRIPS", "REQ_UPDATE_CURR", "REQ_UPDATE_LANG", "REQ_UPDATE_LOCATION", "REQ_UPDATE_PROFILE", "REQ_UPLOAD_PROFILE_IMG", "USER_CHOICE_CURRENCY", "", "USER_CHOICE_LANGUAGE", "app_debug"})
public final class Enums {
    public static final int REQ_SIGNUP = 101;
    public static final int REQ_RESEND_OTP = 102;
    public static final int REQ_GET_RIDER_PROFILE = 103;
    public static final int REQ_SEARCH_CARS = 104;
    public static final int REQ_UPDATE_LOCATION = 105;
    public static final int REQ_SEND_REQUEST = 106;
    public static final int REQ_GET_DRIVER = 107;
    public static final int REQ_TRIP_DETAIL = 108;
    public static final int REQ_PAYPAL_CURRENCY = 109;
    public static final int REQ_AFTER_PAY = 110;
    public static final int REQ_UPDATE_PROFILE = 111;
    public static final int REQ_LOGOUT = 112;
    public static final int REQ_CURRENCYLIST = 113;
    public static final int REQ_UPDATE_CURR = 114;
    public static final int REQ_UPDATE_LANG = 115;
    public static final int REQ_GET_PROMO = 116;
    public static final int REQ_ADD_PROMO = 117;
    public static final int REQ_ADD_WALLET = 118;
    public static final int REQ_UPLOAD_PROFILE_IMG = 119;
    public static final int REQ_ADD_CARD = 120;
    public static final int REQ_GET_INVOICE = 123;
    public static final int REQ_CANCEL_TRIP = 124;
    public static final int REQ_CANCEL = 125;
    public static final int REQ_COMMON_DATA = 126;
    public static final int REQ_NEAREST_CARS = 127;
    public static final int REQ_PAST_TRIPS = 129;
    public static final int REQ_UPCOMING_TRIPS = 130;
    public static final int REQ_CURRENCY_CONVERT = 132;
    public static final int REG_GET_PAYMENTMETHOD = 133;
    public static final int REG_GET_CHECK_VERSION = 134;
    public static final int REQ_OTP_VERIFIACTION = 135;
    public static final int REQ_PAYTM_CURRENCY = 136;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_CHOICE_LANGUAGE = "language";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_CHOICE_CURRENCY = "currency";
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.utils.Enums INSTANCE = null;
    
    private Enums() {
        super();
    }
}