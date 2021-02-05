package com.eman.mapmtms.presenters.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0015J\b\u0010\u001a\u001a\u00020\u0013H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/eman/mapmtms/presenters/ui/MapsActivity;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/eman/mapmtms/presenters/listener/Place_Listener;", "()V", "binding", "Lcom/eman/mapmtms/databinding/ActivityMapsBinding;", "getBinding", "()Lcom/eman/mapmtms/databinding/ActivityMapsBinding;", "setBinding", "(Lcom/eman/mapmtms/databinding/ActivityMapsBinding;)V", "flagType", "", "mainViewModel", "Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "getMainViewModel", "()Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "getObserveSource", "", "onClickPlace", "place", "Lcom/eman/mapmtms/domain/models/Place;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setObservePlaces", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MapsActivity extends androidx.fragment.app.FragmentActivity implements com.eman.mapmtms.presenters.listener.Place_Listener {
    @org.jetbrains.annotations.NotNull()
    public com.eman.mapmtms.databinding.ActivityMapsBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private boolean flagType = false;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String lastLocation = "";
    public static final com.eman.mapmtms.presenters.ui.MapsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.mapmtms.databinding.ActivityMapsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.databinding.ActivityMapsBinding p0) {
    }
    
    private final com.eman.mapmtms.presenters.ui.MainViewModel getMainViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getObserveSource() {
    }
    
    private final void setObservePlaces() {
    }
    
    @java.lang.Override()
    public void onClickPlace(@org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.domain.models.Place place) {
    }
    
    public MapsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/eman/mapmtms/presenters/ui/MapsActivity$Companion;", "", "()V", "lastLocation", "", "getLastLocation", "()Ljava/lang/String;", "setLastLocation", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastLocation() {
            return null;
        }
        
        public final void setLastLocation(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}