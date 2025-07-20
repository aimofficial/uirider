package com.newtaxiprime.user.databinding;
import com.newtaxiprime.user.R;
import com.newtaxiprime.user.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UpdateFiltersBindingImpl extends UpdateFiltersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UpdateFiltersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private UpdateFiltersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[2]
            , (com.newtaxiprime.user.appcommon.custompalette.FontTextView) bindings[1]
            );
        this.cbSelectFilter.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFilters.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.features == variableId) {
            setFeatures((com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFeatures(@Nullable com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel Features) {
        this.mFeatures = Features;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.features);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String featuresName = null;
        boolean featuresSelected = false;
        com.newtaxiprime.user.taxiapp.views.main.filter.FeaturesInCarModel features = mFeatures;

        if ((dirtyFlags & 0x3L) != 0) {



                if (features != null) {
                    // read features.name
                    featuresName = features.getName();
                    // read features.selected
                    featuresSelected = features.isSelected();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cbSelectFilter, featuresSelected);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFilters, featuresName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): features
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}