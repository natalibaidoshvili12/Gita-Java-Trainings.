package feb21;

import java.util.*;

public class MyMap<K,V> implements Map<K,V> {

    private Object[] keys;
    private Object[] values;
    private int logLength;
    private int allocLength;

    public MyMap() {
        logLength = 0;
        allocLength = 4;
        keys = new Object[allocLength];
        values = new Object[allocLength];
    }

    public MyMap(int initialCapacity) {
        logLength = 0;
        allocLength = initialCapacity;
        keys = new Object[allocLength];
        values = new Object[allocLength];
    }

    @Override
    public int size() {
        return logLength;
    }

    @Override
    public boolean isEmpty() {
        return logLength == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return findKey(key) != -1;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < logLength; i++) {
            if (values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int index = findKey(key);
        return index == -1 ? null : (V) values[index];
    }

    private int findKey(Object key) {
        for (int i = 0; i < logLength; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        allocLength *= 2;
        Object[] newKeys = new Object[allocLength];
        Object[] newValues = new Object[allocLength];
        for (int i = 0; i < logLength; i++) {
            newKeys[i] = keys[i];
            newValues[i] = values[i];
        }
        keys = newKeys;
        values = newValues;
    }

    @Override
    public Object put(Object key, Object value) {
        if (allocLength == logLength) {
            grow();
        }

        int index = findKey(key);
        if (index != -1) {
            Object oldValue = values[index];
            values[index] = value;
            return oldValue;
        } else {
            keys[logLength] = key;
            values[logLength] = value;
            logLength++;
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        int index = findKey(key);
        if (index != -1) {
            Object oldValue = values[index];
            for (int i = index; i < logLength; i++) {
                keys[i] = keys[i + 1];
                values[i] = values[i + 1];
            }
            logLength--;
            return (V) oldValue;
        }
        return null;
    }

    @Override
    public void putAll(Map m) {
        for (Object o : m.keySet()) {
            put(o, m.get(o));
        }
    }

    @Override
    public void clear() {
        keys = new Object[allocLength];
        values = new Object[allocLength];
        logLength = 0;
    }

    @Override
    public Set keySet() {
        Set set = new HashSet();
        for (int i = 0; i < logLength; i++) {
            set.add(keys[i]);
        }
        return set;
    }

    @Override
    public Collection values() {
        List list = new ArrayList();
        for (int i = 0; i < logLength; i++) {
            list.add(values[i]);
        }
        return list;
    }

    // it's not necessary to implement this
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
