package javaregexandjunit;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}

class ListManagerTest {

    @Test
    void testAddElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>(List.of(10, 20));

        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        assertEquals(3, manager.getSize(list));
    }
}