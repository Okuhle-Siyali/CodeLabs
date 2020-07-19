package com.example.android.trackmysleepquality.sleepquality;

import java.lang.System;

/**
 * * ViewModel for SleepQualityFragment.
 * *
 * * @param sleepNightKey The key of the current night we are working on.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/trackmysleepquality/sleepquality/SleepQualityViewModel;", "Landroidx/lifecycle/ViewModel;", "sleepNightKey", "", "database", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "(JLcom/example/android/trackmysleepquality/database/SleepDatabaseDao;)V", "_navigateToSleepTracker", "Landroidx/lifecycle/MutableLiveData;", "", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepTracker", "Landroidx/lifecycle/LiveData;", "getNavigateToSleepTracker", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "doneNavigating", "", "onCleared", "onSetSleepQuality", "quality", "", "app_debug"})
public final class SleepQualityViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * * viewModelJob allows us to cancel all coroutines started by this ViewModel.
     */
    private final kotlinx.coroutines.Job viewModelJob = null;
    
    /**
     * * A [CoroutineScope] keeps track of all coroutines started by this ViewModel.
     *     *
     *     * Because we pass it [viewModelJob], any coroutine started in this scope can be cancelled
     *     * by calling `viewModelJob.cancel()`
     *     *
     *     * By default, all coroutines started in uiScope will launch in [Dispatchers.Main] which is
     *     * the main thread on Android. This is a sensible default because most coroutines started by
     *     * a [ViewModel] update the UI after performing some processing.
     */
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    
    /**
     * * Variable that tells the fragment whether it should navigate to [SleepTrackerFragment].
     *     *
     *     * This is `private` because we don't want to expose the ability to set [MutableLiveData] to
     *     * the [Fragment]
     */
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToSleepTracker = null;
    private final long sleepNightKey = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToSleepTracker() {
        return null;
    }
    
    /**
     * * Cancels all coroutines when the ViewModel is cleared, to cleanup any pending work.
     *     *
     *     * onCleared() gets called when the ViewModel is destroyed.
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * * Call this immediately after navigating to [SleepTrackerFragment]
     */
    public final void doneNavigating() {
    }
    
    /**
     * * Sets the sleep quality and updates the database.
     *     *
     *     * Then navigates back to the SleepTrackerFragment.
     */
    public final void onSetSleepQuality(int quality) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    public SleepQualityViewModel(long sleepNightKey, @org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao database) {
        super();
    }
}