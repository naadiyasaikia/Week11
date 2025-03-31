package com.example.week11;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository<T> {
    private List<T> items = new ArrayList<>();

    public void addAll(List<T> itemsToAdd) {
        items.addAll(itemsToAdd);
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }
    public void add(T item) {
        if (item == null) throw new IllegalArgumentException("Item cannot be null");
        items.add(item);
    }

    public List<T> filter(Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

}
