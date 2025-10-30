package L_hash_tables.B_map;

public interface Map3130<K, V> {
    // Entry interface?

    int size();
    V put(K key, V value);
    boolean containsKey(Object o);
    V get(Object key);
    V remove(Object key);

    // keySet(), values() [what should it return?], entrySet()?
}
