// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.sidebar.trips;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class Receipt_ViewBinding implements Unbinder {
  private Receipt target;

  @UiThread
  public Receipt_ViewBinding(Receipt target, View source) {
    this.target = target;

    target.basefare_amount = Utils.findRequiredViewAsType(source, R.id.basefare_amount, "field 'basefare_amount'", TextView.class);
    target.distance_fare = Utils.findRequiredViewAsType(source, R.id.distance_fare, "field 'distance_fare'", TextView.class);
    target.time_fare = Utils.findRequiredViewAsType(source, R.id.time_fare, "field 'time_fare'", TextView.class);
    target.fee = Utils.findRequiredViewAsType(source, R.id.fee, "field 'fee'", TextView.class);
    target.totalamount = Utils.findRequiredViewAsType(source, R.id.totalamount, "field 'totalamount'", TextView.class);
    target.walletamount = Utils.findRequiredViewAsType(source, R.id.walletamount, "field 'walletamount'", TextView.class);
    target.promoamount = Utils.findRequiredViewAsType(source, R.id.promoamount, "field 'promoamount'", TextView.class);
    target.payableamount = Utils.findRequiredViewAsType(source, R.id.payableamount, "field 'payableamount'", TextView.class);
    target.walletamountlayout = Utils.findRequiredViewAsType(source, R.id.walletamountlayout, "field 'walletamountlayout'", RelativeLayout.class);
    target.promoamountlayout = Utils.findRequiredViewAsType(source, R.id.promoamountlayout, "field 'promoamountlayout'", RelativeLayout.class);
    target.payableamountlayout = Utils.findRequiredViewAsType(source, R.id.payableamountlayout, "field 'payableamountlayout'", RelativeLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rvPrice, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    Receipt target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.basefare_amount = null;
    target.distance_fare = null;
    target.time_fare = null;
    target.fee = null;
    target.totalamount = null;
    target.walletamount = null;
    target.promoamount = null;
    target.payableamount = null;
    target.walletamountlayout = null;
    target.promoamountlayout = null;
    target.payableamountlayout = null;
    target.recyclerView = null;
  }
}
