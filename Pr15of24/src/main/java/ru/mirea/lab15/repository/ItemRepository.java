package ru.mirea.lab15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.lab15.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
