package prieto.fernando.core.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B.\b\u0007\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006\u00a2\u0006\u0002\b\u00070\u0003\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006\u00a2\u0006\u0002\b\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lprieto/fernando/core/android/InjectingFragmentFactory;", "Landroidx/fragment/app/FragmentFactory;", "creators", "", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;)V", "createFragmentAsFallback", "classLoader", "Ljava/lang/ClassLoader;", "className", "", "instantiate", "core_debug"})
public final class InjectingFragmentFactory extends androidx.fragment.app.FragmentFactory {
    private final java.util.Map<java.lang.Class<? extends androidx.fragment.app.Fragment>, javax.inject.Provider<androidx.fragment.app.Fragment>> creators = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment instantiate(@org.jetbrains.annotations.NotNull()
    java.lang.ClassLoader classLoader, @org.jetbrains.annotations.NotNull()
    java.lang.String className) {
        return null;
    }
    
    private final androidx.fragment.app.Fragment createFragmentAsFallback(java.lang.ClassLoader classLoader, java.lang.String className) {
        return null;
    }
    
    @javax.inject.Inject()
    public InjectingFragmentFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.fragment.app.Fragment>, javax.inject.Provider<androidx.fragment.app.Fragment>> creators) {
        super();
    }
}