package dao;

import io.ebean.Ebean;
import io.ebean.Finder;

public abstract class AbstractDao<K,T> implements Dao<K,T>{

    protected final Finder<K,T> finder;

    public AbstractDao(Finder<K, T> finder) {
        this.finder = finder;
    }

    @Override
    public T findById(K id) {
        return finder.byId(id);
    }

    @Override
    public void save(T t) {
        Ebean.save(t);
    }

    @Override
    public void delete(T t) {
        Ebean.save(t);
    }
}
