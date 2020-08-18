package prieto.fernando.template;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import prieto.fernando.core.android.InjectingFragmentFactory;
import prieto.fernando.core.android.InjectingViewModelFactory;
import prieto.fernando.presentation.FirstViewModel;
import prieto.fernando.presentation.FirstViewModelImpl;
import prieto.fernando.template.di.AppModule;
import prieto.fernando.template.ui.FirstFragment;
import prieto.fernando.template.ui.MainActivity;
import prieto.fernando.template.ui.MainActivity_MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerTemplateApp_HiltComponents_ApplicationC extends TemplateApp_HiltComponents.ApplicationC {
  private volatile Provider<FirstViewModelImpl> firstViewModelImplProvider;

  private volatile Object injectingViewModelFactory = new MemoizedSentinel();

  private volatile Provider<FirstFragment> firstFragmentProvider;

  private DaggerTemplateApp_HiltComponents_ApplicationC() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static TemplateApp_HiltComponents.ApplicationC create() {
    return new Builder().build();
  }

  private Provider<FirstViewModelImpl> getFirstViewModelImplProvider() {
    Object local = firstViewModelImplProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      firstViewModelImplProvider = (Provider<FirstViewModelImpl>) local;
    }
    return (Provider<FirstViewModelImpl>) local;
  }

  private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
      ) {
    return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(FirstViewModel.class, (Provider) getFirstViewModelImplProvider());}

  private InjectingViewModelFactory getInjectingViewModelFactory() {
    Object local = injectingViewModelFactory;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = injectingViewModelFactory;
        if (local instanceof MemoizedSentinel) {
          local = new InjectingViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
          injectingViewModelFactory = DoubleCheck.reentrantCheck(injectingViewModelFactory, local);
        }
      }
    }
    return (InjectingViewModelFactory) local;
  }

  private FirstFragment getFirstFragment() {
    return new FirstFragment(getInjectingViewModelFactory());}

  private Provider<FirstFragment> getFirstFragmentProvider() {
    Object local = firstFragmentProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      firstFragmentProvider = (Provider<FirstFragment>) local;
    }
    return (Provider<FirstFragment>) local;
  }

  private Map<Class<? extends Fragment>, Provider<Fragment>> getMapOfClassOfAndProviderOfFragment(
      ) {
    return Collections.<Class<? extends Fragment>, Provider<Fragment>>singletonMap(FirstFragment.class, (Provider) getFirstFragmentProvider());}

  private InjectingFragmentFactory getInjectingFragmentFactory() {
    return new InjectingFragmentFactory(getMapOfClassOfAndProviderOfFragment());}

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  @Override
  public void injectTemplateApp(TemplateApp templateApp) {
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public TemplateApp_HiltComponents.ApplicationC build() {
      return new DaggerTemplateApp_HiltComponents_ApplicationC();
    }
  }

  private final class ActivityRetainedCBuilder implements TemplateApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public TemplateApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends TemplateApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements TemplateApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public TemplateApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends TemplateApp_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>emptySet();}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
        injectMainActivity2(mainActivity);}

      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectFragmentFactory(instance, DaggerTemplateApp_HiltComponents_ApplicationC.this.getInjectingFragmentFactory());
        return instance;
      }

      private final class FragmentCBuilder implements TemplateApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public TemplateApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends TemplateApp_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>emptySet();}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        @Override
        public void injectFirstFragment(FirstFragment firstFragment) {
        }

        private final class ViewWithFragmentCBuilder implements TemplateApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public TemplateApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends TemplateApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements TemplateApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public TemplateApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends TemplateApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements TemplateApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public TemplateApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends TemplateApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // prieto.fernando.template.ui.FirstFragment 
        return (T) DaggerTemplateApp_HiltComponents_ApplicationC.this.getFirstFragment();

        case 1: // prieto.fernando.presentation.FirstViewModelImpl 
        return (T) new FirstViewModelImpl();

        default: throw new AssertionError(id);
      }
    }
  }
}
