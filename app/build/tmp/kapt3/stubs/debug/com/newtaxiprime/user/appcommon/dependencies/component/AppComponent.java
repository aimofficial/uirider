package com.newtaxiprime.user.appcommon.dependencies.component;

/**
 * ***************************************************************
 * App Component
 */
@javax.inject.Singleton()
@dagger.Component(modules = {com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule.class, com.newtaxiprime.user.appcommon.dependencies.module.ApplicationModule.class, com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b8\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\'H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u000203H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00104\u001a\u000205H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00106\u001a\u000207H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00108\u001a\u000209H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010@\u001a\u00020AH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010B\u001a\u00020CH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010D\u001a\u00020EH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020GH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020IH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010J\u001a\u00020KH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010L\u001a\u00020MH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010N\u001a\u00020OH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010P\u001a\u00020QH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010R\u001a\u00020SH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010V\u001a\u00020WH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010X\u001a\u00020YH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010^\u001a\u00020_H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010`\u001a\u00020aH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010b\u001a\u00020cH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010d\u001a\u00020eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010f\u001a\u00020gH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010h\u001a\u00020iH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010j\u001a\u00020kH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010l\u001a\u00020mH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010n\u001a\u00020oH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010p\u001a\u00020qH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010r\u001a\u00020sH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010t\u001a\u00020uH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010v\u001a\u00020wH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010x\u001a\u00020yH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010z\u001a\u00020{H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010|\u001a\u00020}H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u007fH&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H&J\u0011\u0010\u0002\u001a\u00020\u00032\u0007\u0010|\u001a\u00030\u0082\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H&\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/newtaxiprime/user/appcommon/dependencies/component/AppComponent;", "", "inject", "", "imageCompressAsyncTask", "Lcom/newtaxiprime/user/appcommon/backgroundtask/ImageCompressAsyncTask;", "runTimePermission", "Lcom/newtaxiprime/user/appcommon/configs/RunTimePermission;", "sessionManager", "Lcom/newtaxiprime/user/appcommon/configs/SessionManager;", "downloadTask", "Lcom/newtaxiprime/user/appcommon/drawpolyline/DownloadTask;", "commonDialog", "Lcom/newtaxiprime/user/appcommon/helper/CommonDialog;", "myFirebaseInstanceIDService", "Lcom/newtaxiprime/user/appcommon/pushnotification/MyFirebaseInstanceIDService;", "myFirebaseMessagingService", "Lcom/newtaxiprime/user/appcommon/pushnotification/MyFirebaseMessagingService;", "commonMethods", "Lcom/newtaxiprime/user/appcommon/utils/CommonMethods;", "requestCallback", "Lcom/newtaxiprime/user/appcommon/utils/RequestCallback;", "userChoice", "Lcom/newtaxiprime/user/appcommon/utils/userchoice/UserChoice;", "bannerActivityCommon", "Lcom/newtaxiprime/user/appcommon/views/BannerActivityCommon;", "bannerAdapter", "Lcom/newtaxiprime/user/appcommon/views/BannerAdapter;", "commonActivity", "Lcom/newtaxiprime/user/appcommon/views/CommonActivity;", "flutterwavePaymentWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/FlutterwaveWebViewActivity;", "mollieWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/MollieWebViewActivity;", "mpesaPaymentWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/MpesaPaymentWebViewActivity;", "paymentWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/PaymentWebViewActivity;", "paystackWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/PaystackWebViewActivity;", "paytmPaymentWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/PaytmPaymentWebViewActivity;", "razorpayWebViewActivity", "Lcom/newtaxiprime/user/appcommon/views/RazorpayWebViewActivity;", "supportActivityCommon", "Lcom/newtaxiprime/user/appcommon/views/SupportActivityCommon;", "supportAdapter", "Lcom/newtaxiprime/user/appcommon/views/SupportAdapter;", "scheduleRideDetailActivity", "Lcom/newtaxiprime/user/taxiapp/ScheduleRideDetailActivity;", "carDetailsListAdapter", "Lcom/newtaxiprime/user/taxiapp/adapters/CarDetailsListAdapter;", "pastTripsPaginationAdapter", "Lcom/newtaxiprime/user/taxiapp/adapters/PastTripsPaginationAdapter;", "priceRecycleAdapter", "Lcom/newtaxiprime/user/taxiapp/adapters/PriceRecycleAdapter;", "upcomingAdapter", "Lcom/newtaxiprime/user/taxiapp/adapters/UpcomingAdapter;", "upcomingTripsPaginationAdapter", "Lcom/newtaxiprime/user/taxiapp/adapters/UpcomingTripsPaginationAdapter;", "firebaseDatabase", "Lcom/newtaxiprime/user/taxiapp/database/AddFirebaseDatabase;", "cancelYourTripActivity", "Lcom/newtaxiprime/user/taxiapp/sendrequest/CancelYourTripActivity;", "driverNotAcceptActivity", "Lcom/newtaxiprime/user/taxiapp/sendrequest/DriverNotAcceptActivity;", "driverRatingActivity", "Lcom/newtaxiprime/user/taxiapp/sendrequest/DriverRatingActivity;", "paymentAmountPage", "Lcom/newtaxiprime/user/taxiapp/sendrequest/PaymentAmountPage;", "sendingRequestActivity", "Lcom/newtaxiprime/user/taxiapp/sendrequest/SendingRequestActivity;", "addHome", "Lcom/newtaxiprime/user/taxiapp/sidebar/AddHome;", "driverContactActivity", "Lcom/newtaxiprime/user/taxiapp/sidebar/DriverContactActivity;", "enRoute", "Lcom/newtaxiprime/user/taxiapp/sidebar/EnRoute;", "fareBreakdown", "Lcom/newtaxiprime/user/taxiapp/sidebar/FareBreakdown;", "profile", "Lcom/newtaxiprime/user/taxiapp/sidebar/Profile;", "profileMenu", "Lcom/newtaxiprime/user/taxiapp/sidebar/ProfileMenu;", "setting", "Lcom/newtaxiprime/user/taxiapp/sidebar/Setting;", "addWalletActivity", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/AddWalletActivity;", "paymentMethodAdapter", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentMethodAdapter;", "paymentPage", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PaymentPage;", "promoAmountActivity", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountActivity;", "promoAmountAdapter", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/PromoAmountAdapter;", "transferMoney", "Lcom/newtaxiprime/user/taxiapp/sidebar/payment/TransferMoney;", "showReferralOptions", "Lcom/newtaxiprime/user/taxiapp/sidebar/referral/ShowReferralOptions;", "past", "Lcom/newtaxiprime/user/taxiapp/sidebar/trips/Past;", "receipt", "Lcom/newtaxiprime/user/taxiapp/sidebar/trips/Receipt;", "tripDetails", "Lcom/newtaxiprime/user/taxiapp/sidebar/trips/TripDetails;", "upcoming", "Lcom/newtaxiprime/user/taxiapp/sidebar/trips/Upcoming;", "yourTrips", "Lcom/newtaxiprime/user/taxiapp/sidebar/trips/YourTrips;", "addCardActivity", "Lcom/newtaxiprime/user/taxiapp/views/addCardDetails/AddCardActivity;", "emergencyContact", "Lcom/newtaxiprime/user/taxiapp/views/emergency/EmergencyContact;", "sos_activity", "Lcom/newtaxiprime/user/taxiapp/views/emergency/SosActivity;", "facebookAccountKitActivity", "Lcom/newtaxiprime/user/taxiapp/views/facebookAccountKit/FacebookAccountKitActivity;", "activityChat", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/ActivityChat;", "adapterFirebaseRecylcerview", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/AdapterFirebaseRecylcerview;", "firebaseChatHandler", "Lcom/newtaxiprime/user/taxiapp/views/firebaseChat/FirebaseChatHandler;", "mainActivity", "Lcom/newtaxiprime/user/taxiapp/views/main/MainActivity;", "featuresInVehicleAdapter", "Lcom/newtaxiprime/user/taxiapp/views/main/filter/FeaturesInVehicleAdapter;", "peakPricing", "Lcom/newtaxiprime/user/taxiapp/views/peakPricing/PeakPricing;", "Lcom/newtaxiprime/user/taxiapp/views/search/PlaceSearchActivity;", "loginActivity", "Lcom/newtaxiprime/user/taxiapp/views/signinsignup/SSLoginActivity;", "ssSocialDetailsActivity", "Lcom/newtaxiprime/user/taxiapp/views/signinsignup/SSRegisterActivity;", "ssResetPassword", "Lcom/newtaxiprime/user/taxiapp/views/signinsignup/SSResetPassword;", "signin_signup_activity", "Lcom/newtaxiprime/user/taxiapp/views/signinsignup/SigninSignupActivity;", "splashActivity", "Lcom/newtaxiprime/user/taxiapp/views/splash/SplashActivity;", "callProcessingActivity", "Lcom/newtaxiprime/user/taxiapp/views/voip/CallProcessingActivity;", "NewTaxiSinchService", "Lcom/newtaxiprime/user/taxiapp/views/voip/NewTaxiSinchService;", "app_debug"})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.splash.SplashActivity splashActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.main.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.ScheduleRideDetailActivity scheduleRideDetailActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sendrequest.SendingRequestActivity sendingRequestActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity driverNotAcceptActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.ProfileMenu profileMenu);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity signin_signup_activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.signinsignup.SSResetPassword ssResetPassword);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.signinsignup.SSRegisterActivity ssSocialDetailsActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.DriverContactActivity driverContactActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.AddHome addHome);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentPage paymentPage);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sendrequest.PaymentAmountPage paymentAmountPage);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.FareBreakdown fareBreakdown);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.AddWalletActivity addWalletActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney transferMoney);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountActivity promoAmountActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.trips.YourTrips yourTrips);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.trips.TripDetails tripDetails);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.EnRoute enRoute);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.emergency.SosActivity sos_activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sendrequest.DriverRatingActivity driverRatingActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sendrequest.CancelYourTripActivity cancelYourTripActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.helper.CommonDialog commonDialog);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.Setting setting);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.Profile profile);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.emergency.EmergencyContact emergencyContact);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat activityChat);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity facebookAccountKitActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity loginActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.peakPricing.PeakPricing peakPricing);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions showReferralOptions);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.voip.CallProcessingActivity callProcessingActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService NewTaxiSinchService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.trips.Past past);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.trips.Upcoming upcoming);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.trips.Receipt receipt);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.RunTimePermission runTimePermission);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.configs.SessionManager sessionManager);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.CommonMethods commonMethods);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.RequestCallback requestCallback);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter upcomingAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter promoAmountAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter carDetailsListAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseMessagingService myFirebaseMessagingService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService myFirebaseInstanceIDService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler firebaseChatHandler);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.firebaseChat.AdapterFirebaseRecylcerview adapterFirebaseRecylcerview);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.backgroundtask.ImageCompressAsyncTask imageCompressAsyncTask);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.drawpolyline.DownloadTask downloadTask);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase firebaseDatabase);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter priceRecycleAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.PastTripsPaginationAdapter pastTripsPaginationAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.adapters.UpcomingTripsPaginationAdapter upcomingTripsPaginationAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity addCardActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter paymentMethodAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInVehicleAdapter featuresInVehicleAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.SupportActivityCommon supportActivityCommon);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.SupportAdapter supportAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.BannerActivityCommon bannerActivityCommon);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.BannerAdapter bannerAdapter);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.PaymentWebViewActivity paymentWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.PaytmPaymentWebViewActivity paytmPaymentWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.MpesaPaymentWebViewActivity mpesaPaymentWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.FlutterwaveWebViewActivity flutterwavePaymentWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.RazorpayWebViewActivity razorpayWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.PaystackWebViewActivity paystackWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.MollieWebViewActivity mollieWebViewActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.views.CommonActivity commonActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice userChoice);
}