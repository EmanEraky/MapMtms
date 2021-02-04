package com.eman.mapmtms.presenters.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/eman/mapmtms/presenters/adapter/PlacesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eman/mapmtms/presenters/adapter/PlacesAdapter$DataViewHolder;", "list", "", "Lcom/eman/mapmtms/domain/models/Place;", "listener", "Lcom/eman/mapmtms/presenters/listener/Place_Listener;", "(Ljava/util/List;Lcom/eman/mapmtms/presenters/listener/Place_Listener;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getListener", "()Lcom/eman/mapmtms/presenters/listener/Place_Listener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class PlacesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eman.mapmtms.presenters.adapter.PlacesAdapter.DataViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.eman.mapmtms.domain.models.Place> list;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.mapmtms.presenters.listener.Place_Listener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eman.mapmtms.presenters.adapter.PlacesAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.presenters.adapter.PlacesAdapter.DataViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.eman.mapmtms.domain.models.Place> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.eman.mapmtms.domain.models.Place> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.mapmtms.presenters.listener.Place_Listener getListener() {
        return null;
    }
    
    public PlacesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.eman.mapmtms.domain.models.Place> list, @org.jetbrains.annotations.NotNull()
    com.eman.mapmtms.presenters.listener.Place_Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/eman/mapmtms/presenters/adapter/PlacesAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eman/mapmtms/databinding/RowPlaceBinding;", "(Lcom/eman/mapmtms/databinding/RowPlaceBinding;)V", "getBinding", "()Lcom/eman/mapmtms/databinding/RowPlaceBinding;", "app_debug"})
    public static final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.eman.mapmtms.databinding.RowPlaceBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.eman.mapmtms.databinding.RowPlaceBinding getBinding() {
            return null;
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        com.eman.mapmtms.databinding.RowPlaceBinding binding) {
            super(null);
        }
    }
}