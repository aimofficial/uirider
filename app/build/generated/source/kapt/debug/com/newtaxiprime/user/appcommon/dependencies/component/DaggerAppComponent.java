package com.newtaxiprime.user.appcommon.dependencies.component;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import com.newtaxiprime.user.appcommon.backgroundtask.ImageCompressAsyncTask;
import com.newtaxiprime.user.appcommon.backgroundtask.ImageCompressAsyncTask_MembersInjector;
import com.newtaxiprime.user.appcommon.configs.RunTimePermission;
import com.newtaxiprime.user.appcommon.configs.RunTimePermission_MembersInjector;
import com.newtaxiprime.user.appcommon.configs.SessionManager;
import com.newtaxiprime.user.appcommon.configs.SessionManager_MembersInjector;
import com.newtaxiprime.user.appcommon.database.SqLiteDb;
import com.newtaxiprime.user.appcommon.datamodels.JsonResponse;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesCommonMethodsFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesContextFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesCustomDialogFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesJsonResponseFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesRunTimePermissionFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesSessionManagerFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesSharedPreferencesFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesSqlite$app_debugFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesStringArrayListFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.AppContainerModule_ProvidesUserChoiceFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.ApplicationModule;
import com.newtaxiprime.user.appcommon.dependencies.module.ApplicationModule_ApplicationFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule;
import com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule_ProvidesApiServiceFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule_ProvidesGsonFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule_ProvidesHttpLoggingInterceptorFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule_ProvidesOkHttpClientFactory;
import com.newtaxiprime.user.appcommon.dependencies.module.NetworkModule_ProvidesRetrofitServiceFactory;
import com.newtaxiprime.user.appcommon.drawpolyline.DownloadTask;
import com.newtaxiprime.user.appcommon.drawpolyline.DownloadTask_MembersInjector;
import com.newtaxiprime.user.appcommon.helper.CommonDialog;
import com.newtaxiprime.user.appcommon.helper.CommonDialog_MembersInjector;
import com.newtaxiprime.user.appcommon.interfaces.ApiService;
import com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService;
import com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseInstanceIDService_MembersInjector;
import com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseMessagingService;
import com.newtaxiprime.user.appcommon.pushnotification.MyFirebaseMessagingService_MembersInjector;
import com.newtaxiprime.user.appcommon.utils.CommonMethods;
import com.newtaxiprime.user.appcommon.utils.CommonMethods_MembersInjector;
import com.newtaxiprime.user.appcommon.utils.RequestCallback;
import com.newtaxiprime.user.appcommon.utils.RequestCallback_MembersInjector;
import com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice;
import com.newtaxiprime.user.appcommon.utils.userchoice.UserChoice_MembersInjector;
import com.newtaxiprime.user.appcommon.views.BannerActivityCommon;
import com.newtaxiprime.user.appcommon.views.BannerActivityCommon_MembersInjector;
import com.newtaxiprime.user.appcommon.views.BannerAdapter;
import com.newtaxiprime.user.appcommon.views.BannerAdapter_MembersInjector;
import com.newtaxiprime.user.appcommon.views.CommonActivity;
import com.newtaxiprime.user.appcommon.views.CommonActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.FlutterwaveWebViewActivity;
import com.newtaxiprime.user.appcommon.views.FlutterwaveWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.MollieWebViewActivity;
import com.newtaxiprime.user.appcommon.views.MollieWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.MpesaPaymentWebViewActivity;
import com.newtaxiprime.user.appcommon.views.MpesaPaymentWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.PaymentWebViewActivity;
import com.newtaxiprime.user.appcommon.views.PaymentWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.PaystackWebViewActivity;
import com.newtaxiprime.user.appcommon.views.PaystackWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.PaytmPaymentWebViewActivity;
import com.newtaxiprime.user.appcommon.views.PaytmPaymentWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.RazorpayWebViewActivity;
import com.newtaxiprime.user.appcommon.views.RazorpayWebViewActivity_MembersInjector;
import com.newtaxiprime.user.appcommon.views.SupportActivityCommon;
import com.newtaxiprime.user.appcommon.views.SupportActivityCommon_MembersInjector;
import com.newtaxiprime.user.appcommon.views.SupportAdapter;
import com.newtaxiprime.user.appcommon.views.SupportAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.ScheduleRideDetailActivity;
import com.newtaxiprime.user.taxiapp.ScheduleRideDetailActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter;
import com.newtaxiprime.user.taxiapp.adapters.CarDetailsListAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.adapters.PastTripsPaginationAdapter;
import com.newtaxiprime.user.taxiapp.adapters.PastTripsPaginationAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter;
import com.newtaxiprime.user.taxiapp.adapters.PriceRecycleAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter;
import com.newtaxiprime.user.taxiapp.adapters.UpcomingAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.adapters.UpcomingTripsPaginationAdapter;
import com.newtaxiprime.user.taxiapp.adapters.UpcomingTripsPaginationAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase;
import com.newtaxiprime.user.taxiapp.database.AddFirebaseDatabase_MembersInjector;
import com.newtaxiprime.user.taxiapp.sendrequest.CancelYourTripActivity;
import com.newtaxiprime.user.taxiapp.sendrequest.CancelYourTripActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity;
import com.newtaxiprime.user.taxiapp.sendrequest.DriverNotAcceptActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sendrequest.DriverRatingActivity;
import com.newtaxiprime.user.taxiapp.sendrequest.DriverRatingActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sendrequest.PaymentAmountPage;
import com.newtaxiprime.user.taxiapp.sendrequest.PaymentAmountPage_MembersInjector;
import com.newtaxiprime.user.taxiapp.sendrequest.SendingRequestActivity;
import com.newtaxiprime.user.taxiapp.sendrequest.SendingRequestActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.AddHome;
import com.newtaxiprime.user.taxiapp.sidebar.AddHome_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.DriverContactActivity;
import com.newtaxiprime.user.taxiapp.sidebar.DriverContactActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.EnRoute;
import com.newtaxiprime.user.taxiapp.sidebar.EnRoute_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.FareBreakdown;
import com.newtaxiprime.user.taxiapp.sidebar.FareBreakdown_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.Profile;
import com.newtaxiprime.user.taxiapp.sidebar.ProfileMenu;
import com.newtaxiprime.user.taxiapp.sidebar.ProfileMenu_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.Profile_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.Setting;
import com.newtaxiprime.user.taxiapp.sidebar.Setting_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.payment.AddWalletActivity;
import com.newtaxiprime.user.taxiapp.sidebar.payment.AddWalletActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentMethodAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentPage;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PaymentPage_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountActivity;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter;
import com.newtaxiprime.user.taxiapp.sidebar.payment.PromoAmountAdapter_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney;
import com.newtaxiprime.user.taxiapp.sidebar.payment.TransferMoney_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions;
import com.newtaxiprime.user.taxiapp.sidebar.referral.ShowReferralOptions_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.trips.Past;
import com.newtaxiprime.user.taxiapp.sidebar.trips.Past_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.trips.Receipt;
import com.newtaxiprime.user.taxiapp.sidebar.trips.Receipt_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.trips.TripDetails;
import com.newtaxiprime.user.taxiapp.sidebar.trips.TripDetails_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.trips.Upcoming;
import com.newtaxiprime.user.taxiapp.sidebar.trips.Upcoming_MembersInjector;
import com.newtaxiprime.user.taxiapp.sidebar.trips.YourTrips;
import com.newtaxiprime.user.taxiapp.sidebar.trips.YourTrips_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity;
import com.newtaxiprime.user.taxiapp.views.addCardDetails.AddCardActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.customize.CustomDialog;
import com.newtaxiprime.user.taxiapp.views.emergency.EmergencyContact;
import com.newtaxiprime.user.taxiapp.views.emergency.EmergencyContact_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.emergency.SosActivity;
import com.newtaxiprime.user.taxiapp.views.emergency.SosActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity;
import com.newtaxiprime.user.taxiapp.views.facebookAccountKit.FacebookAccountKitActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat;
import com.newtaxiprime.user.taxiapp.views.firebaseChat.ActivityChat_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.firebaseChat.AdapterFirebaseRecylcerview;
import com.newtaxiprime.user.taxiapp.views.firebaseChat.AdapterFirebaseRecylcerview_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler;
import com.newtaxiprime.user.taxiapp.views.firebaseChat.FirebaseChatHandler_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.main.MainActivity;
import com.newtaxiprime.user.taxiapp.views.main.MainActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInVehicleAdapter;
import com.newtaxiprime.user.taxiapp.views.peakPricing.PeakPricing;
import com.newtaxiprime.user.taxiapp.views.peakPricing.PeakPricing_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity;
import com.newtaxiprime.user.taxiapp.views.search.PlaceSearchActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SSLoginActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SSRegisterActivity;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SSRegisterActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SSResetPassword;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SSResetPassword_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity;
import com.newtaxiprime.user.taxiapp.views.signinsignup.SigninSignupActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.splash.SplashActivity;
import com.newtaxiprime.user.taxiapp.views.splash.SplashActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.voip.CallProcessingActivity;
import com.newtaxiprime.user.taxiapp.views.voip.CallProcessingActivity_MembersInjector;
import com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService;
import com.newtaxiprime.user.taxiapp.views.voip.NewTaxiSinchService_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private ApplicationModule applicationModule;

    private AppContainerModule appContainerModule;

    private Builder() {
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder appContainerModule(AppContainerModule appContainerModule) {
      this.appContainerModule = Preconditions.checkNotNull(appContainerModule);
      return this;
    }

    public AppComponent build() {
      Preconditions.checkBuilderRequirement(networkModule, NetworkModule.class);
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      if (appContainerModule == null) {
        this.appContainerModule = new AppContainerModule();
      }
      return new AppComponentImpl(networkModule, applicationModule, appContainerModule);
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppComponentImpl appComponentImpl = this;

    private Provider<SessionManager> providesSessionManagerProvider;

    private Provider<Application> applicationProvider;

    private Provider<Context> providesContextProvider;

    private Provider<HttpLoggingInterceptor> providesHttpLoggingInterceptorProvider;

    private Provider<OkHttpClient.Builder> providesOkHttpClientProvider;

    private Provider<Gson> providesGsonProvider;

    private Provider<Retrofit> providesRetrofitServiceProvider;

    private Provider<ApiService> providesApiServiceProvider;

    private Provider<CommonMethods> providesCommonMethodsProvider;

    private Provider<SqLiteDb> providesSqlite$app_debugProvider;

    private Provider<CustomDialog> providesCustomDialogProvider;

    private Provider<UserChoice> providesUserChoiceProvider;

    private Provider<RunTimePermission> providesRunTimePermissionProvider;

    private Provider<ArrayList<String>> providesStringArrayListProvider;

    private Provider<SharedPreferences> providesSharedPreferencesProvider;

    private Provider<JsonResponse> providesJsonResponseProvider;

    private AppComponentImpl(NetworkModule networkModuleParam,
        ApplicationModule applicationModuleParam, AppContainerModule appContainerModuleParam) {

      initialize(networkModuleParam, applicationModuleParam, appContainerModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final NetworkModule networkModuleParam,
        final ApplicationModule applicationModuleParam,
        final AppContainerModule appContainerModuleParam) {
      this.providesSessionManagerProvider = DoubleCheck.provider(AppContainerModule_ProvidesSessionManagerFactory.create(appContainerModuleParam));
      this.applicationProvider = DoubleCheck.provider(ApplicationModule_ApplicationFactory.create(applicationModuleParam));
      this.providesContextProvider = DoubleCheck.provider(AppContainerModule_ProvidesContextFactory.create(appContainerModuleParam, applicationProvider));
      this.providesHttpLoggingInterceptorProvider = DoubleCheck.provider(NetworkModule_ProvidesHttpLoggingInterceptorFactory.create(networkModuleParam));
      this.providesOkHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvidesOkHttpClientFactory.create(networkModuleParam, providesContextProvider, providesHttpLoggingInterceptorProvider, providesSessionManagerProvider));
      this.providesGsonProvider = DoubleCheck.provider(NetworkModule_ProvidesGsonFactory.create(networkModuleParam));
      this.providesRetrofitServiceProvider = DoubleCheck.provider(NetworkModule_ProvidesRetrofitServiceFactory.create(networkModuleParam, providesOkHttpClientProvider, providesGsonProvider));
      this.providesApiServiceProvider = DoubleCheck.provider(NetworkModule_ProvidesApiServiceFactory.create(networkModuleParam, providesRetrofitServiceProvider));
      this.providesCommonMethodsProvider = DoubleCheck.provider(AppContainerModule_ProvidesCommonMethodsFactory.create(appContainerModuleParam));
      this.providesSqlite$app_debugProvider = DoubleCheck.provider(AppContainerModule_ProvidesSqlite$app_debugFactory.create(appContainerModuleParam));
      this.providesCustomDialogProvider = DoubleCheck.provider(AppContainerModule_ProvidesCustomDialogFactory.create(appContainerModuleParam));
      this.providesUserChoiceProvider = DoubleCheck.provider(AppContainerModule_ProvidesUserChoiceFactory.create(appContainerModuleParam));
      this.providesRunTimePermissionProvider = DoubleCheck.provider(AppContainerModule_ProvidesRunTimePermissionFactory.create(appContainerModuleParam));
      this.providesStringArrayListProvider = DoubleCheck.provider(AppContainerModule_ProvidesStringArrayListFactory.create(appContainerModuleParam));
      this.providesSharedPreferencesProvider = DoubleCheck.provider(AppContainerModule_ProvidesSharedPreferencesFactory.create(appContainerModuleParam, applicationProvider));
      this.providesJsonResponseProvider = DoubleCheck.provider(AppContainerModule_ProvidesJsonResponseFactory.create(appContainerModuleParam));
    }

    @Override
    public void inject(SplashActivity splashActivity) {
      injectSplashActivity(splashActivity);
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    @Override
    public void inject(ScheduleRideDetailActivity scheduleRideDetailActivity) {
      injectScheduleRideDetailActivity(scheduleRideDetailActivity);
    }

    @Override
    public void inject(SendingRequestActivity sendingRequestActivity) {
      injectSendingRequestActivity(sendingRequestActivity);
    }

    @Override
    public void inject(DriverNotAcceptActivity driverNotAcceptActivity) {
      injectDriverNotAcceptActivity(driverNotAcceptActivity);
    }

    @Override
    public void inject(PlaceSearchActivity mainActivity) {
      injectPlaceSearchActivity(mainActivity);
    }

    @Override
    public void inject(ProfileMenu profileMenu) {
      injectProfileMenu(profileMenu);
    }

    @Override
    public void inject(SigninSignupActivity signin_signup_activity) {
      injectSigninSignupActivity(signin_signup_activity);
    }

    @Override
    public void inject(SSResetPassword ssResetPassword) {
      injectSSResetPassword(ssResetPassword);
    }

    @Override
    public void inject(SSRegisterActivity ssSocialDetailsActivity) {
      injectSSRegisterActivity(ssSocialDetailsActivity);
    }

    @Override
    public void inject(DriverContactActivity driverContactActivity) {
      injectDriverContactActivity(driverContactActivity);
    }

    @Override
    public void inject(AddHome addHome) {
      injectAddHome(addHome);
    }

    @Override
    public void inject(PaymentPage paymentPage) {
      injectPaymentPage(paymentPage);
    }

    @Override
    public void inject(PaymentAmountPage paymentAmountPage) {
      injectPaymentAmountPage(paymentAmountPage);
    }

    @Override
    public void inject(FareBreakdown fareBreakdown) {
      injectFareBreakdown(fareBreakdown);
    }

    @Override
    public void inject(AddWalletActivity addWalletActivity) {
      injectAddWalletActivity(addWalletActivity);
    }

    @Override
    public void inject(TransferMoney transferMoney) {
      injectTransferMoney(transferMoney);
    }

    @Override
    public void inject(PromoAmountActivity promoAmountActivity) {
      injectPromoAmountActivity(promoAmountActivity);
    }

    @Override
    public void inject(YourTrips yourTrips) {
      injectYourTrips(yourTrips);
    }

    @Override
    public void inject(TripDetails tripDetails) {
      injectTripDetails(tripDetails);
    }

    @Override
    public void inject(EnRoute enRoute) {
      injectEnRoute(enRoute);
    }

    @Override
    public void inject(SosActivity sos_activity) {
      injectSosActivity(sos_activity);
    }

    @Override
    public void inject(DriverRatingActivity driverRatingActivity) {
      injectDriverRatingActivity(driverRatingActivity);
    }

    @Override
    public void inject(CancelYourTripActivity cancelYourTripActivity) {
      injectCancelYourTripActivity(cancelYourTripActivity);
    }

    @Override
    public void inject(CommonDialog commonDialog) {
      injectCommonDialog(commonDialog);
    }

    @Override
    public void inject(Setting setting) {
      injectSetting(setting);
    }

    @Override
    public void inject(Profile profile) {
      injectProfile(profile);
    }

    @Override
    public void inject(EmergencyContact emergencyContact) {
      injectEmergencyContact(emergencyContact);
    }

    @Override
    public void inject(ActivityChat activityChat) {
      injectActivityChat(activityChat);
    }

    @Override
    public void inject(FacebookAccountKitActivity facebookAccountKitActivity) {
      injectFacebookAccountKitActivity(facebookAccountKitActivity);
    }

    @Override
    public void inject(SSLoginActivity loginActivity) {
      injectSSLoginActivity(loginActivity);
    }

    @Override
    public void inject(PeakPricing peakPricing) {
      injectPeakPricing(peakPricing);
    }

    @Override
    public void inject(ShowReferralOptions showReferralOptions) {
      injectShowReferralOptions(showReferralOptions);
    }

    @Override
    public void inject(CallProcessingActivity callProcessingActivity) {
      injectCallProcessingActivity(callProcessingActivity);
    }

    @Override
    public void inject(NewTaxiSinchService NewTaxiSinchService) {
      injectNewTaxiSinchService(NewTaxiSinchService);
    }

    @Override
    public void inject(Past past) {
      injectPast(past);
    }

    @Override
    public void inject(Upcoming upcoming) {
      injectUpcoming(upcoming);
    }

    @Override
    public void inject(Receipt receipt) {
      injectReceipt(receipt);
    }

    @Override
    public void inject(RunTimePermission runTimePermission) {
      injectRunTimePermission(runTimePermission);
    }

    @Override
    public void inject(SessionManager sessionManager) {
      injectSessionManager(sessionManager);
    }

    @Override
    public void inject(CommonMethods commonMethods) {
      injectCommonMethods(commonMethods);
    }

    @Override
    public void inject(RequestCallback requestCallback) {
      injectRequestCallback(requestCallback);
    }

    @Override
    public void inject(UpcomingAdapter upcomingAdapter) {
      injectUpcomingAdapter(upcomingAdapter);
    }

    @Override
    public void inject(PromoAmountAdapter promoAmountAdapter) {
      injectPromoAmountAdapter(promoAmountAdapter);
    }

    @Override
    public void inject(CarDetailsListAdapter carDetailsListAdapter) {
      injectCarDetailsListAdapter(carDetailsListAdapter);
    }

    @Override
    public void inject(MyFirebaseMessagingService myFirebaseMessagingService) {
      injectMyFirebaseMessagingService(myFirebaseMessagingService);
    }

    @Override
    public void inject(MyFirebaseInstanceIDService myFirebaseInstanceIDService) {
      injectMyFirebaseInstanceIDService(myFirebaseInstanceIDService);
    }

    @Override
    public void inject(FirebaseChatHandler firebaseChatHandler) {
      injectFirebaseChatHandler(firebaseChatHandler);
    }

    @Override
    public void inject(AdapterFirebaseRecylcerview adapterFirebaseRecylcerview) {
      injectAdapterFirebaseRecylcerview(adapterFirebaseRecylcerview);
    }

    @Override
    public void inject(ImageCompressAsyncTask imageCompressAsyncTask) {
      injectImageCompressAsyncTask(imageCompressAsyncTask);
    }

    @Override
    public void inject(DownloadTask downloadTask) {
      injectDownloadTask(downloadTask);
    }

    @Override
    public void inject(AddFirebaseDatabase firebaseDatabase) {
      injectAddFirebaseDatabase(firebaseDatabase);
    }

    @Override
    public void inject(PriceRecycleAdapter priceRecycleAdapter) {
      injectPriceRecycleAdapter(priceRecycleAdapter);
    }

    @Override
    public void inject(PastTripsPaginationAdapter pastTripsPaginationAdapter) {
      injectPastTripsPaginationAdapter(pastTripsPaginationAdapter);
    }

    @Override
    public void inject(UpcomingTripsPaginationAdapter upcomingTripsPaginationAdapter) {
      injectUpcomingTripsPaginationAdapter(upcomingTripsPaginationAdapter);
    }

    @Override
    public void inject(AddCardActivity addCardActivity) {
      injectAddCardActivity(addCardActivity);
    }

    @Override
    public void inject(PaymentMethodAdapter paymentMethodAdapter) {
      injectPaymentMethodAdapter(paymentMethodAdapter);
    }

    @Override
    public void inject(FeaturesInVehicleAdapter featuresInVehicleAdapter) {
    }

    @Override
    public void inject(SupportActivityCommon supportActivityCommon) {
      injectSupportActivityCommon(supportActivityCommon);
    }

    @Override
    public void inject(SupportAdapter supportAdapter) {
      injectSupportAdapter(supportAdapter);
    }

    @Override
    public void inject(BannerActivityCommon bannerActivityCommon) {
      injectBannerActivityCommon(bannerActivityCommon);
    }

    @Override
    public void inject(BannerAdapter bannerAdapter) {
      injectBannerAdapter(bannerAdapter);
    }

    @Override
    public void inject(PaymentWebViewActivity paymentWebViewActivity) {
      injectPaymentWebViewActivity(paymentWebViewActivity);
    }

    @Override
    public void inject(PaytmPaymentWebViewActivity paytmPaymentWebViewActivity) {
      injectPaytmPaymentWebViewActivity(paytmPaymentWebViewActivity);
    }

    @Override
    public void inject(MpesaPaymentWebViewActivity mpesaPaymentWebViewActivity) {
      injectMpesaPaymentWebViewActivity(mpesaPaymentWebViewActivity);
    }

    @Override
    public void inject(FlutterwaveWebViewActivity flutterwavePaymentWebViewActivity) {
      injectFlutterwaveWebViewActivity(flutterwavePaymentWebViewActivity);
    }

    @Override
    public void inject(RazorpayWebViewActivity razorpayWebViewActivity) {
      injectRazorpayWebViewActivity(razorpayWebViewActivity);
    }

    @Override
    public void inject(PaystackWebViewActivity paystackWebViewActivity) {
      injectPaystackWebViewActivity(paystackWebViewActivity);
    }

    @Override
    public void inject(MollieWebViewActivity mollieWebViewActivity) {
      injectMollieWebViewActivity(mollieWebViewActivity);
    }

    @Override
    public void inject(CommonActivity commonActivity) {
      injectCommonActivity(commonActivity);
    }

    @Override
    public void inject(UserChoice userChoice) {
      injectUserChoice(userChoice);
    }

    @CanIgnoreReturnValue
    private SplashActivity injectSplashActivity(SplashActivity instance) {
      CommonActivity_MembersInjector.injectLocal(instance, providesSessionManagerProvider.get());
      SplashActivity_MembersInjector.injectSessionManager(instance, providesSessionManagerProvider.get());
      SplashActivity_MembersInjector.injectApiService(instance, providesApiServiceProvider.get());
      SplashActivity_MembersInjector.injectCommonMethods(instance, providesCommonMethodsProvider.get());
      SplashActivity_MembersInjector.injectGson(instance, providesGsonProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity(MainActivity instance2) {
      CommonActivity_MembersInjector.injectLocal(instance2, providesSessionManagerProvider.get());
      MainActivity_MembersInjector.injectDbHelper(instance2, providesSqlite$app_debugProvider.get());
      MainActivity_MembersInjector.injectSessionManager(instance2, providesSessionManagerProvider.get());
      MainActivity_MembersInjector.injectCommonMethods(instance2, providesCommonMethodsProvider.get());
      MainActivity_MembersInjector.injectApiService(instance2, providesApiServiceProvider.get());
      MainActivity_MembersInjector.injectCustomDialog(instance2, providesCustomDialogProvider.get());
      MainActivity_MembersInjector.injectGson(instance2, providesGsonProvider.get());
      return instance2;
    }

    @CanIgnoreReturnValue
    private ScheduleRideDetailActivity injectScheduleRideDetailActivity(
        ScheduleRideDetailActivity instance3) {
      CommonActivity_MembersInjector.injectLocal(instance3, providesSessionManagerProvider.get());
      ScheduleRideDetailActivity_MembersInjector.injectSessionManager(instance3, providesSessionManagerProvider.get());
      ScheduleRideDetailActivity_MembersInjector.injectCommonMethods(instance3, providesCommonMethodsProvider.get());
      ScheduleRideDetailActivity_MembersInjector.injectApiService(instance3, providesApiServiceProvider.get());
      ScheduleRideDetailActivity_MembersInjector.injectCustomDialog(instance3, providesCustomDialogProvider.get());
      ScheduleRideDetailActivity_MembersInjector.injectGson(instance3, providesGsonProvider.get());
      return instance3;
    }

    @CanIgnoreReturnValue
    private SendingRequestActivity injectSendingRequestActivity(SendingRequestActivity instance4) {
      CommonActivity_MembersInjector.injectLocal(instance4, providesSessionManagerProvider.get());
      SendingRequestActivity_MembersInjector.injectSessionManager(instance4, providesSessionManagerProvider.get());
      SendingRequestActivity_MembersInjector.injectCommonMethods(instance4, providesCommonMethodsProvider.get());
      SendingRequestActivity_MembersInjector.injectApiService(instance4, providesApiServiceProvider.get());
      SendingRequestActivity_MembersInjector.injectCustomDialog(instance4, providesCustomDialogProvider.get());
      SendingRequestActivity_MembersInjector.injectGson(instance4, providesGsonProvider.get());
      return instance4;
    }

    @CanIgnoreReturnValue
    private DriverNotAcceptActivity injectDriverNotAcceptActivity(
        DriverNotAcceptActivity instance5) {
      CommonActivity_MembersInjector.injectLocal(instance5, providesSessionManagerProvider.get());
      DriverNotAcceptActivity_MembersInjector.injectSessionManager(instance5, providesSessionManagerProvider.get());
      DriverNotAcceptActivity_MembersInjector.injectCommonMethods(instance5, providesCommonMethodsProvider.get());
      DriverNotAcceptActivity_MembersInjector.injectApiService(instance5, providesApiServiceProvider.get());
      DriverNotAcceptActivity_MembersInjector.injectGson(instance5, providesGsonProvider.get());
      return instance5;
    }

    @CanIgnoreReturnValue
    private PlaceSearchActivity injectPlaceSearchActivity(PlaceSearchActivity instance6) {
      CommonActivity_MembersInjector.injectLocal(instance6, providesSessionManagerProvider.get());
      PlaceSearchActivity_MembersInjector.injectSessionManager(instance6, providesSessionManagerProvider.get());
      PlaceSearchActivity_MembersInjector.injectCommonMethods(instance6, providesCommonMethodsProvider.get());
      PlaceSearchActivity_MembersInjector.injectCustomDialog(instance6, providesCustomDialogProvider.get());
      return instance6;
    }

    @CanIgnoreReturnValue
    private ProfileMenu injectProfileMenu(ProfileMenu instance7) {
      CommonActivity_MembersInjector.injectLocal(instance7, providesSessionManagerProvider.get());
      ProfileMenu_MembersInjector.injectSessionManager(instance7, providesSessionManagerProvider.get());
      ProfileMenu_MembersInjector.injectCommonMethods(instance7, providesCommonMethodsProvider.get());
      ProfileMenu_MembersInjector.injectApiService(instance7, providesApiServiceProvider.get());
      ProfileMenu_MembersInjector.injectCustomDialog(instance7, providesCustomDialogProvider.get());
      ProfileMenu_MembersInjector.injectGson(instance7, providesGsonProvider.get());
      ProfileMenu_MembersInjector.injectUserChoice(instance7, providesUserChoiceProvider.get());
      return instance7;
    }

    @CanIgnoreReturnValue
    private SigninSignupActivity injectSigninSignupActivity(SigninSignupActivity instance8) {
      CommonActivity_MembersInjector.injectLocal(instance8, providesSessionManagerProvider.get());
      SigninSignupActivity_MembersInjector.injectCommonMethods(instance8, providesCommonMethodsProvider.get());
      SigninSignupActivity_MembersInjector.injectCustomDialog(instance8, providesCustomDialogProvider.get());
      SigninSignupActivity_MembersInjector.injectApiService(instance8, providesApiServiceProvider.get());
      SigninSignupActivity_MembersInjector.injectGson(instance8, providesGsonProvider.get());
      SigninSignupActivity_MembersInjector.injectUserChoice(instance8, providesUserChoiceProvider.get());
      SigninSignupActivity_MembersInjector.injectSessionManager(instance8, providesSessionManagerProvider.get());
      return instance8;
    }

    @CanIgnoreReturnValue
    private SSResetPassword injectSSResetPassword(SSResetPassword instance9) {
      CommonActivity_MembersInjector.injectLocal(instance9, providesSessionManagerProvider.get());
      SSResetPassword_MembersInjector.injectSessionManager(instance9, providesSessionManagerProvider.get());
      SSResetPassword_MembersInjector.injectCommonMethods(instance9, providesCommonMethodsProvider.get());
      SSResetPassword_MembersInjector.injectApiService(instance9, providesApiServiceProvider.get());
      SSResetPassword_MembersInjector.injectCustomDialog(instance9, providesCustomDialogProvider.get());
      SSResetPassword_MembersInjector.injectGson(instance9, providesGsonProvider.get());
      return instance9;
    }

    @CanIgnoreReturnValue
    private SSRegisterActivity injectSSRegisterActivity(SSRegisterActivity instance10) {
      CommonActivity_MembersInjector.injectLocal(instance10, providesSessionManagerProvider.get());
      SSRegisterActivity_MembersInjector.injectSessionManager(instance10, providesSessionManagerProvider.get());
      SSRegisterActivity_MembersInjector.injectCommonMethods(instance10, providesCommonMethodsProvider.get());
      SSRegisterActivity_MembersInjector.injectApiService(instance10, providesApiServiceProvider.get());
      SSRegisterActivity_MembersInjector.injectCustomDialog(instance10, providesCustomDialogProvider.get());
      SSRegisterActivity_MembersInjector.injectGson(instance10, providesGsonProvider.get());
      return instance10;
    }

    @CanIgnoreReturnValue
    private DriverContactActivity injectDriverContactActivity(DriverContactActivity instance11) {
      CommonActivity_MembersInjector.injectLocal(instance11, providesSessionManagerProvider.get());
      DriverContactActivity_MembersInjector.injectSessionManager(instance11, providesSessionManagerProvider.get());
      DriverContactActivity_MembersInjector.injectCommonMethods(instance11, providesCommonMethodsProvider.get());
      return instance11;
    }

    @CanIgnoreReturnValue
    private AddHome injectAddHome(AddHome instance12) {
      CommonActivity_MembersInjector.injectLocal(instance12, providesSessionManagerProvider.get());
      AddHome_MembersInjector.injectSessionManager(instance12, providesSessionManagerProvider.get());
      AddHome_MembersInjector.injectCommonMethods(instance12, providesCommonMethodsProvider.get());
      AddHome_MembersInjector.injectApiService(instance12, providesApiServiceProvider.get());
      AddHome_MembersInjector.injectCustomDialog(instance12, providesCustomDialogProvider.get());
      AddHome_MembersInjector.injectGson(instance12, providesGsonProvider.get());
      return instance12;
    }

    @CanIgnoreReturnValue
    private PaymentPage injectPaymentPage(PaymentPage instance13) {
      CommonActivity_MembersInjector.injectLocal(instance13, providesSessionManagerProvider.get());
      PaymentPage_MembersInjector.injectSessionManager(instance13, providesSessionManagerProvider.get());
      PaymentPage_MembersInjector.injectCommonMethods(instance13, providesCommonMethodsProvider.get());
      PaymentPage_MembersInjector.injectApiService(instance13, providesApiServiceProvider.get());
      PaymentPage_MembersInjector.injectCustomDialog(instance13, providesCustomDialogProvider.get());
      PaymentPage_MembersInjector.injectGson(instance13, providesGsonProvider.get());
      return instance13;
    }

    @CanIgnoreReturnValue
    private PaymentAmountPage injectPaymentAmountPage(PaymentAmountPage instance14) {
      CommonActivity_MembersInjector.injectLocal(instance14, providesSessionManagerProvider.get());
      PaymentAmountPage_MembersInjector.injectSessionManager(instance14, providesSessionManagerProvider.get());
      PaymentAmountPage_MembersInjector.injectCommonMethods(instance14, providesCommonMethodsProvider.get());
      PaymentAmountPage_MembersInjector.injectApiService(instance14, providesApiServiceProvider.get());
      PaymentAmountPage_MembersInjector.injectCustomDialog(instance14, providesCustomDialogProvider.get());
      PaymentAmountPage_MembersInjector.injectGson(instance14, providesGsonProvider.get());
      return instance14;
    }

    @CanIgnoreReturnValue
    private FareBreakdown injectFareBreakdown(FareBreakdown instance15) {
      CommonActivity_MembersInjector.injectLocal(instance15, providesSessionManagerProvider.get());
      FareBreakdown_MembersInjector.injectSessionManager(instance15, providesSessionManagerProvider.get());
      FareBreakdown_MembersInjector.injectCommonMethods(instance15, providesCommonMethodsProvider.get());
      return instance15;
    }

    @CanIgnoreReturnValue
    private AddWalletActivity injectAddWalletActivity(AddWalletActivity instance16) {
      CommonActivity_MembersInjector.injectLocal(instance16, providesSessionManagerProvider.get());
      AddWalletActivity_MembersInjector.injectSessionManager(instance16, providesSessionManagerProvider.get());
      AddWalletActivity_MembersInjector.injectCommonMethods(instance16, providesCommonMethodsProvider.get());
      AddWalletActivity_MembersInjector.injectApiService(instance16, providesApiServiceProvider.get());
      AddWalletActivity_MembersInjector.injectCustomDialog(instance16, providesCustomDialogProvider.get());
      AddWalletActivity_MembersInjector.injectGson(instance16, providesGsonProvider.get());
      return instance16;
    }

    @CanIgnoreReturnValue
    private TransferMoney injectTransferMoney(TransferMoney instance17) {
      CommonActivity_MembersInjector.injectLocal(instance17, providesSessionManagerProvider.get());
      TransferMoney_MembersInjector.injectSessionManager(instance17, providesSessionManagerProvider.get());
      TransferMoney_MembersInjector.injectCommonMethods(instance17, providesCommonMethodsProvider.get());
      TransferMoney_MembersInjector.injectApiService(instance17, providesApiServiceProvider.get());
      TransferMoney_MembersInjector.injectCustomDialog(instance17, providesCustomDialogProvider.get());
      TransferMoney_MembersInjector.injectRunTimePermission(instance17, providesRunTimePermissionProvider.get());
      TransferMoney_MembersInjector.injectGson(instance17, providesGsonProvider.get());
      return instance17;
    }

    @CanIgnoreReturnValue
    private PromoAmountActivity injectPromoAmountActivity(PromoAmountActivity instance18) {
      CommonActivity_MembersInjector.injectLocal(instance18, providesSessionManagerProvider.get());
      PromoAmountActivity_MembersInjector.injectSessionManager(instance18, providesSessionManagerProvider.get());
      PromoAmountActivity_MembersInjector.injectCommonMethods(instance18, providesCommonMethodsProvider.get());
      PromoAmountActivity_MembersInjector.injectCustomDialog(instance18, providesCustomDialogProvider.get());
      return instance18;
    }

    @CanIgnoreReturnValue
    private YourTrips injectYourTrips(YourTrips instance19) {
      CommonActivity_MembersInjector.injectLocal(instance19, providesSessionManagerProvider.get());
      YourTrips_MembersInjector.injectSessionManager(instance19, providesSessionManagerProvider.get());
      YourTrips_MembersInjector.injectCommonMethods(instance19, providesCommonMethodsProvider.get());
      YourTrips_MembersInjector.injectApiService(instance19, providesApiServiceProvider.get());
      YourTrips_MembersInjector.injectCustomDialog(instance19, providesCustomDialogProvider.get());
      YourTrips_MembersInjector.injectGson(instance19, providesGsonProvider.get());
      return instance19;
    }

    @CanIgnoreReturnValue
    private TripDetails injectTripDetails(TripDetails instance20) {
      CommonActivity_MembersInjector.injectLocal(instance20, providesSessionManagerProvider.get());
      TripDetails_MembersInjector.injectDbHelper(instance20, providesSqlite$app_debugProvider.get());
      TripDetails_MembersInjector.injectSessionManager(instance20, providesSessionManagerProvider.get());
      TripDetails_MembersInjector.injectCommonMethods(instance20, providesCommonMethodsProvider.get());
      TripDetails_MembersInjector.injectApiService(instance20, providesApiServiceProvider.get());
      TripDetails_MembersInjector.injectCustomDialog(instance20, providesCustomDialogProvider.get());
      TripDetails_MembersInjector.injectGson(instance20, providesGsonProvider.get());
      return instance20;
    }

    @CanIgnoreReturnValue
    private EnRoute injectEnRoute(EnRoute instance21) {
      CommonActivity_MembersInjector.injectLocal(instance21, providesSessionManagerProvider.get());
      EnRoute_MembersInjector.injectSessionManager(instance21, providesSessionManagerProvider.get());
      EnRoute_MembersInjector.injectCommonMethods(instance21, providesCommonMethodsProvider.get());
      return instance21;
    }

    @CanIgnoreReturnValue
    private SosActivity injectSosActivity(SosActivity instance22) {
      CommonActivity_MembersInjector.injectLocal(instance22, providesSessionManagerProvider.get());
      SosActivity_MembersInjector.injectSessionManager(instance22, providesSessionManagerProvider.get());
      SosActivity_MembersInjector.injectCommonMethods(instance22, providesCommonMethodsProvider.get());
      SosActivity_MembersInjector.injectApiService(instance22, providesApiServiceProvider.get());
      SosActivity_MembersInjector.injectCustomDialog(instance22, providesCustomDialogProvider.get());
      SosActivity_MembersInjector.injectGson(instance22, providesGsonProvider.get());
      return instance22;
    }

    @CanIgnoreReturnValue
    private DriverRatingActivity injectDriverRatingActivity(DriverRatingActivity instance23) {
      CommonActivity_MembersInjector.injectLocal(instance23, providesSessionManagerProvider.get());
      DriverRatingActivity_MembersInjector.injectSessionManager(instance23, providesSessionManagerProvider.get());
      DriverRatingActivity_MembersInjector.injectCommonMethods(instance23, providesCommonMethodsProvider.get());
      DriverRatingActivity_MembersInjector.injectApiService(instance23, providesApiServiceProvider.get());
      DriverRatingActivity_MembersInjector.injectCustomDialog(instance23, providesCustomDialogProvider.get());
      DriverRatingActivity_MembersInjector.injectGson(instance23, providesGsonProvider.get());
      return instance23;
    }

    @CanIgnoreReturnValue
    private CancelYourTripActivity injectCancelYourTripActivity(CancelYourTripActivity instance24) {
      CommonActivity_MembersInjector.injectLocal(instance24, providesSessionManagerProvider.get());
      CancelYourTripActivity_MembersInjector.injectSessionManager(instance24, providesSessionManagerProvider.get());
      CancelYourTripActivity_MembersInjector.injectCommonMethods(instance24, providesCommonMethodsProvider.get());
      CancelYourTripActivity_MembersInjector.injectApiService(instance24, providesApiServiceProvider.get());
      CancelYourTripActivity_MembersInjector.injectCustomDialog(instance24, providesCustomDialogProvider.get());
      CancelYourTripActivity_MembersInjector.injectGson(instance24, providesGsonProvider.get());
      return instance24;
    }

    @CanIgnoreReturnValue
    private CommonDialog injectCommonDialog(CommonDialog instance25) {
      CommonDialog_MembersInjector.injectSessionManager(instance25, providesSessionManagerProvider.get());
      CommonDialog_MembersInjector.injectCommonMethods(instance25, providesCommonMethodsProvider.get());
      return instance25;
    }

    @CanIgnoreReturnValue
    private Setting injectSetting(Setting instance26) {
      CommonActivity_MembersInjector.injectLocal(instance26, providesSessionManagerProvider.get());
      Setting_MembersInjector.injectSessionManager(instance26, providesSessionManagerProvider.get());
      Setting_MembersInjector.injectCommonMethods(instance26, providesCommonMethodsProvider.get());
      Setting_MembersInjector.injectApiService(instance26, providesApiServiceProvider.get());
      Setting_MembersInjector.injectCustomDialog(instance26, providesCustomDialogProvider.get());
      Setting_MembersInjector.injectGson(instance26, providesGsonProvider.get());
      Setting_MembersInjector.injectUserChoice(instance26, providesUserChoiceProvider.get());
      return instance26;
    }

    @CanIgnoreReturnValue
    private Profile injectProfile(Profile instance27) {
      CommonActivity_MembersInjector.injectLocal(instance27, providesSessionManagerProvider.get());
      Profile_MembersInjector.injectSessionManager(instance27, providesSessionManagerProvider.get());
      Profile_MembersInjector.injectCommonMethods(instance27, providesCommonMethodsProvider.get());
      Profile_MembersInjector.injectApiService(instance27, providesApiServiceProvider.get());
      Profile_MembersInjector.injectCustomDialog(instance27, providesCustomDialogProvider.get());
      Profile_MembersInjector.injectRunTimePermission(instance27, providesRunTimePermissionProvider.get());
      Profile_MembersInjector.injectGson(instance27, providesGsonProvider.get());
      return instance27;
    }

    @CanIgnoreReturnValue
    private EmergencyContact injectEmergencyContact(EmergencyContact instance28) {
      CommonActivity_MembersInjector.injectLocal(instance28, providesSessionManagerProvider.get());
      EmergencyContact_MembersInjector.injectDbHelper(instance28, providesSqlite$app_debugProvider.get());
      EmergencyContact_MembersInjector.injectSessionManager(instance28, providesSessionManagerProvider.get());
      EmergencyContact_MembersInjector.injectCommonMethods(instance28, providesCommonMethodsProvider.get());
      EmergencyContact_MembersInjector.injectApiService(instance28, providesApiServiceProvider.get());
      EmergencyContact_MembersInjector.injectCustomDialog(instance28, providesCustomDialogProvider.get());
      EmergencyContact_MembersInjector.injectGson(instance28, providesGsonProvider.get());
      return instance28;
    }

    @CanIgnoreReturnValue
    private ActivityChat injectActivityChat(ActivityChat instance29) {
      CommonActivity_MembersInjector.injectLocal(instance29, providesSessionManagerProvider.get());
      ActivityChat_MembersInjector.injectSessionManager(instance29, providesSessionManagerProvider.get());
      ActivityChat_MembersInjector.injectCommonMethods(instance29, providesCommonMethodsProvider.get());
      ActivityChat_MembersInjector.injectApiService(instance29, providesApiServiceProvider.get());
      ActivityChat_MembersInjector.injectCustomDialog(instance29, providesCustomDialogProvider.get());
      ActivityChat_MembersInjector.injectGson(instance29, providesGsonProvider.get());
      return instance29;
    }

    @CanIgnoreReturnValue
    private FacebookAccountKitActivity injectFacebookAccountKitActivity(
        FacebookAccountKitActivity instance30) {
      CommonActivity_MembersInjector.injectLocal(instance30, providesSessionManagerProvider.get());
      FacebookAccountKitActivity_MembersInjector.injectSessionManager(instance30, providesSessionManagerProvider.get());
      FacebookAccountKitActivity_MembersInjector.injectCommonMethods(instance30, providesCommonMethodsProvider.get());
      FacebookAccountKitActivity_MembersInjector.injectApiService(instance30, providesApiServiceProvider.get());
      FacebookAccountKitActivity_MembersInjector.injectGson(instance30, providesGsonProvider.get());
      FacebookAccountKitActivity_MembersInjector.injectCustomDialog(instance30, providesCustomDialogProvider.get());
      return instance30;
    }

    @CanIgnoreReturnValue
    private SSLoginActivity injectSSLoginActivity(SSLoginActivity instance31) {
      CommonActivity_MembersInjector.injectLocal(instance31, providesSessionManagerProvider.get());
      SSLoginActivity_MembersInjector.injectCommonMethods(instance31, providesCommonMethodsProvider.get());
      SSLoginActivity_MembersInjector.injectApiService(instance31, providesApiServiceProvider.get());
      SSLoginActivity_MembersInjector.injectSessionManager(instance31, providesSessionManagerProvider.get());
      SSLoginActivity_MembersInjector.injectGson(instance31, providesGsonProvider.get());
      SSLoginActivity_MembersInjector.injectCustomDialog(instance31, providesCustomDialogProvider.get());
      return instance31;
    }

    @CanIgnoreReturnValue
    private PeakPricing injectPeakPricing(PeakPricing instance32) {
      CommonActivity_MembersInjector.injectLocal(instance32, providesSessionManagerProvider.get());
      PeakPricing_MembersInjector.injectSessionManager(instance32, providesSessionManagerProvider.get());
      return instance32;
    }

    @CanIgnoreReturnValue
    private ShowReferralOptions injectShowReferralOptions(ShowReferralOptions instance33) {
      CommonActivity_MembersInjector.injectLocal(instance33, providesSessionManagerProvider.get());
      ShowReferralOptions_MembersInjector.injectCommonMethods(instance33, providesCommonMethodsProvider.get());
      ShowReferralOptions_MembersInjector.injectApiService(instance33, providesApiServiceProvider.get());
      ShowReferralOptions_MembersInjector.injectSessionManager(instance33, providesSessionManagerProvider.get());
      ShowReferralOptions_MembersInjector.injectGson(instance33, providesGsonProvider.get());
      ShowReferralOptions_MembersInjector.injectCustomDialog(instance33, providesCustomDialogProvider.get());
      return instance33;
    }

    @CanIgnoreReturnValue
    private CallProcessingActivity injectCallProcessingActivity(CallProcessingActivity instance34) {
      CommonActivity_MembersInjector.injectLocal(instance34, providesSessionManagerProvider.get());
      CallProcessingActivity_MembersInjector.injectSessionManager(instance34, providesSessionManagerProvider.get());
      CallProcessingActivity_MembersInjector.injectCommonMethods(instance34, providesCommonMethodsProvider.get());
      CallProcessingActivity_MembersInjector.injectApiService(instance34, providesApiServiceProvider.get());
      CallProcessingActivity_MembersInjector.injectCustomDialog(instance34, providesCustomDialogProvider.get());
      CallProcessingActivity_MembersInjector.injectGson(instance34, providesGsonProvider.get());
      return instance34;
    }

    @CanIgnoreReturnValue
    private NewTaxiSinchService injectNewTaxiSinchService(NewTaxiSinchService instance35) {
      NewTaxiSinchService_MembersInjector.injectSessionManager(instance35, providesSessionManagerProvider.get());
      return instance35;
    }

    @CanIgnoreReturnValue
    private Past injectPast(Past instance36) {
      Past_MembersInjector.injectDbHelper(instance36, providesSqlite$app_debugProvider.get());
      Past_MembersInjector.injectSessionManager(instance36, providesSessionManagerProvider.get());
      Past_MembersInjector.injectCommonMethods(instance36, providesCommonMethodsProvider.get());
      Past_MembersInjector.injectApiService(instance36, providesApiServiceProvider.get());
      Past_MembersInjector.injectCustomDialog(instance36, providesCustomDialogProvider.get());
      Past_MembersInjector.injectGson(instance36, providesGsonProvider.get());
      return instance36;
    }

    @CanIgnoreReturnValue
    private Upcoming injectUpcoming(Upcoming instance37) {
      Upcoming_MembersInjector.injectDbHelper(instance37, providesSqlite$app_debugProvider.get());
      Upcoming_MembersInjector.injectSessionManager(instance37, providesSessionManagerProvider.get());
      Upcoming_MembersInjector.injectCommonMethods(instance37, providesCommonMethodsProvider.get());
      Upcoming_MembersInjector.injectApiService(instance37, providesApiServiceProvider.get());
      Upcoming_MembersInjector.injectCustomDialog(instance37, providesCustomDialogProvider.get());
      Upcoming_MembersInjector.injectGson(instance37, providesGsonProvider.get());
      return instance37;
    }

    @CanIgnoreReturnValue
    private Receipt injectReceipt(Receipt instance38) {
      Receipt_MembersInjector.injectSessionManager(instance38, providesSessionManagerProvider.get());
      return instance38;
    }

    @CanIgnoreReturnValue
    private RunTimePermission injectRunTimePermission(RunTimePermission instance39) {
      RunTimePermission_MembersInjector.injectContext(instance39, providesContextProvider.get());
      RunTimePermission_MembersInjector.injectPermissionList(instance39, providesStringArrayListProvider.get());
      return instance39;
    }

    @CanIgnoreReturnValue
    private SessionManager injectSessionManager(SessionManager instance40) {
      SessionManager_MembersInjector.injectSharedPreferences(instance40, providesSharedPreferencesProvider.get());
      return instance40;
    }

    @CanIgnoreReturnValue
    private CommonMethods injectCommonMethods(CommonMethods instance41) {
      CommonMethods_MembersInjector.injectSessionManager(instance41, providesSessionManagerProvider.get());
      return instance41;
    }

    @CanIgnoreReturnValue
    private RequestCallback injectRequestCallback(RequestCallback instance42) {
      RequestCallback_MembersInjector.injectJsonResp(instance42, providesJsonResponseProvider.get());
      RequestCallback_MembersInjector.injectContext(instance42, providesContextProvider.get());
      RequestCallback_MembersInjector.injectSessionManager(instance42, providesSessionManagerProvider.get());
      RequestCallback_MembersInjector.injectApiService(instance42, providesApiServiceProvider.get());
      RequestCallback_MembersInjector.injectCommonMethods(instance42, providesCommonMethodsProvider.get());
      return instance42;
    }

    @CanIgnoreReturnValue
    private UpcomingAdapter injectUpcomingAdapter(UpcomingAdapter instance43) {
      UpcomingAdapter_MembersInjector.injectSessionManager(instance43, providesSessionManagerProvider.get());
      UpcomingAdapter_MembersInjector.injectCommonMethods(instance43, providesCommonMethodsProvider.get());
      UpcomingAdapter_MembersInjector.injectApiService(instance43, providesApiServiceProvider.get());
      UpcomingAdapter_MembersInjector.injectCustomDialog(instance43, providesCustomDialogProvider.get());
      UpcomingAdapter_MembersInjector.injectGson(instance43, providesGsonProvider.get());
      return instance43;
    }

    @CanIgnoreReturnValue
    private PromoAmountAdapter injectPromoAmountAdapter(PromoAmountAdapter instance44) {
      PromoAmountAdapter_MembersInjector.injectSessionManager(instance44, providesSessionManagerProvider.get());
      return instance44;
    }

    @CanIgnoreReturnValue
    private CarDetailsListAdapter injectCarDetailsListAdapter(CarDetailsListAdapter instance45) {
      CarDetailsListAdapter_MembersInjector.injectSessionManager(instance45, providesSessionManagerProvider.get());
      return instance45;
    }

    @CanIgnoreReturnValue
    private MyFirebaseMessagingService injectMyFirebaseMessagingService(
        MyFirebaseMessagingService instance46) {
      MyFirebaseMessagingService_MembersInjector.injectCommonMethods(instance46, providesCommonMethodsProvider.get());
      MyFirebaseMessagingService_MembersInjector.injectSessionManager(instance46, providesSessionManagerProvider.get());
      return instance46;
    }

    @CanIgnoreReturnValue
    private MyFirebaseInstanceIDService injectMyFirebaseInstanceIDService(
        MyFirebaseInstanceIDService instance47) {
      MyFirebaseInstanceIDService_MembersInjector.injectSessionManager(instance47, providesSessionManagerProvider.get());
      MyFirebaseInstanceIDService_MembersInjector.injectApiService(instance47, providesApiServiceProvider.get());
      MyFirebaseInstanceIDService_MembersInjector.injectGson(instance47, providesGsonProvider.get());
      MyFirebaseInstanceIDService_MembersInjector.injectCommonMethods(instance47, providesCommonMethodsProvider.get());
      return instance47;
    }

    @CanIgnoreReturnValue
    private FirebaseChatHandler injectFirebaseChatHandler(FirebaseChatHandler instance48) {
      FirebaseChatHandler_MembersInjector.injectSessionManager(instance48, providesSessionManagerProvider.get());
      return instance48;
    }

    @CanIgnoreReturnValue
    private AdapterFirebaseRecylcerview injectAdapterFirebaseRecylcerview(
        AdapterFirebaseRecylcerview instance49) {
      AdapterFirebaseRecylcerview_MembersInjector.injectSessionManager(instance49, providesSessionManagerProvider.get());
      return instance49;
    }

    @CanIgnoreReturnValue
    private ImageCompressAsyncTask injectImageCompressAsyncTask(ImageCompressAsyncTask instance50) {
      ImageCompressAsyncTask_MembersInjector.injectSessionManager(instance50, providesSessionManagerProvider.get());
      return instance50;
    }

    @CanIgnoreReturnValue
    private DownloadTask injectDownloadTask(DownloadTask instance51) {
      DownloadTask_MembersInjector.injectCommonMethods(instance51, providesCommonMethodsProvider.get());
      return instance51;
    }

    @CanIgnoreReturnValue
    private AddFirebaseDatabase injectAddFirebaseDatabase(AddFirebaseDatabase instance52) {
      AddFirebaseDatabase_MembersInjector.injectSessionManager(instance52, providesSessionManagerProvider.get());
      AddFirebaseDatabase_MembersInjector.injectCommonMethods(instance52, providesCommonMethodsProvider.get());
      return instance52;
    }

    @CanIgnoreReturnValue
    private PriceRecycleAdapter injectPriceRecycleAdapter(PriceRecycleAdapter instance53) {
      PriceRecycleAdapter_MembersInjector.injectCommonMethods(instance53, providesCommonMethodsProvider.get());
      return instance53;
    }

    @CanIgnoreReturnValue
    private PastTripsPaginationAdapter injectPastTripsPaginationAdapter(
        PastTripsPaginationAdapter instance54) {
      PastTripsPaginationAdapter_MembersInjector.injectSessionManager(instance54, providesSessionManagerProvider.get());
      return instance54;
    }

    @CanIgnoreReturnValue
    private UpcomingTripsPaginationAdapter injectUpcomingTripsPaginationAdapter(
        UpcomingTripsPaginationAdapter instance55) {
      UpcomingTripsPaginationAdapter_MembersInjector.injectSessionManager(instance55, providesSessionManagerProvider.get());
      UpcomingTripsPaginationAdapter_MembersInjector.injectCommonMethods(instance55, providesCommonMethodsProvider.get());
      UpcomingTripsPaginationAdapter_MembersInjector.injectApiService(instance55, providesApiServiceProvider.get());
      UpcomingTripsPaginationAdapter_MembersInjector.injectCustomDialog(instance55, providesCustomDialogProvider.get());
      UpcomingTripsPaginationAdapter_MembersInjector.injectGson(instance55, providesGsonProvider.get());
      return instance55;
    }

    @CanIgnoreReturnValue
    private AddCardActivity injectAddCardActivity(AddCardActivity instance56) {
      CommonActivity_MembersInjector.injectLocal(instance56, providesSessionManagerProvider.get());
      AddCardActivity_MembersInjector.injectApiService(instance56, providesApiServiceProvider.get());
      AddCardActivity_MembersInjector.injectCommonMethods(instance56, providesCommonMethodsProvider.get());
      AddCardActivity_MembersInjector.injectCustomDialog(instance56, providesCustomDialogProvider.get());
      AddCardActivity_MembersInjector.injectSessionManager(instance56, providesSessionManagerProvider.get());
      return instance56;
    }

    @CanIgnoreReturnValue
    private PaymentMethodAdapter injectPaymentMethodAdapter(PaymentMethodAdapter instance57) {
      PaymentMethodAdapter_MembersInjector.injectSessionManager(instance57, providesSessionManagerProvider.get());
      return instance57;
    }

    @CanIgnoreReturnValue
    private SupportActivityCommon injectSupportActivityCommon(SupportActivityCommon instance58) {
      CommonActivity_MembersInjector.injectLocal(instance58, providesSessionManagerProvider.get());
      SupportActivityCommon_MembersInjector.injectCommonMethods(instance58, providesCommonMethodsProvider.get());
      return instance58;
    }

    @CanIgnoreReturnValue
    private SupportAdapter injectSupportAdapter(SupportAdapter instance59) {
      SupportAdapter_MembersInjector.injectSessionManager(instance59, providesSessionManagerProvider.get());
      SupportAdapter_MembersInjector.injectCommonMethods(instance59, providesCommonMethodsProvider.get());
      return instance59;
    }

    @CanIgnoreReturnValue
    private BannerActivityCommon injectBannerActivityCommon(BannerActivityCommon instance60) {
      CommonActivity_MembersInjector.injectLocal(instance60, providesSessionManagerProvider.get());
      BannerActivityCommon_MembersInjector.injectCommonMethods(instance60, providesCommonMethodsProvider.get());
      return instance60;
    }

    @CanIgnoreReturnValue
    private BannerAdapter injectBannerAdapter(BannerAdapter instance61) {
      BannerAdapter_MembersInjector.injectSessionManager(instance61, providesSessionManagerProvider.get());
      BannerAdapter_MembersInjector.injectCommonMethods(instance61, providesCommonMethodsProvider.get());
      return instance61;
    }

    @CanIgnoreReturnValue
    private PaymentWebViewActivity injectPaymentWebViewActivity(PaymentWebViewActivity instance62) {
      CommonActivity_MembersInjector.injectLocal(instance62, providesSessionManagerProvider.get());
      PaymentWebViewActivity_MembersInjector.injectSessionManager(instance62, providesSessionManagerProvider.get());
      PaymentWebViewActivity_MembersInjector.injectCommonMethods(instance62, providesCommonMethodsProvider.get());
      PaymentWebViewActivity_MembersInjector.injectCustomDialog(instance62, providesCustomDialogProvider.get());
      return instance62;
    }

    @CanIgnoreReturnValue
    private PaytmPaymentWebViewActivity injectPaytmPaymentWebViewActivity(
        PaytmPaymentWebViewActivity instance63) {
      CommonActivity_MembersInjector.injectLocal(instance63, providesSessionManagerProvider.get());
      PaytmPaymentWebViewActivity_MembersInjector.injectSessionManager(instance63, providesSessionManagerProvider.get());
      PaytmPaymentWebViewActivity_MembersInjector.injectCommonMethods(instance63, providesCommonMethodsProvider.get());
      PaytmPaymentWebViewActivity_MembersInjector.injectCustomDialog(instance63, providesCustomDialogProvider.get());
      return instance63;
    }

    @CanIgnoreReturnValue
    private MpesaPaymentWebViewActivity injectMpesaPaymentWebViewActivity(
        MpesaPaymentWebViewActivity instance64) {
      CommonActivity_MembersInjector.injectLocal(instance64, providesSessionManagerProvider.get());
      MpesaPaymentWebViewActivity_MembersInjector.injectSessionManager(instance64, providesSessionManagerProvider.get());
      MpesaPaymentWebViewActivity_MembersInjector.injectCommonMethods(instance64, providesCommonMethodsProvider.get());
      MpesaPaymentWebViewActivity_MembersInjector.injectCustomDialog(instance64, providesCustomDialogProvider.get());
      return instance64;
    }

    @CanIgnoreReturnValue
    private FlutterwaveWebViewActivity injectFlutterwaveWebViewActivity(
        FlutterwaveWebViewActivity instance65) {
      CommonActivity_MembersInjector.injectLocal(instance65, providesSessionManagerProvider.get());
      FlutterwaveWebViewActivity_MembersInjector.injectSessionManager(instance65, providesSessionManagerProvider.get());
      FlutterwaveWebViewActivity_MembersInjector.injectCommonMethods(instance65, providesCommonMethodsProvider.get());
      FlutterwaveWebViewActivity_MembersInjector.injectCustomDialog(instance65, providesCustomDialogProvider.get());
      return instance65;
    }

    @CanIgnoreReturnValue
    private RazorpayWebViewActivity injectRazorpayWebViewActivity(
        RazorpayWebViewActivity instance66) {
      CommonActivity_MembersInjector.injectLocal(instance66, providesSessionManagerProvider.get());
      RazorpayWebViewActivity_MembersInjector.injectSessionManager(instance66, providesSessionManagerProvider.get());
      RazorpayWebViewActivity_MembersInjector.injectCommonMethods(instance66, providesCommonMethodsProvider.get());
      RazorpayWebViewActivity_MembersInjector.injectCustomDialog(instance66, providesCustomDialogProvider.get());
      return instance66;
    }

    @CanIgnoreReturnValue
    private PaystackWebViewActivity injectPaystackWebViewActivity(
        PaystackWebViewActivity instance67) {
      CommonActivity_MembersInjector.injectLocal(instance67, providesSessionManagerProvider.get());
      PaystackWebViewActivity_MembersInjector.injectSessionManager(instance67, providesSessionManagerProvider.get());
      PaystackWebViewActivity_MembersInjector.injectCommonMethods(instance67, providesCommonMethodsProvider.get());
      PaystackWebViewActivity_MembersInjector.injectCustomDialog(instance67, providesCustomDialogProvider.get());
      return instance67;
    }

    @CanIgnoreReturnValue
    private MollieWebViewActivity injectMollieWebViewActivity(MollieWebViewActivity instance68) {
      CommonActivity_MembersInjector.injectLocal(instance68, providesSessionManagerProvider.get());
      MollieWebViewActivity_MembersInjector.injectSessionManager(instance68, providesSessionManagerProvider.get());
      MollieWebViewActivity_MembersInjector.injectCommonMethods(instance68, providesCommonMethodsProvider.get());
      MollieWebViewActivity_MembersInjector.injectCustomDialog(instance68, providesCustomDialogProvider.get());
      return instance68;
    }

    @CanIgnoreReturnValue
    private CommonActivity injectCommonActivity(CommonActivity instance69) {
      CommonActivity_MembersInjector.injectLocal(instance69, providesSessionManagerProvider.get());
      return instance69;
    }

    @CanIgnoreReturnValue
    private UserChoice injectUserChoice(UserChoice instance70) {
      UserChoice_MembersInjector.injectSessionManager(instance70, providesSessionManagerProvider.get());
      UserChoice_MembersInjector.injectCommonMethods(instance70, providesCommonMethodsProvider.get());
      return instance70;
    }
  }
}
