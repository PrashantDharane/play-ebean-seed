import com.google.inject.AbstractModule;
import dao.ebean.TestDao;
import dao.ebean.impl.EbeanTestDao;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(TestDao.class).to(EbeanTestDao.class);
    }
}
