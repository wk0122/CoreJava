package tech.aistar.day14.maps;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:自定义泛型
 * @date 2019/4/15 0015
 */
public class MyEntry<K,V> {
    private K key;

    private V value;

    public MyEntry() {
    }

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyEntry{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
