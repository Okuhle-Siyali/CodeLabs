package com.example.android.trackmysleepquality.sleepdetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SleepDetailFragmentDirections {
  @NonNull
  public static ActionSleepDetailFragmentToSleepTrackerFragment actionSleepDetailFragmentToSleepTrackerFragment() {
    return new ActionSleepDetailFragmentToSleepTrackerFragment();
  }

  public static class ActionSleepDetailFragmentToSleepTrackerFragment implements NavDirections {
    public ActionSleepDetailFragmentToSleepTrackerFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.example.android.trackmysleepquality.R.id.action_sleepDetailFragment_to_sleep_tracker_fragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSleepDetailFragmentToSleepTrackerFragment that = (ActionSleepDetailFragmentToSleepTrackerFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSleepDetailFragmentToSleepTrackerFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
