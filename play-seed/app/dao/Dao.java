package dao;

public interface Dao<K,T> {
    T findById(K id);
    void save(T t);
    void delete(T t);
}
