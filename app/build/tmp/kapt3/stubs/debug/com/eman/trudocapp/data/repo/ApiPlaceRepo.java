package com.eman.trudocapp.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/eman/trudocapp/data/repo/ApiPlaceRepo;", "Lcom/eman/trudocapp/data/repo/ApiHelper;", "apiService", "Lcom/eman/mapmtms/data/api/ApiService;", "(Lcom/eman/mapmtms/data/api/ApiService;)V", "getPlaces", "Lkotlinx/coroutines/flow/Flow;", "Lcom/eman/trudocapp/utils/Resource;", "Lcom/eman/mapmtms/domain/models/ResultMap;", "location", "", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApiPlaceRepo implements com.eman.trudocapp.data.repo.ApiHelper {
    private final com.eman.mapmtms.data.api.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPlaces(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.eman.trudocapp.utils.Resource<com.eman.mapmtms.domain.models.ResultMap>>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiPlaceRepo(@org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.data.api.ApiService apiService) {
        super();
    }
}