package com.newtaxiprime.user;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.newtaxiprime.user.databinding.ActivityPermissionOverViewBindingImpl;
import com.newtaxiprime.user.databinding.ItemPermissionListBindingImpl;
import com.newtaxiprime.user.databinding.UpdateFiltersBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPERMISSIONOVERVIEW = 1;

  private static final int LAYOUT_ITEMPERMISSIONLIST = 2;

  private static final int LAYOUT_UPDATEFILTERS = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.newtaxiprime.user.R.layout.activity_permission_over_view, LAYOUT_ACTIVITYPERMISSIONOVERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.newtaxiprime.user.R.layout.item_permission_list, LAYOUT_ITEMPERMISSIONLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.newtaxiprime.user.R.layout.update_filters, LAYOUT_UPDATEFILTERS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPERMISSIONOVERVIEW: {
          if ("layout/activity_permission_over_view_0".equals(tag)) {
            return new ActivityPermissionOverViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_permission_over_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPERMISSIONLIST: {
          if ("layout/item_permission_list_0".equals(tag)) {
            return new ItemPermissionListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_permission_list is invalid. Received: " + tag);
        }
        case  LAYOUT_UPDATEFILTERS: {
          if ("layout/update_filters_0".equals(tag)) {
            return new UpdateFiltersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for update_filters is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "features");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_permission_over_view_0", com.newtaxiprime.user.R.layout.activity_permission_over_view);
      sKeys.put("layout/item_permission_list_0", com.newtaxiprime.user.R.layout.item_permission_list);
      sKeys.put("layout/update_filters_0", com.newtaxiprime.user.R.layout.update_filters);
    }
  }
}
