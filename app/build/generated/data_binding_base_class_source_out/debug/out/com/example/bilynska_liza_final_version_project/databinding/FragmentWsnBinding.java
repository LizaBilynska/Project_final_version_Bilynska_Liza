// Generated by view binder compiler. Do not edit!
package com.example.bilynska_liza_final_version_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bilynska_liza_final_version_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWsnBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView newsPageFragment;

  @NonNull
  public final RecyclerView rvCategoryList;

  @NonNull
  public final SwipeRefreshLayout swipe;

  private FragmentWsnBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView newsPageFragment, @NonNull RecyclerView rvCategoryList,
      @NonNull SwipeRefreshLayout swipe) {
    this.rootView = rootView;
    this.newsPageFragment = newsPageFragment;
    this.rvCategoryList = rvCategoryList;
    this.swipe = swipe;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWsnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWsnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_wsn, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWsnBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.newsPageFragment;
      RecyclerView newsPageFragment = ViewBindings.findChildViewById(rootView, id);
      if (newsPageFragment == null) {
        break missingId;
      }

      id = R.id.rv_categoryList;
      RecyclerView rvCategoryList = ViewBindings.findChildViewById(rootView, id);
      if (rvCategoryList == null) {
        break missingId;
      }

      id = R.id.swipe;
      SwipeRefreshLayout swipe = ViewBindings.findChildViewById(rootView, id);
      if (swipe == null) {
        break missingId;
      }

      return new FragmentWsnBinding((ConstraintLayout) rootView, newsPageFragment, rvCategoryList,
          swipe);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
