package com.eman.mapmtms.databinding;
import com.eman.mapmtms.R;
import com.eman.mapmtms.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RowPlaceBindingImpl extends RowPlaceBinding implements com.eman.mapmtms.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txt_place, 1);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowPlaceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private RowPlaceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.eman.mapmtms.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.place == variableId) {
            setPlace((com.eman.mapmtms.domain.models.Place) variable);
        }
        else if (BR.pListener == variableId) {
            setPListener((com.eman.mapmtms.presenters.listener.Place_Listener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlace(@Nullable com.eman.mapmtms.domain.models.Place Place) {
        this.mPlace = Place;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.place);
        super.requestRebind();
    }
    public void setPListener(@Nullable com.eman.mapmtms.presenters.listener.Place_Listener PListener) {
        this.mPListener = PListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.pListener);
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
        com.eman.mapmtms.domain.models.Place place = mPlace;
        com.eman.mapmtms.presenters.listener.Place_Listener pListener = mPListener;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // place
        com.eman.mapmtms.domain.models.Place place = mPlace;
        // pListener
        com.eman.mapmtms.presenters.listener.Place_Listener pListener = mPListener;
        // pListener != null
        boolean pListenerJavaLangObjectNull = false;



        pListenerJavaLangObjectNull = (pListener) != (null);
        if (pListenerJavaLangObjectNull) {



            pListener.onClickPlace(place);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): place
        flag 1 (0x2L): pListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}