package com.tkacik.cvs.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/tkacik/cvs/presentation/viewmodel/FlickrViewModel;", "Landroidx/lifecycle/ViewModel;", "flickrRepository", "Lcom/tkacik/cvs/data/repository/FlickrRepository;", "(Lcom/tkacik/cvs/data/repository/FlickrRepository;)V", "_flickrUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/tkacik/cvs/presentation/viewmodel/FlickrViewModel$FlickrUiState;", "flickrUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getFlickrUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "", "searchInputState", "getSearchInputState", "()Ljava/lang/String;", "setSearchInputState", "(Ljava/lang/String;)V", "searchInputState$delegate", "Landroidx/compose/runtime/MutableState;", "getUserSearch", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/tkacik/cvs/data/local/database/FlickrSearch;", "onItemClick", "", "image", "Lcom/tkacik/cvs/data/remote/dto/FlickrImage;", "onSearchClicked", "updateInput", "input", "FlickrUiState", "app_debug"})
public final class FlickrViewModel extends androidx.lifecycle.ViewModel {
    private final com.tkacik.cvs.data.repository.FlickrRepository flickrRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.tkacik.cvs.presentation.viewmodel.FlickrViewModel.FlickrUiState> _flickrUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.tkacik.cvs.presentation.viewmodel.FlickrViewModel.FlickrUiState> flickrUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState searchInputState$delegate = null;
    
    @javax.inject.Inject()
    public FlickrViewModel(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.repository.FlickrRepository flickrRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.tkacik.cvs.presentation.viewmodel.FlickrViewModel.FlickrUiState> getFlickrUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchInputState() {
        return null;
    }
    
    private final void setSearchInputState(java.lang.String p0) {
    }
    
    public final void updateInput(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.tkacik.cvs.data.local.database.FlickrSearch>> getUserSearch() {
        return null;
    }
    
    public final void onSearchClicked() {
    }
    
    public final void onItemClick(@org.jetbrains.annotations.NotNull()
    com.tkacik.cvs.data.remote.dto.FlickrImage image) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/tkacik/cvs/presentation/viewmodel/FlickrViewModel$FlickrUiState;", "", "isLoading", "", "error", "", "flickrImages", "", "Lcom/tkacik/cvs/data/remote/dto/FlickrImage;", "selectedFlickrImage", "(ZLjava/lang/String;Ljava/util/List;Lcom/tkacik/cvs/data/remote/dto/FlickrImage;)V", "getError", "()Ljava/lang/String;", "getFlickrImages", "()Ljava/util/List;", "()Z", "getSelectedFlickrImage", "()Lcom/tkacik/cvs/data/remote/dto/FlickrImage;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class FlickrUiState {
        private final boolean isLoading = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.tkacik.cvs.data.remote.dto.FlickrImage> flickrImages = null;
        @org.jetbrains.annotations.Nullable()
        private final com.tkacik.cvs.data.remote.dto.FlickrImage selectedFlickrImage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tkacik.cvs.presentation.viewmodel.FlickrViewModel.FlickrUiState copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.NotNull()
        java.util.List<com.tkacik.cvs.data.remote.dto.FlickrImage> flickrImages, @org.jetbrains.annotations.Nullable()
        com.tkacik.cvs.data.remote.dto.FlickrImage selectedFlickrImage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FlickrUiState() {
            super();
        }
        
        public FlickrUiState(boolean isLoading, @org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.NotNull()
        java.util.List<com.tkacik.cvs.data.remote.dto.FlickrImage> flickrImages, @org.jetbrains.annotations.Nullable()
        com.tkacik.cvs.data.remote.dto.FlickrImage selectedFlickrImage) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.tkacik.cvs.data.remote.dto.FlickrImage> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.tkacik.cvs.data.remote.dto.FlickrImage> getFlickrImages() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.tkacik.cvs.data.remote.dto.FlickrImage component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.tkacik.cvs.data.remote.dto.FlickrImage getSelectedFlickrImage() {
            return null;
        }
    }
}