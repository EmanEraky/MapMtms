package com.eman.mapmtms.presenters.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u0018\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/eman/mapmtms/presenters/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepositoryUseCase", "Lcom/eman/mapmtms/domain/useCases/PlaceUseCase;", "(Lcom/eman/mapmtms/domain/useCases/PlaceUseCase;)V", "_places", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eman/trudocapp/utils/Resource;", "Lcom/eman/mapmtms/domain/models/ResultMap;", "_sourceLocation", "", "Lcom/eman/mapmtms/domain/models/Place;", "getMainRepositoryUseCase", "()Lcom/eman/mapmtms/domain/useCases/PlaceUseCase;", "myDB", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getMyDB", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setMyDB", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "places", "getPlaces", "()Landroidx/lifecycle/MutableLiveData;", "sourceLocation", "getSourceLocation", "getPlacesResponse", "", "location", "", "key", "insertLocation", "path", "place", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.eman.trudocapp.utils.Resource<com.eman.mapmtms.domain.models.ResultMap>> _places = null;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.firestore.FirebaseFirestore myDB;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.eman.mapmtms.domain.models.Place>> _sourceLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.mapmtms.domain.useCases.PlaceUseCase mainRepositoryUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eman.trudocapp.utils.Resource<com.eman.mapmtms.domain.models.ResultMap>> getPlaces() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getMyDB() {
        return null;
    }
    
    public final void setMyDB(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.eman.mapmtms.domain.models.Place>> getSourceLocation() {
        return null;
    }
    
    public final void getPlacesResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void getSourceLocation() {
    }
    
    public final void insertLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.domain.models.Place place) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.mapmtms.domain.useCases.PlaceUseCase getMainRepositoryUseCase() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.domain.useCases.PlaceUseCase mainRepositoryUseCase) {
        super();
    }
}