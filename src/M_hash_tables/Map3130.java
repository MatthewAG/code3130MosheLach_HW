package M_hash_tables;

public interface Map3130<K, V> {
    int size();
    V put(K key, V value);
    boolean containsKey(Object o);
    V get(Object key);
    V remove(Object key);
}
