package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

/**
 * * ViewModel for SleepTrackerFragment.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010,\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020-J\u0006\u00100\u001a\u00020-J\u0013\u00101\u001a\u0004\u0018\u00010\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\b\u00102\u001a\u00020-H\u0002J\u0019\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0006\u00106\u001a\u00020-J\b\u00107\u001a\u00020-H\u0014J\u0006\u00108\u001a\u00020-J\u000e\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020\tJ\u0006\u0010;\u001a\u00020-J\u0006\u0010<\u001a\u00020-J\u0019\u0010=\u001a\u00020-2\u0006\u00104\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r \u0010*\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R5\u0010\u001e\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001f0\u001f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0019\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0012R5\u0010#\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R5\u0010%\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012R\u0016\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepTrackerViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;Landroid/app/Application;)V", "_navigateToSleepDetail", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToSleepQuality", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "_showSnackbarEvent", "", "clearButtonVisible", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getClearButtonVisible", "()Landroidx/lifecycle/LiveData;", "database", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepDetail", "getNavigateToSleepDetail", "()Landroidx/lifecycle/MutableLiveData;", "navigateToSleepQuality", "getNavigateToSleepQuality", "nights", "", "getNights", "nightsString", "Landroid/text/Spanned;", "getNightsString", "showSnackBarEvent", "getShowSnackBarEvent", "startButtonVisible", "getStartButtonVisible", "stopButtonVisible", "getStopButtonVisible", "tonight", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneNavigating", "doneShowingSnackbar", "getTonightFromDatabase", "initializeTonight", "insert", "night", "(Lcom/example/android/trackmysleepquality/database/SleepNight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClear", "onCleared", "onSleepDetailNavigated", "onSleepNightClicked", "id", "onStart", "onStop", "update", "app_debug"})
public final class SleepTrackerViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * * Hold a reference to SleepDatabase via SleepDatabaseDao.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    
    /**
     * * viewModelJob allows us to cancel all coroutines started by this ViewModel.
     */
    private kotlinx.coroutines.Job viewModelJob;
    
    /**
     * * A [CoroutineScope] keeps track of all coroutines started by this ViewModel.
     *     *
     *     * Because we pass it [viewModelJob], any coroutine started in this uiScope can be cancelled
     *     * by calling `viewModelJob.cancel()`
     *     *
     *     * By default, all coroutines started in uiScope will launch in [Dispatchers.Main] which is
     *     * the main thread on Android. This is a sensible default because most coroutines started by
     *     * a [ViewModel] update the UI after performing some processing.
     */
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> tonight;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> nights = null;
    
    /**
     * * Converted nights to Spanned for displaying.
     */
    private final androidx.lifecycle.LiveData<android.text.Spanned> nightsString = null;
    
    /**
     * * If tonight has not been set, then the START button should be visible.
     */
    private final androidx.lifecycle.LiveData<java.lang.Boolean> startButtonVisible = null;
    
    /**
     * * If tonight has been set, then the STOP button should be visible.
     */
    private final androidx.lifecycle.LiveData<java.lang.Boolean> stopButtonVisible = null;
    
    /**
     * * If there are any nights in the database, show the CLEAR button.
     */
    private final androidx.lifecycle.LiveData<java.lang.Boolean> clearButtonVisible = null;
    
    /**
     * * Request a toast by setting this value to true.
     *     *
     *     * This is private because we don't want to expose setting this value to the Fragment.
     */
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showSnackbarEvent;
    
    /**
     * * Variable that tells the Fragment to navigate to a specific [SleepQualityFragment]
     *     *
     *     * This is private because we don't want to expose setting this value to the Fragment.
     */
    private final androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> _navigateToSleepQuality = null;
    
    /**
     * * Navigation for the SleepDetails fragment.
     */
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _navigateToSleepDetail = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> getNights() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<android.text.Spanned> getNightsString() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStartButtonVisible() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStopButtonVisible() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getClearButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowSnackBarEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> getNavigateToSleepQuality() {
        return null;
    }
    
    /**
     * * Call this immediately after calling `show()` on a toast.
     *     *
     *     * It will clear the toast request, so if the user rotates their phone it won't show a duplicate
     *     * toast.
     */
    public final void doneShowingSnackbar() {
    }
    
    /**
     * * Call this immediately after navigating to [SleepQualityFragment]
     *     *
     *     * It will clear the navigation request, so if the user rotates their phone it won't navigate
     *     * twice.
     */
    public final void doneNavigating() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getNavigateToSleepDetail() {
        return null;
    }
    
    public final void onSleepNightClicked(long id) {
    }
    
    public final void onSleepDetailNavigated() {
    }
    
    private final void initializeTonight() {
    }
    
    /**
     * * Executes when the START button is clicked.
     */
    public final void onStart() {
    }
    
    /**
     * * Executes when the STOP button is clicked.
     */
    public final void onStop() {
    }
    
    /**
     * * Executes when the CLEAR button is clicked.
     */
    public final void onClear() {
    }
    
    /**
     * * Called when the ViewModel is dismantled.
     *     * At this point, we want to cancel all coroutines;
     *     * otherwise we end up with processes that have nowhere to return to
     *     * using memory and resources.
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SleepTrackerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao dataSource, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}