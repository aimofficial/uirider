// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.sendrequest;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class DriverRatingActivity_ViewBinding implements Unbinder {
  private DriverRatingActivity target;

  private View view7f0b0489;

  private View view7f0b0461;

  @UiThread
  public DriverRatingActivity_ViewBinding(DriverRatingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DriverRatingActivity_ViewBinding(final DriverRatingActivity target, View source) {
    this.target = target;

    View view;
    target.riderrate = Utils.findRequiredViewAsType(source, R.id.rider_rating, "field 'riderrate'", RatingBar.class);
    target.ridercomments = Utils.findRequiredViewAsType(source, R.id.rider_comments, "field 'ridercomments'", TextView.class);
    target.tv_tip_text = Utils.findRequiredViewAsType(source, R.id.tv_tip_text, "field 'tv_tip_text'", TextView.class);
    target.imgv_tip = Utils.findRequiredViewAsType(source, R.id.imgv_tip, "field 'imgv_tip'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_driver_tip, "field 'rl_driver_tip', method 'img_close', and method 'skip'");
    target.rl_driver_tip = Utils.castView(view, R.id.rl_driver_tip, "field 'rl_driver_tip'", RelativeLayout.class);
    view7f0b0489 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.img_close();
        target.skip();
      }
    });
    target.commonprofile = Utils.findRequiredView(source, R.id.common_profile, "field 'commonprofile'");
    target.profileImage = Utils.findRequiredViewAsType(source, R.id.profile_image1, "field 'profileImage'", ImageView.class);
    target.tvCovidFeature = Utils.findRequiredViewAsType(source, R.id.tv_covid_feature, "field 'tvCovidFeature'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rate_submit, "field 'button' and method 'submit'");
    target.button = Utils.castView(view, R.id.rate_submit, "field 'button'", Button.class);
    view7f0b0461 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit();
      }
    });
  }

  @Override
  public void unbind() {
    DriverRatingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.riderrate = null;
    target.ridercomments = null;
    target.tv_tip_text = null;
    target.imgv_tip = null;
    target.rl_driver_tip = null;
    target.commonprofile = null;
    target.profileImage = null;
    target.tvCovidFeature = null;
    target.button = null;

    view7f0b0489.setOnClickListener(null);
    view7f0b0489 = null;
    view7f0b0461.setOnClickListener(null);
    view7f0b0461 = null;
  }
}
