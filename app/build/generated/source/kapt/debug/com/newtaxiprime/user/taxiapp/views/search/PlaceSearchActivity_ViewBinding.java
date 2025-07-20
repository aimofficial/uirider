// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.views.search;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class PlaceSearchActivity_ViewBinding implements Unbinder {
  private PlaceSearchActivity target;

  private View view7f0b01f1;

  private View view7f0b00d0;

  private View view7f0b040b;

  private View view7f0b01f2;

  @UiThread
  public PlaceSearchActivity_ViewBinding(PlaceSearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaceSearchActivity_ViewBinding(final PlaceSearchActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.destadddress, "field 'destadddress' and method 'destadddress'");
    target.destadddress = Utils.castView(view, R.id.destadddress, "field 'destadddress'", EditText.class);
    view7f0b01f1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.destadddress();
      }
    });
    target.pickupaddress = Utils.findRequiredViewAsType(source, R.id.pickupaddress, "field 'pickupaddress'", EditText.class);
    target.dest_point = Utils.findRequiredViewAsType(source, R.id.dest_point, "field 'dest_point'", ImageView.class);
    target.pickup_point = Utils.findRequiredViewAsType(source, R.id.pickup_point, "field 'pickup_point'", ImageView.class);
    target.pin_map = Utils.findRequiredViewAsType(source, R.id.pin_map, "field 'pin_map'", ImageView.class);
    target.drop_done = Utils.findRequiredViewAsType(source, R.id.drop_done, "field 'drop_done'", TextView.class);
    target.hometext = Utils.findRequiredViewAsType(source, R.id.hometext, "field 'hometext'", TextView.class);
    target.homeaddress = Utils.findRequiredViewAsType(source, R.id.homeaddress, "field 'homeaddress'", TextView.class);
    target.worktext = Utils.findRequiredViewAsType(source, R.id.worktext, "field 'worktext'", TextView.class);
    target.workaddress = Utils.findRequiredViewAsType(source, R.id.workaddress, "field 'workaddress'", TextView.class);
    target.setlocaion_onmap = Utils.findRequiredViewAsType(source, R.id.setlocation_onmap, "field 'setlocaion_onmap'", LinearLayout.class);
    target.homelayoyt = Utils.findRequiredViewAsType(source, R.id.homelayoyt, "field 'homelayoyt'", LinearLayout.class);
    target.worklayout = Utils.findRequiredViewAsType(source, R.id.worklayout, "field 'worklayout'", LinearLayout.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.location_placesearch, "field 'mRecyclerView'", RecyclerView.class);
    target.address_search = Utils.findRequiredViewAsType(source, R.id.address_search, "field 'address_search'", ScrollView.class);
    target.schedule_date_time = Utils.findRequiredViewAsType(source, R.id.schedule_date_time, "field 'schedule_date_time'", TextView.class);
    target.pbAddressSearchbarLoading = Utils.findRequiredViewAsType(source, R.id.pb_address_searchbar_loading, "field 'pbAddressSearchbarLoading'", ProgressBar.class);
    target.scheduleride_layout = Utils.findRequiredViewAsType(source, R.id.scheduleride_layout, "field 'scheduleride_layout'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.arrow, "method 'arrow'");
    view7f0b00d0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.arrow();
      }
    });
    view = Utils.findRequiredView(source, R.id.pickupclose, "method 'pickupclose'");
    view7f0b040b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.pickupclose();
      }
    });
    view = Utils.findRequiredView(source, R.id.destclose, "method 'destclose'");
    view7f0b01f2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.destclose();
      }
    });
  }

  @Override
  public void unbind() {
    PlaceSearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.destadddress = null;
    target.pickupaddress = null;
    target.dest_point = null;
    target.pickup_point = null;
    target.pin_map = null;
    target.drop_done = null;
    target.hometext = null;
    target.homeaddress = null;
    target.worktext = null;
    target.workaddress = null;
    target.setlocaion_onmap = null;
    target.homelayoyt = null;
    target.worklayout = null;
    target.mRecyclerView = null;
    target.address_search = null;
    target.schedule_date_time = null;
    target.pbAddressSearchbarLoading = null;
    target.scheduleride_layout = null;

    view7f0b01f1.setOnClickListener(null);
    view7f0b01f1 = null;
    view7f0b00d0.setOnClickListener(null);
    view7f0b00d0 = null;
    view7f0b040b.setOnClickListener(null);
    view7f0b040b = null;
    view7f0b01f2.setOnClickListener(null);
    view7f0b01f2 = null;
  }
}
