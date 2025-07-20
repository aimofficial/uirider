// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.views.voip;

import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class CallProcessingActivity_ViewBinding implements Unbinder {
  private CallProcessingActivity target;

  private View view7f0b024d;

  private View view7f0b032a;

  private View view7f0b032b;

  private View view7f0b024e;

  private View view7f0b024f;

  @UiThread
  public CallProcessingActivity_ViewBinding(CallProcessingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CallProcessingActivity_ViewBinding(final CallProcessingActivity target, View source) {
    this.target = target;

    View view;
    target.clCallAnsweredView = Utils.findRequiredViewAsType(source, R.id.cl_answer_view, "field 'clCallAnsweredView'", ConstraintLayout.class);
    target.clCallRingingView = Utils.findRequiredViewAsType(source, R.id.cl_incomming_view, "field 'clCallRingingView'", ConstraintLayout.class);
    target.onGoingCallTimerChronometer = Utils.findRequiredViewAsType(source, R.id.chronometer_call_timer, "field 'onGoingCallTimerChronometer'", Chronometer.class);
    target.callConnectionStatus = Utils.findRequiredViewAsType(source, R.id.tv_call_connection_status, "field 'callConnectionStatus'", TextView.class);
    target.imgvLoudSpeaker = Utils.findRequiredViewAsType(source, R.id.imgv_loud_speaker, "field 'imgvLoudSpeaker'", ImageView.class);
    target.imgvMic = Utils.findRequiredViewAsType(source, R.id.imgv_mute_voice, "field 'imgvMic'", ImageView.class);
    target.profileImage = Utils.findRequiredViewAsType(source, R.id.profile_image, "field 'profileImage'", CircleImageView.class);
    target.tvCallerName = Utils.findRequiredViewAsType(source, R.id.tv_caller_name, "field 'tvCallerName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fab_answer, "method 'answerACall'");
    view7f0b024d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.answerACall();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_loudspeaker, "method 'doLoudSpeakerfunctionality'");
    view7f0b032a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.doLoudSpeakerfunctionality();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_mic, "method 'doVoiceMutefunctionality'");
    view7f0b032b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.doVoiceMutefunctionality();
      }
    });
    view = Utils.findRequiredView(source, R.id.fab_dismiss, "method 'cutTheCall'");
    view7f0b024e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cutTheCall();
      }
    });
    view = Utils.findRequiredView(source, R.id.fab_end_call, "method 'cutTheCall'");
    view7f0b024f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cutTheCall();
      }
    });
  }

  @Override
  public void unbind() {
    CallProcessingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.clCallAnsweredView = null;
    target.clCallRingingView = null;
    target.onGoingCallTimerChronometer = null;
    target.callConnectionStatus = null;
    target.imgvLoudSpeaker = null;
    target.imgvMic = null;
    target.profileImage = null;
    target.tvCallerName = null;

    view7f0b024d.setOnClickListener(null);
    view7f0b024d = null;
    view7f0b032a.setOnClickListener(null);
    view7f0b032a = null;
    view7f0b032b.setOnClickListener(null);
    view7f0b032b = null;
    view7f0b024e.setOnClickListener(null);
    view7f0b024e = null;
    view7f0b024f.setOnClickListener(null);
    view7f0b024f = null;
  }
}
