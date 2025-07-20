package com.newtaxiprime.user.appcommon.interfaces;

/**
 * ***************************************************************
 * ApiService
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0012H\'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J@\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J@\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u0006H\'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'JJ\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\'\u001a\u00020\u0006H\'J$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J,\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020\u0006H\'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J@\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00100\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u00020\u00062\b\b\u0001\u00103\u001a\u00020\u0006H\'J,\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00105\u001a\u00020\u00062\b\b\u0001\u00106\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00108\u001a\u00020\u0006H\'J\"\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020:H\'J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J$\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J\"\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0006H\'J\"\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0006H\'J\"\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00108\u001a\u00020\u0006H\'J\"\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0006H\'JT\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\'\u001a\u00020\u00062\b\b\u0001\u0010B\u001a\u00020\u0006H\'J,\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J@\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010B\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u0006H\'J$\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J,\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J,\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'J$\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0012H\'J\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J$\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J$\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J$\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J$\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J@\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010P\u001a\u00020\u00062\b\b\u0001\u0010Q\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\'\u001a\u00020\u00062\b\b\u0001\u0010B\u001a\u00020\u0006H\'JJ\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010S\u001a\u00020\u00062\b\b\u0001\u0010T\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010U\u001a\u00020\u0006H\'J,\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00105\u001a\u00020\u00062\b\b\u0001\u00106\u001a\u00020\u0006H\'J$\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0012H\'JJ\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010Y\u001a\u00020\u00062\b\b\u0001\u0010Z\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010[\u001a\u00020\u0006H\'J$\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J\"\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u0006H\'J6\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00103\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\'\u001a\u00020\u0006H\'J\"\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010B\u001a\u00020\u0006H\'J$\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'JT\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010b\u001a\u00020\u00062\b\b\u0001\u0010c\u001a\u00020\u00062\b\b\u0001\u0010d\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010e\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010g\u001a\u00020h2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J$\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\'J\u0018\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006k"}, d2 = {"Lcom/newtaxiprime/user/appcommon/interfaces/ApiService;", "", "addCard", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "stripeId", "", "token", "addPromoDetails", "code", "addWalletMoneyUsingFlutterwave", "paykey", "amount", "addWalletMoneyUsingMpesa", "addWalletMoneyUsingPaypal", "addWalletMoneyUsingPaytm", "addWalletMoneyUsingStripe", "walletParams", "Ljava/util/LinkedHashMap;", "cancelReasons", "cancelScheduleTrip", "cancelReason", "cancelMessage", "trip_id", "user_type", "cancelTrip", "checkVersion", "type", "deviceType", "currencyConversion", "paymentType", "currencyList", "flutterwaveCurrency", "currency_code", "forgotpassword", "mobile_number", "country_code", "password", "device_type", "device_id", "getBanners", "hashMap", "Ljava/util/HashMap;", "getCallerDetail", "userID", "pushStatus", "getCommonData", "getInvoice", "isWallet", "paymentMethod", "TripId", "userType", "getNearestVehicles", "latitude", "longitude", "getPastTrips", "page", "getPaymentMethodlist", "", "getReferralDetails", "getRiderProfile", "getRiderTrips", "getTripDetails", "getUpcomingTrips", "logOut", "login", "language", "mpesaCurrency", "numbervalidation", "otpVerification", "paypalCurrency", "paytmCurrency", "proceedAfterPayment", "linkedHashMap", "promoDetails", "register", "scheduleRide", "searchCars", "sendRequest", "socialoldsignup", "authType", "authId", "sos", "action", "name", "id", "sosalert", "transferMoney", "tripRating", "rating", "rating_comments", "driverTips", "updateChat", "updateCurrency", "updateDevice", "updateLanguage", "updateLocation", "updateProfile", "profile_image", "first_name", "last_name", "email_id", "uploadImage", "RequestBody", "Lokhttp3/RequestBody;", "uploadRiderLocation", "viewCard", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "numbervalidation")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> numbervalidation(@retrofit2.http.Query(value = "mobile_number")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @retrofit2.http.Query(value = "country_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country_code, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Query(value = "forgotpassword")
    @org.jetbrains.annotations.NotNull()
    java.lang.String forgotpassword);
    
    @retrofit2.http.GET(value = "forgotpassword")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> forgotpassword(@retrofit2.http.Query(value = "mobile_number")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @retrofit2.http.Query(value = "country_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country_code, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type, @retrofit2.http.Query(value = "password")
    @org.jetbrains.annotations.NotNull()
    java.lang.String password, @retrofit2.http.Query(value = "device_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_type, @retrofit2.http.Query(value = "device_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_id);
    
    @retrofit2.http.GET(value = "login")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> login(@retrofit2.http.Query(value = "mobile_number")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @retrofit2.http.Query(value = "country_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country_code, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type, @retrofit2.http.Query(value = "password")
    @org.jetbrains.annotations.NotNull()
    java.lang.String password, @retrofit2.http.Query(value = "device_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_type, @retrofit2.http.Query(value = "device_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_id, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language);
    
    @retrofit2.http.GET(value = "socialsignup")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> socialoldsignup(@retrofit2.http.Query(value = "auth_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authType, @retrofit2.http.Query(value = "auth_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authId, @retrofit2.http.Query(value = "device_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_type, @retrofit2.http.Query(value = "device_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_id, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language);
    
    @retrofit2.http.GET(value = "register")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> register(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "get_rider_profile")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getRiderProfile(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "get_banners")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getBanners(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "trip_rating")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> tripRating(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "trip_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String trip_id, @retrofit2.http.Query(value = "rating")
    @org.jetbrains.annotations.NotNull()
    java.lang.String rating, @retrofit2.http.Query(value = "rating_comments")
    @org.jetbrains.annotations.NotNull()
    java.lang.String rating_comments, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type, @retrofit2.http.Query(value = "tips")
    @org.jetbrains.annotations.NotNull()
    java.lang.String driverTips);
    
    @retrofit2.http.GET(value = "search_cars")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> searchCars(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "request_cars")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> sendRequest(@retrofit2.http.FieldMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "save_schedule_ride")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> scheduleRide(@retrofit2.http.FieldMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "updateriderlocation")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> updateLocation(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "send_message")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> updateChat(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "update_rider_location")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> uploadRiderLocation(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
    
    @retrofit2.http.GET(value = "get_rider_trips")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getRiderTrips(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    @retrofit2.http.GET(value = "add_wallet")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addWalletMoneyUsingPaytm(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "paykey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paykey, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.GET(value = "paytm_currency_conversion")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> paytmCurrency(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "currency_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currency_code, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.GET(value = "add_wallet")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addWalletMoneyUsingFlutterwave(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "paykey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paykey, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.GET(value = "flutterwave_currency_conversion")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> flutterwaveCurrency(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "currency_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currency_code, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.GET(value = "add_wallet")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addWalletMoneyUsingMpesa(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "paykey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paykey, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.GET(value = "mpesa_currency_conversion")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> mpesaCurrency(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "currency_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currency_code, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.GET(value = "paypal_currency_conversion")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> paypalCurrency(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "currency_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currency_code, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "add_wallet")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addWalletMoneyUsingStripe(@retrofit2.http.FieldMap()
    @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.String> walletParams);
    
    @retrofit2.http.GET(value = "add_wallet")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addWalletMoneyUsingPaypal(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "paykey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paykey, @retrofit2.http.Query(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "after_payment")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> proceedAfterPayment(@retrofit2.http.FieldMap()
    @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap);
    
    @retrofit2.http.GET(value = "update_rider_profile")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> updateProfile(@retrofit2.http.Query(value = "profile_image")
    @org.jetbrains.annotations.NotNull()
    java.lang.String profile_image, @retrofit2.http.Query(value = "first_name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String first_name, @retrofit2.http.Query(value = "last_name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String last_name, @retrofit2.http.Query(value = "country_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country_code, @retrofit2.http.Query(value = "mobile_number")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @retrofit2.http.Query(value = "email_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String email_id, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "transfer_money")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> transferMoney(@retrofit2.http.FieldMap()
    @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.String> walletParams);
    
    @retrofit2.http.POST(value = "upload_profile_image")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> uploadImage(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody RequestBody, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "logout")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> logOut(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type);
    
    @retrofit2.http.GET(value = "currency_list")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> currencyList(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "language")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> updateLanguage(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language);
    
    @retrofit2.http.GET(value = "update_user_currency")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> updateCurrency(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "currency_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currency_code);
    
    @retrofit2.http.GET(value = "cancel_trip")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> cancelTrip(@retrofit2.http.Query(value = "cancel_reason_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String cancelReason, @retrofit2.http.Query(value = "cancel_comments")
    @org.jetbrains.annotations.NotNull()
    java.lang.String cancelMessage, @retrofit2.http.Query(value = "trip_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String trip_id, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "cancel_reasons")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> cancelReasons(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "schedule_ride_cancel")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> cancelScheduleTrip(@retrofit2.http.Query(value = "cancel_reason_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String cancelReason, @retrofit2.http.Query(value = "cancel_comments")
    @org.jetbrains.annotations.NotNull()
    java.lang.String cancelMessage, @retrofit2.http.Query(value = "trip_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String trip_id, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user_type, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "update_device")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> updateDevice(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userType, @retrofit2.http.Query(value = "device_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_type, @retrofit2.http.Query(value = "device_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String device_id);
    
    @retrofit2.http.GET(value = "promo_details")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> promoDetails(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "add_promo_code")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addPromoDetails(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @retrofit2.http.GET(value = "add_card_details")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> addCard(@retrofit2.http.Query(value = "intent_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String stripeId, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "sosalert")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> sosalert(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "latitude")
    @org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @retrofit2.http.Query(value = "longitude")
    @org.jetbrains.annotations.NotNull()
    java.lang.String longitude);
    
    @retrofit2.http.GET(value = "sos")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> sos(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "mobile_number")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @retrofit2.http.Query(value = "action")
    @org.jetbrains.annotations.NotNull()
    java.lang.String action, @retrofit2.http.Query(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name, @retrofit2.http.Query(value = "country_code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String country_code, @retrofit2.http.Query(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @retrofit2.http.GET(value = "get_referral_details")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getReferralDetails(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "get_invoice")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getInvoice(@retrofit2.http.Query(value = "is_wallet")
    @org.jetbrains.annotations.NotNull()
    java.lang.String isWallet, @retrofit2.http.Query(value = "payment_mode")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "trip_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String TripId, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userType);
    
    @retrofit2.http.GET(value = "check_version")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> checkVersion(@retrofit2.http.Query(value = "version")
    @org.jetbrains.annotations.NotNull()
    java.lang.String code, @retrofit2.http.Query(value = "user_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "device_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String deviceType);
    
    @retrofit2.http.GET(value = "get_caller_detail")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getCallerDetail(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "user_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userID, @retrofit2.http.Query(value = "send_push_notification")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pushStatus);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "common_data")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getCommonData(@retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "get_nearest_vehicles")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getNearestVehicles(@retrofit2.http.Query(value = "latitude")
    @org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @retrofit2.http.Query(value = "longitude")
    @org.jetbrains.annotations.NotNull()
    java.lang.String longitude, @retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.GET(value = "get_past_trips")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getPastTrips(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String page);
    
    @retrofit2.http.GET(value = "get_upcoming_trips")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getUpcomingTrips(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull()
    java.lang.String page);
    
    @retrofit2.http.GET(value = "get_trip_details")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getTripDetails(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Query(value = "trip_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String trip_id);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "currency_conversion")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> currencyConversion(@retrofit2.http.Field(value = "amount")
    @org.jetbrains.annotations.NotNull()
    java.lang.String amount, @retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "payment_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String paymentType);
    
    @retrofit2.http.GET(value = "get_card_details")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> viewCard(@retrofit2.http.Query(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "get_payment_list")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getPaymentMethodlist(@retrofit2.http.Field(value = "token")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Field(value = "is_wallet")
    int isWallet);
    
    @retrofit2.http.GET(value = "otp_verification")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> otpVerification(@retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> hashMap);
}