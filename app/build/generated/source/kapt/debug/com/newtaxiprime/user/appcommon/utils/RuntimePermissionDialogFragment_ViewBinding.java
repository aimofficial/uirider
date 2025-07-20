// Generated code from Butter Knife. Do not modify!
package com.newtaxiprime.user.appcommon.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newtaxiprime.user.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class RuntimePermissionDialogFragment_ViewBinding implements Unbinder {
  private RuntimePermissionDialogFragment target;

  private View view7f0b05c0;

  private View view7f0b05c2;

  @UiThread
  public RuntimePermissionDialogFragment_ViewBinding(final RuntimePermissionDialogFragment target,
      View source) {
    this.target = target;

    View view;
    target.permissionTypeImage = Utils.findRequiredViewAsType(source, R.id.imgv_df_permissionImage, "field 'permissionTypeImage'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.tv_df_permissionAllow, "field 'permissionAllow' and method 'allowPermission'");
    target.permissionAllow = Utils.castView(view, R.id.tv_df_permissionAllow, "field 'permissionAllow'", TextView.class);
    view7f0b05c0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.allowPermission();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_df_permissionNotAllow, "field 'permissionNotAllow' and method 'notAllowPermission'");
    target.permissionNotAllow = Utils.castView(view, R.id.tv_df_permissionNotAllow, "field 'permissionNotAllow'", TextView.class);
    view7f0b05c2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.notAllowPermission();
      }
    });
    target.tv_permissionDescription = Utils.findRequiredViewAsType(source, R.id.tv_df_permissionDescription, "field 'tv_permissionDescription'", TextView.class);
  }

  @Override
  public void unbind() {
    RuntimePermissionDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.permissionTypeImage = null;
    target.permissionAllow = null;
    target.permissionNotAllow = null;
    target.tv_permissionDescription = null;

    view7f0b05c0.setOnClickListener(null);
    view7f0b05c0 = null;
    view7f0b05c2.setOnClickListener(null);
    view7f0b05c2 = null;
  }
}
