// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.views.peakPricing;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class PeakPricing_ViewBinding implements Unbinder {
  private PeakPricing target;

  private View view7f0b05ae;

  private View view7f0b05fc;

  private View view7f0b02c9;

  @UiThread
  public PeakPricing_ViewBinding(PeakPricing target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PeakPricing_ViewBinding(final PeakPricing target, View source) {
    this.target = target;

    View view;
    target.tvPeakPricePercentage = Utils.findRequiredViewAsType(source, R.id.tv_peak_price_percentage, "field 'tvPeakPricePercentage'", TextView.class);
    target.tvMinimumFare = Utils.findRequiredViewAsType(source, R.id.tv_minimum_fare, "field 'tvMinimumFare'", TextView.class);
    target.tvPerMinutes = Utils.findRequiredViewAsType(source, R.id.tv_per_minutes, "field 'tvPerMinutes'", TextView.class);
    target.tvPerDistance = Utils.findRequiredViewAsType(source, R.id.tv_per_distance, "field 'tvPerDistance'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_accept_higherPrice, "method 'acceptHigherPriceButtonClick'");
    view7f0b05ae = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.acceptHigherPriceButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_tryLater_higherPrice, "method 'declinedPeakPriceButtonClick'");
    view7f0b05fc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.declinedPeakPriceButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.imgvu_close_icon, "method 'closeActivity'");
    view7f0b02c9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.closeActivity();
      }
    });
  }

  @Override
  public void unbind() {
    PeakPricing target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvPeakPricePercentage = null;
    target.tvMinimumFare = null;
    target.tvPerMinutes = null;
    target.tvPerDistance = null;

    view7f0b05ae.setOnClickListener(null);
    view7f0b05ae = null;
    view7f0b05fc.setOnClickListener(null);
    view7f0b05fc = null;
    view7f0b02c9.setOnClickListener(null);
    view7f0b02c9 = null;
  }
}
