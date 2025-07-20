package com.newtaxiprime.user.appcommon.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/newtaxiprime/user/appcommon/database/SqLiteDb;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDocument", "Landroid/database/Cursor;", "documentID", "", "insertWithUpdate", "", "document", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "Companion", "app_debug"})
public final class SqLiteDb extends android.database.sqlite.SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "UserDetailsDB";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TABLE_TRIPS = "UserTripsInfo";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_DOCUMENT_ID = "User_trip_doc_id";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_DOCUMENT = "User_trip_doc";
    @org.jetbrains.annotations.NotNull()
    public static final com.newtaxiprime.user.appcommon.database.SqLiteDb.Companion Companion = null;
    
    public SqLiteDb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor getDocument(@org.jetbrains.annotations.NotNull()
    java.lang.String documentID) {
        return null;
    }
    
    public final void insertWithUpdate(@org.jetbrains.annotations.Nullable()
    java.lang.String documentID, @org.jetbrains.annotations.Nullable()
    java.lang.String document) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/newtaxiprime/user/appcommon/database/SqLiteDb$Companion;", "", "()V", "DATABASE_NAME", "", "DATABASE_VERSION", "", "KEY_DOCUMENT", "KEY_DOCUMENT_ID", "TABLE_TRIPS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}