package com.example.android.trackmysleepquality.sleepdetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SleepDetailFragmentArgs {
  private long sleepNightKey;

  private SleepDetailFragmentArgs() {
  }

  @NonNull
  public static SleepDetailFragmentArgs fromBundle(Bundle bundle) {
    SleepDetailFragmentArgs result = new SleepDetailFragmentArgs();
    bundle.setClassLoader(SleepDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("sleepNightKey")) {
      result.sleepNightKey = bundle.getLong("sleepNightKey");
    } else {
      throw new IllegalArgumentException("Required argument \"sleepNightKey\" is missing and does not have an android:defaultValue");
    }
    return result;
  }

  public long getSleepNightKey() {
    return sleepNightKey;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putLong("sleepNightKey", this.sleepNightKey);
    return __outBundle;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SleepDetailFragmentArgs that = (SleepDetailFragmentArgs) object;
    if (sleepNightKey != that.sleepNightKey) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (int)(sleepNightKey ^ (sleepNightKey >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "SleepDetailFragmentArgs{"
        + "sleepNightKey=" + sleepNightKey
        + "}";
  }

  public static class Builder {
    private long sleepNightKey;

    public Builder(SleepDetailFragmentArgs original) {
      this.sleepNightKey = original.sleepNightKey;
    }

    public Builder(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
    }

    @NonNull
    public SleepDetailFragmentArgs build() {
      SleepDetailFragmentArgs result = new SleepDetailFragmentArgs();
      result.sleepNightKey = this.sleepNightKey;
      return result;
    }

    @NonNull
    public Builder setSleepNightKey(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
      return this;
    }

    public long getSleepNightKey() {
      return sleepNightKey;
    }
  }
}
