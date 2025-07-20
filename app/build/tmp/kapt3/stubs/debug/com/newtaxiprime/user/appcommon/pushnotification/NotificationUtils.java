package com.newtaxiprime.user.appcommon.pushnotification;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\u000fJB\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J>\u0010!\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020&H\u0007J:\u0010\'\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020\u000fH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/newtaxiprime/user/appcommon/pushnotification/NotificationUtils;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "defaultSoundUri", "Landroid/net/Uri;", "getDefaultSoundUri", "()Landroid/net/Uri;", "setDefaultSoundUri", "(Landroid/net/Uri;)V", "notificationChannelID", "", "notificationChannelName", "generateFirebaseChatNotification", "", "context", "message", "generateNotification", "title", "getBitmapFromURL", "Landroid/graphics/Bitmap;", "strURL", "playNotificationSound", "showBigNotification", "bitmap", "mBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "icon", "", "timeStamp", "resultPendingIntent", "Landroid/app/PendingIntent;", "showNotificationMessage", "intent", "Landroid/content/Intent;", "imageUrl", "l", "", "showSmallNotification", "soundNotification", "Companion", "app_debug"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class NotificationUtils {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private android.net.Uri defaultSoundUri;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String notificationChannelName = "Chat";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String notificationChannelID = "125001";
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.pushnotification.NotificationUtils.Companion Companion = null;
    
    public NotificationUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getDefaultSoundUri() {
        return null;
    }
    
    public final void setDefaultSoundUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, long l) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, long l) {
    }
    
    private final void showSmallNotification(androidx.core.app.NotificationCompat.Builder mBuilder, int icon, java.lang.String title, java.lang.String message, java.lang.String timeStamp, android.app.PendingIntent resultPendingIntent) {
    }
    
    private final void showBigNotification(android.graphics.Bitmap bitmap, androidx.core.app.NotificationCompat.Builder mBuilder, int icon, java.lang.String title, java.lang.String message, java.lang.String timeStamp, android.app.PendingIntent resultPendingIntent) {
    }
    
    /**
     * Downloading push notification image before displaying it in
     * the notification tray
     */
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getBitmapFromURL(@org.jetbrains.annotations.NotNull()
    java.lang.String strURL) {
        return null;
    }
    
    public final void playNotificationSound() {
    }
    
    private final void soundNotification() {
    }
    
    public final void generateNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void generateFirebaseChatNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/newtaxiprime/user/appcommon/pushnotification/NotificationUtils$Companion;", "", "()V", "clearNotifications", "", "context", "Landroid/content/Context;", "getTimeMilliSec", "", "timeStamp", "", "isAppIsInBackground", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Method checks if the app is in background or not
         */
        @android.annotation.SuppressLint(value = {"NewApi"})
        public final boolean isAppIsInBackground(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        public final void clearNotifications(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final long getTimeMilliSec(@org.jetbrains.annotations.NotNull()
        java.lang.String timeStamp) {
            return 0L;
        }
    }
}