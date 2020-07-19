package com.example.android.trackmysleepquality.databinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSleepDetailBindingImpl extends FragmentSleepDetailBinding implements com.example.android.trackmysleepquality.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSleepDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSleepDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.qualityImage.setTag(null);
        this.qualityString.setTag(null);
        this.sleepLength.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sleepDetailViewModel == variableId) {
            setSleepDetailViewModel((com.example.android.trackmysleepquality.sleepdetail.SleepDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSleepDetailViewModel(@Nullable com.example.android.trackmysleepquality.sleepdetail.SleepDetailViewModel SleepDetailViewModel) {
        this.mSleepDetailViewModel = SleepDetailViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sleepDetailViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSleepDetailViewModelNight((androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSleepDetailViewModelNight(androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> SleepDetailViewModelNight, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.android.trackmysleepquality.database.SleepNight sleepDetailViewModelNightGetValue = null;
        com.example.android.trackmysleepquality.sleepdetail.SleepDetailViewModel sleepDetailViewModel = mSleepDetailViewModel;
        androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> sleepDetailViewModelNight = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (sleepDetailViewModel != null) {
                    // read sleepDetailViewModel.night
                    sleepDetailViewModelNight = sleepDetailViewModel.getNight();
                }
                updateLiveDataRegistration(0, sleepDetailViewModelNight);


                if (sleepDetailViewModelNight != null) {
                    // read sleepDetailViewModel.night.getValue()
                    sleepDetailViewModelNightGetValue = sleepDetailViewModelNight.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.android.trackmysleepquality.sleeptracker.BindingUtilsKt.setSleepImage(this.qualityImage, sleepDetailViewModelNightGetValue);
            com.example.android.trackmysleepquality.sleeptracker.BindingUtilsKt.setSleepQualityString(this.qualityString, sleepDetailViewModelNightGetValue);
            com.example.android.trackmysleepquality.sleeptracker.BindingUtilsKt.setSleepDurationFormatted(this.sleepLength, sleepDetailViewModelNightGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // sleepDetailViewModel != null
        boolean sleepDetailViewModelJavaLangObjectNull = false;
        // sleepDetailViewModel
        com.example.android.trackmysleepquality.sleepdetail.SleepDetailViewModel sleepDetailViewModel = mSleepDetailViewModel;



        sleepDetailViewModelJavaLangObjectNull = (sleepDetailViewModel) != (null);
        if (sleepDetailViewModelJavaLangObjectNull) {


            sleepDetailViewModel.onClose();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sleepDetailViewModel.night
        flag 1 (0x2L): sleepDetailViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}