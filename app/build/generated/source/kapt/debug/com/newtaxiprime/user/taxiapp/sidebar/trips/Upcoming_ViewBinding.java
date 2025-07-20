// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.sidebar.trips;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class Upcoming_ViewBinding implements Unbinder {
  private Upcoming target;

  @UiThread
  public Upcoming_ViewBinding(Upcoming target, View source) {
    this.target = target;

    target.rcView = Utils.findRequiredViewAsType(source, R.id.rcView, "field 'rcView'", RecyclerView.class);
    target.listempty = Utils.findRequiredViewAsType(source, R.id.listempty, "field 'listempty'", TextView.class);
    target.swipeToRefresh = Utils.findRequiredViewAsType(source, R.id.swipeToRefresh, "field 'swipeToRefresh'", SwipeRefreshLayout.class);
  }

  @Override
  public void unbind() {
    Upcoming target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rcView = null;
    target.listempty = null;
    target.swipeToRefresh = null;
  }
}
