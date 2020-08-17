package prieto.fernando.core_android_test;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0097\u0001J\t\u0010\u0013\u001a\u00020\tH\u0097\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u0019\u001a\u00020\u0015H\u0097\u0001J/\u0010\u0019\u001a\u00020\u00152\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0097A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0015H\u0097\u0001J\t\u0010 \u001a\u00020\u0015H\u0097\u0001J\u0012\u0010!\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lprieto/fernando/core_android_test/MainCoroutineRule;", "Lorg/junit/rules/TestWatcher;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentTime", "", "getCurrentTime", "()J", "uncaughtExceptions", "", "", "getUncaughtExceptions", "()Ljava/util/List;", "advanceTimeBy", "delayTimeMillis", "advanceUntilIdle", "cleanupTestCoroutines", "", "finished", "description", "Lorg/junit/runner/Description;", "pauseDispatcher", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeDispatcher", "runCurrent", "starting", "core-android-test_debug"})
public final class MainCoroutineRule extends org.junit.rules.TestWatcher implements kotlinx.coroutines.test.TestCoroutineScope {
    
    @java.lang.Override()
    protected void starting(@org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
    }
    
    @java.lang.Override()
    protected void finished(@org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
    }
    
    public MainCoroutineRule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @java.lang.Override()
    public long getCurrentTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Throwable> getUncaughtExceptions() {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public long advanceTimeBy(long delayTimeMillis) {
        return 0L;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public long advanceUntilIdle() {
        return 0L;
    }
    
    @java.lang.Override()
    public void cleanupTestCoroutines() {
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public void pauseDispatcher() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public java.lang.Object pauseDispatcher(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public void resumeDispatcher() {
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public void runCurrent() {
    }
}