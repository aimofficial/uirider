// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.taxiapp.views.firebaseChat;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class ActivityChat_ViewBinding implements Unbinder {
  private ActivityChat target;

  private View view7f0b02c8;

  private View view7f0b0305;

  @UiThread
  public ActivityChat_ViewBinding(ActivityChat target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityChat_ViewBinding(final ActivityChat target, View source) {
    this.target = target;

    View view;
    target.newMessage = Utils.findRequiredViewAsType(source, R.id.edt_new_msg, "field 'newMessage'", EditText.class);
    target.rv = Utils.findRequiredViewAsType(source, R.id.rv_chat, "field 'rv'", RecyclerView.class);
    target.driverRating = Utils.findRequiredViewAsType(source, R.id.tv_profile_rating, "field 'driverRating'", TextView.class);
    target.driverName = Utils.findRequiredViewAsType(source, R.id.tv_profile_name, "field 'driverName'", TextView.class);
    target.driverProfilePicture = Utils.findRequiredViewAsType(source, R.id.imgvu_driver_profile, "field 'driverProfilePicture'", ImageView.class);
    target.noChats = Utils.findRequiredViewAsType(source, R.id.imgvu_emptychat, "field 'noChats'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.imgvu_back, "method 'backPressed'");
    view7f0b02c8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backPressed();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_send, "method 'sendMessage'");
    view7f0b0305 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sendMessage();
      }
    });
  }

  @Override
  public void unbind() {
    ActivityChat target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.newMessage = null;
    target.rv = null;
    target.driverRating = null;
    target.driverName = null;
    target.driverProfilePicture = null;
    target.noChats = null;

    view7f0b02c8.setOnClickListener(null);
    view7f0b02c8 = null;
    view7f0b0305.setOnClickListener(null);
    view7f0b0305 = null;
  }
}
