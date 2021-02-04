package com.eman.mapmtms.presenters.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\b\u0010*\u001a\u00020\'H\u0002J\u0006\u0010+\u001a\u00020\'J\"\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020\'2\b\u00106\u001a\u0004\u0018\u000107H\u0015J\u0010\u00108\u001a\u00020\'2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J+\u00109\u001a\u00020\'2\u0006\u0010-\u001a\u00020.2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020>H\u0016\u00a2\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020\'2\u0006\u0010A\u001a\u000207H\u0014J\b\u0010B\u001a\u00020\'H\u0002J\b\u0010C\u001a\u00020\'H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/eman/mapmtms/presenters/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/eman/mapmtms/presenters/listener/Place_Listener;", "()V", "binding", "Lcom/eman/mapmtms/databinding/ActivityMainBinding;", "getBinding", "()Lcom/eman/mapmtms/databinding/ActivityMainBinding;", "setBinding", "(Lcom/eman/mapmtms/databinding/ActivityMainBinding;)V", "cameraPosition", "Lcom/google/android/gms/maps/model/CameraPosition;", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "flagType", "", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastKnownLocation", "Landroid/location/Location;", "locationPermissionGranted", "mainViewModel", "Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "getMainViewModel", "()Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "checkGpsStatus", "", "getDeviceLocation", "getLocationPermission", "getObserveSource", "gpsStatus", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClickPlace", "place", "Lcom/eman/mapmtms/domain/models/Place;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "setObservePlaces", "updateLocationUI", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.eman.mapmtms.presenters.listener.Place_Listener {
    private com.google.android.gms.maps.GoogleMap map;
    private com.google.android.gms.maps.model.CameraPosition cameraPosition;
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private final com.google.android.gms.maps.model.LatLng defaultLocation = null;
    private boolean locationPermissionGranted = false;
    private android.location.Location lastKnownLocation;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    @org.jetbrains.annotations.NotNull()
    public com.eman.mapmtms.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private boolean flagType = false;
    private static final java.lang.String TAG = null;
    private static final int DEFAULT_ZOOM = 15;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    public static final com.eman.mapmtms.presenters.ui.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
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
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void checkGpsStatus() {
    }
    
    public final void gpsStatus() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    private final void getDeviceLocation() {
    }
    
    private final void getLocationPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void updateLocationUI() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/eman/mapmtms/presenters/ui/MainActivity$Companion;", "", "()V", "DEFAULT_ZOOM", "", "KEY_CAMERA_POSITION", "", "KEY_LOCATION", "PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION", "TAG", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}