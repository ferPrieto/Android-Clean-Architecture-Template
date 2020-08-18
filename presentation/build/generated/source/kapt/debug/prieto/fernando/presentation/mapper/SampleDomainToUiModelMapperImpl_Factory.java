package prieto.fernando.presentation.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SampleDomainToUiModelMapperImpl_Factory implements Factory<SampleDomainToUiModelMapperImpl> {
  @Override
  public SampleDomainToUiModelMapperImpl get() {
    return newInstance();
  }

  public static SampleDomainToUiModelMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SampleDomainToUiModelMapperImpl newInstance() {
    return new SampleDomainToUiModelMapperImpl();
  }

  private static final class InstanceHolder {
    private static final SampleDomainToUiModelMapperImpl_Factory INSTANCE = new SampleDomainToUiModelMapperImpl_Factory();
  }
}
