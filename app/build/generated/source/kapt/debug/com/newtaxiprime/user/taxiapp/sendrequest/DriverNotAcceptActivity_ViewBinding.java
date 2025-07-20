// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.sendrequest;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class DriverNotAcceptActivity_ViewBinding implements Unbinder {
  private DriverNotAcceptActivity target;

  private View view7f0b0495;

  @UiThread
  public DriverNotAcceptActivity_ViewBinding(DriverNotAcceptActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DriverNotAcceptActivity_ViewBinding(final DriverNotAcceptActivity target, View source) {
    this.target = target;

    View view;
    target.try_again = Utils.findRequiredViewAsType(source, R.id.try_again, "field 'try_again'", TextView.class);
    target.drivernotaccept_back = Utils.findRequiredViewAsType(source, R.id.drivernotaccept_back, "field 'drivernotaccept_back'", ImageView.class);
    target.tv_call = Utils.findRequiredViewAsType(source, R.id.tv_call, "field 'tv_call'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rlt_contact_admin, "field 'rlt_contact_admin' and method 'callAdmin'");
    target.rlt_contact_admin = Utils.castView(view, R.id.rlt_contact_admin, "field 'rlt_contact_admin'", RelativeLayout.class);
    view7f0b0495 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.callAdmin();
      }
    });
  }

  @Override
  public void unbind() {
    DriverNotAcceptActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.try_again = null;
    target.drivernotaccept_back = null;
    target.tv_call = null;
    target.rlt_contact_admin = null;

    view7f0b0495.setOnClickListener(null);
    view7f0b0495 = null;
  }
}
