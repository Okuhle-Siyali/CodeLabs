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
import com.example.android.trackmysleepquality.sleepdetail.SleepDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSleepDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView qualityImage;

  @NonNull
  public final TextView qualityString;

  @NonNull
  public final TextView sleepLength;

  @Bindable
  protected SleepDetailViewModel mSleepDetailViewModel;

  protected FragmentSleepDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView qualityImage, TextView qualityString, TextView sleepLength) {
    super(_bindingComponent, _root, _localFieldCount);
    this.qualityImage = qualityImage;
    this.qualityString = qualityString;
    this.sleepLength = sleepLength;
  }

  public abstract void setSleepDetailViewModel(@Nullable SleepDetailViewModel sleepDetailViewModel);

  @Nullable
  public SleepDetailViewModel getSleepDetailViewModel() {
    return mSleepDetailViewModel;
  }

  @NonNull
  public static FragmentSleepDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSleepDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSleepDetailBinding>inflateInternal(inflater, com.example.android.trackmysleepquality.R.layout.fragment_sleep_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSleepDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSleepDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSleepDetailBinding>inflateInternal(inflater, com.example.android.trackmysleepquality.R.layout.fragment_sleep_detail, null, false, component);
  }

  public static FragmentSleepDetailBinding bind(@NonNull View view) {
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
  public static FragmentSleepDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSleepDetailBinding)bind(component, view, com.example.android.trackmysleepquality.R.layout.fragment_sleep_detail);
  }
}
