package com.example.android.trackmysleepquality.databinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemSleepNightBindingImpl extends ListItemSleepNightBinding implements com.example.android.trackmysleepquality.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemSleepNightBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListItemSleepNightBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.qualityImage.setTag(null);
        this.qualityString.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 1);
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
        if (BR.sleep == variableId) {
            setSleep((com.example.android.trackmysleepquality.database.SleepNight) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.example.android.trackmysleepquality.sleeptracker.SleepNightListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSleep(@Nullable com.example.android.trackmysleepquality.database.SleepNight Sleep) {
        this.mSleep = Sleep;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sleep);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.example.android.trackmysleepquality.sleeptracker.SleepNightListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.android.trackmysleepquality.database.SleepNight sleep = mSleep;
        com.example.android.trackmysleepquality.sleeptracker.SleepNightListener clickListener = mClickListener;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.android.trackmysleepquality.sleeptracker.BindingUtilsKt.setSleepImage(this.qualityImage, sleep);
            com.example.android.trackmysleepquality.sleeptracker.BindingUtilsKt.setSleepQualityString(this.qualityString, sleep);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // sleep
        com.example.android.trackmysleepquality.database.SleepNight sleep = mSleep;
        // clickListener
        com.example.android.trackmysleepquality.sleeptracker.SleepNightListener clickListener = mClickListener;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(sleep);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sleep
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}