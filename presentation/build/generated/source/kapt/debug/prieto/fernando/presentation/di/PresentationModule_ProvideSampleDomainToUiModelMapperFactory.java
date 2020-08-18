package prieto.fernando.presentation.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import prieto.fernando.presentation.mapper.SampleDomainToUiModelMapper;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresentationModule_ProvideSampleDomainToUiModelMapperFactory implements Factory<SampleDomainToUiModelMapper> {
  private final PresentationModule module;

  public PresentationModule_ProvideSampleDomainToUiModelMapperFactory(PresentationModule module) {
    this.module = module;
  }

  @Override
  public SampleDomainToUiModelMapper get() {
    return provideSampleDomainToUiModelMapper(module);
  }

  public static PresentationModule_ProvideSampleDomainToUiModelMapperFactory create(
      PresentationModule module) {
    return new PresentationModule_ProvideSampleDomainToUiModelMapperFactory(module);
  }

  public static SampleDomainToUiModelMapper provideSampleDomainToUiModelMapper(
      PresentationModule instance) {
    return Preconditions.checkNotNull(instance.provideSampleDomainToUiModelMapper(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
