package prieto.fernando.data.mapper;

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
public final class SampleRepositoryToDomainModelMapperImpl_Factory implements Factory<SampleRepositoryToDomainModelMapperImpl> {
  @Override
  public SampleRepositoryToDomainModelMapperImpl get() {
    return newInstance();
  }

  public static SampleRepositoryToDomainModelMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SampleRepositoryToDomainModelMapperImpl newInstance() {
    return new SampleRepositoryToDomainModelMapperImpl();
  }

  private static final class InstanceHolder {
    private static final SampleRepositoryToDomainModelMapperImpl_Factory INSTANCE = new SampleRepositoryToDomainModelMapperImpl_Factory();
  }
}
