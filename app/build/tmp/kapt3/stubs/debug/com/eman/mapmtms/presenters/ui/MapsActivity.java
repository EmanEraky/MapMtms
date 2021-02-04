package com.eman.mapmtms.presenters.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010&\u001a\u00020\'J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\u0010\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020\'2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\'2\u0006\u0010.\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\'2\u0006\u0010.\u001a\u00020\tH\u0016J\u0012\u00103\u001a\u00020\'2\b\u00104\u001a\u0004\u0018\u00010/H\u0015J\u0012\u00105\u001a\u00020\'2\b\u00106\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u00107\u001a\u00020\'2\u0006\u00108\u001a\u00020\u001dH\u0016J+\u00109\u001a\u00020\'2\u0006\u0010:\u001a\u00020\t2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010>\u001a\u00020?H\u0016\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u00020\'H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/eman/mapmtms/presenters/ui/MapsActivity;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/eman/mapmtms/presenters/listener/Place_Listener;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lcom/google/android/gms/location/LocationListener;", "()V", "REQUEST_LOCATION_CODE", "", "binding", "Lcom/eman/mapmtms/databinding/ActivityMainBinding;", "getBinding", "()Lcom/eman/mapmtms/databinding/ActivityMainBinding;", "setBinding", "(Lcom/eman/mapmtms/databinding/ActivityMainBinding;)V", "enabled", "", "Ljava/lang/Boolean;", "flagType", "mCurrLocationMarker", "Lcom/google/android/gms/maps/model/Marker;", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "mLastLocation", "Landroid/location/Location;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mainViewModel", "Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "getMainViewModel", "()Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "service", "Landroid/location/LocationManager;", "buildGoogleApiClient", "", "checkLocationPermission", "getObserveSource", "onClickPlace", "place", "Lcom/eman/mapmtms/domain/models/Place;", "onConnected", "p0", "Landroid/os/Bundle;", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "onCreate", "savedInstanceState", "onLocationChanged", "location", "onMapReady", "googleMap", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setObservePlaces", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MapsActivity extends androidx.fragment.app.FragmentActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.eman.mapmtms.presenters.listener.Place_Listener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.location.LocationListener {
    private android.location.LocationManager service;
    private java.lang.Boolean enabled;
    private com.google.android.gms.location.LocationRequest mLocationRequest;
    private com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    private android.location.Location mLastLocation;
    private com.google.android.gms.maps.model.Marker mCurrLocationMarker;
    private com.google.android.gms.maps.GoogleMap mMap;
    private int REQUEST_LOCATION_CODE = 101;
    @org.jetbrains.annotations.NotNull()
    public com.eman.mapmtms.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private boolean flagType = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.mapmtms.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.databinding.ActivityMainBinding p0) {
    }
    
    private final com.eman.mapmtms.presenters.ui.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.Nullable()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void onConnectionSuspended(int p0) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult p0) {
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
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    public final synchronized void buildGoogleApiClient() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void checkLocationPermission() {
    }
    
    public MapsActivity() {
        super();
    }
}