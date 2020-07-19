package com.example.android.trackmysleepquality.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.trackmysleepquality.database.SleepNight;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemSleepNightLinearBinding extends ViewDataBinding {
  @NonNull
  public final ImageView qualityImage;

  @NonNull
  public final TextView qualityString;

  @NonNull
  public final TextView sleepLength;

  @Bindable
  protected SleepNight mSleep;

  protected ListItemSleepNightLinearBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView qualityImage, TextView qualityString, TextView sleepLength) {
    super(_bindingComponent, _root, _localFieldCount);
    this.qualityImage = qualityImage;
    this.qualityString = qualityString;
    this.sleepLength = sleepLength;
  }

  public abstract void setSleep(@Nullable SleepNight sleep);

  @Nullable
  public SleepNight getSleep() {
    return mSleep;
  }

  @NonNull
  public static ListItemSleepNightLinearBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_sleep_night_linear, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemSleepNightLinearBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemSleepNightLinearBinding>inflateInternal(inflater, com.example.android.trackmysleepquality.R.layout.list_item_sleep_night_linear, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemSleepNightLinearBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_sleep_night_linear, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemSleepNightLinearBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemSleepNightLinearBinding>inflateInternal(inflater, com.example.android.trackmysleepquality.R.layout.list_item_sleep_night_linear, null, false, component);
  }

  public static ListItemSleepNightLinearBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemSleepNightLinearBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemSleepNightLinearBinding)bind(component, view, com.example.android.trackmysleepquality.R.layout.list_item_sleep_night_linear);
  }
}
