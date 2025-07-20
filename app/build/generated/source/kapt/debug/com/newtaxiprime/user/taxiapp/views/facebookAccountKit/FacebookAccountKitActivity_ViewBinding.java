// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.views.facebookAccountKit;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hbb20.CountryCodePicker;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class FacebookAccountKitActivity_ViewBinding implements Unbinder {
  private FacebookAccountKitActivity target;

  private View view7f0b05f1;

  private View view7f0b0251;

  private View view7f0b03d2;

  private View view7f0b00da;

  @UiThread
  public FacebookAccountKitActivity_ViewBinding(FacebookAccountKitActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FacebookAccountKitActivity_ViewBinding(final FacebookAccountKitActivity target,
      View source) {
    this.target = target;

    View view;
    target.mobileNumberHeading = Utils.findRequiredViewAsType(source, R.id.tv_mobile_heading, "field 'mobileNumberHeading'", TextView.class);
    target.tvResendOTPLabel = Utils.findRequiredViewAsType(source, R.id.tv_otp_resend_label, "field 'tvResendOTPLabel'", TextView.class);
    target.tvResendOTPCountdown = Utils.findRequiredViewAsType(source, R.id.tv_otp_resend_countdown, "field 'tvResendOTPCountdown'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_resend_button, "field 'tvResendOTP' and method 'resendOTP'");
    target.tvResendOTP = Utils.castView(view, R.id.tv_resend_button, "field 'tvResendOTP'", TextView.class);
    view7f0b05f1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.resendOTP();
      }
    });
    target.tvOTPErrorMessage = Utils.findRequiredViewAsType(source, R.id.tv_otp_error_field, "field 'tvOTPErrorMessage'", TextView.class);
    target.ctlPhoneNumber = Utils.findRequiredViewAsType(source, R.id.cl_phone_number_input, "field 'ctlPhoneNumber'", ConstraintLayout.class);
    target.ctlOTP = Utils.findRequiredViewAsType(source, R.id.cl_otp_input, "field 'ctlOTP'", ConstraintLayout.class);
    target.pbNumberVerification = Utils.findRequiredViewAsType(source, R.id.pb_number_verification, "field 'pbNumberVerification'", ProgressBar.class);
    target.phNumberVerification = Utils.findRequiredViewAsType(source, R.id.ph_number_verification, "field 'phNumberVerification'", ProgressBar.class);
    target.imgvArrow = Utils.findRequiredViewAsType(source, R.id.imgv_next, "field 'imgvArrow'", ImageView.class);
    target.imgArrow = Utils.findRequiredViewAsType(source, R.id.img_next, "field 'imgArrow'", ImageView.class);
    target.rlEdittexts = Utils.findRequiredViewAsType(source, R.id.rl_edittexts, "field 'rlEdittexts'", RelativeLayout.class);
    target.edtxOne = Utils.findRequiredViewAsType(source, R.id.one, "field 'edtxOne'", EditText.class);
    target.edtxTwo = Utils.findRequiredViewAsType(source, R.id.two, "field 'edtxTwo'", EditText.class);
    target.edtxThree = Utils.findRequiredViewAsType(source, R.id.three, "field 'edtxThree'", EditText.class);
    target.edtxFour = Utils.findRequiredViewAsType(source, R.id.four, "field 'edtxFour'", EditText.class);
    target.edtxPhoneNumber = Utils.findRequiredViewAsType(source, R.id.phone, "field 'edtxPhoneNumber'", EditText.class);
    target.ccp = Utils.findRequiredViewAsType(source, R.id.ccp, "field 'ccp'", CountryCodePicker.class);
    view = Utils.findRequiredView(source, R.id.fab_verify, "field 'cvNext' and method 'startAnimationd'");
    target.cvNext = Utils.castView(view, R.id.fab_verify, "field 'cvNext'", CardView.class);
    view7f0b0251 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startAnimationd();
      }
    });
    view = Utils.findRequiredView(source, R.id.otp_verify, "field 'cvvNext' and method 'startAnimation'");
    target.cvvNext = Utils.castView(view, R.id.otp_verify, "field 'cvvNext'", CardView.class);
    view7f0b03d2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startAnimation();
      }
    });
    view = Utils.findRequiredView(source, R.id.back, "method 'showPhoneNumberField'");
    view7f0b00da = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showPhoneNumberField();
      }
    });
  }

  @Override
  public void unbind() {
    FacebookAccountKitActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mobileNumberHeading = null;
    target.tvResendOTPLabel = null;
    target.tvResendOTPCountdown = null;
    target.tvResendOTP = null;
    target.tvOTPErrorMessage = null;
    target.ctlPhoneNumber = null;
    target.ctlOTP = null;
    target.pbNumberVerification = null;
    target.phNumberVerification = null;
    target.imgvArrow = null;
    target.imgArrow = null;
    target.rlEdittexts = null;
    target.edtxOne = null;
    target.edtxTwo = null;
    target.edtxThree = null;
    target.edtxFour = null;
    target.edtxPhoneNumber = null;
    target.ccp = null;
    target.cvNext = null;
    target.cvvNext = null;

    view7f0b05f1.setOnClickListener(null);
    view7f0b05f1 = null;
    view7f0b0251.setOnClickListener(null);
    view7f0b0251 = null;
    view7f0b03d2.setOnClickListener(null);
    view7f0b03d2 = null;
    view7f0b00da.setOnClickListener(null);
    view7f0b00da = null;
  }
}
