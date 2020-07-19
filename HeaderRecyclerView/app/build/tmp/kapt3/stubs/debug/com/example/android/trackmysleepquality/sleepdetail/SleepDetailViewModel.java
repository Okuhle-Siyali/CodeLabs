package com.example.android.trackmysleepquality.sleepdetail;

import java.lang.System;

/**
 * * ViewModel for SleepQualityFragment.
 * *
 * * @param sleepNightKey The key of the current night we are working on.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u0006\u0010\u0019\u001a\u00020\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/trackmysleepquality/sleepdetail/SleepDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "sleepNightKey", "", "dataSource", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "(JLcom/example/android/trackmysleepquality/database/SleepDatabaseDao;)V", "_navigateToSleepTracker", "Landroidx/lifecycle/MutableLiveData;", "", "database", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepTracker", "Landroidx/lifecycle/LiveData;", "getNavigateToSleepTracker", "()Landroidx/lifecycle/LiveData;", "night", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "viewModelJob", "Lkotlinx/coroutines/Job;", "doneNavigating", "", "getNight", "onCleared", "onClose", "app_debug"})
public final class SleepDetailViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * * Hold a reference to SleepDatabase via its SleepDatabaseDao.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    
    /**
     * * viewModelJob allows us to cancel all coroutines started by this ViewModel.
     */
    private final kotlinx.coroutines.Job viewModelJob = null;
    private final androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> night = null;
    
    /**
     * * Variable that tells the fragment whether it should navigate to [SleepTrackerFragment].
     *     *
     *     * This is `private` because we don't want to expose the ability to set [MutableLiveData] to
     *     * the [Fragment]
     */
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToSleepTracker = null;
    private final long sleepNightKey = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> getNight() {
        return null;
    }
    
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
    
    public final void onClose() {
    }
    
    public SleepDetailViewModel(long sleepNightKey, @org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao dataSource) {
        super();
    }
}