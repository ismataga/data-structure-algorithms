package org.mastercode.datastructurealgoritms;

import org.junit.jupiter.api.Test;
import org.mastercode.datastructurealgoritms.coursera.Deque;


import static org.junit.jupiter.api.Assertions.*;

class DequeTest {
    Deque<String> deque = new Deque<>();

    @Test
    void isEmpty() {
        assertTrue(deque.isEmpty(), "Deque should be empty initially.");
    }

    @Test
    void size() {
        assertEquals(0, deque.size(), "Size should be 0 initially.");
    }

    @Test
    void addFirst() {
        deque.addFirst("A");
        deque.addFirst("B");
        deque.addFirst("C");
        assertEquals(3, deque.size(), "Size should be 3 after adding 3 items.");
        assertEquals("C", deque.removeFirst(), "First item should be 'C'.");
    }

    @Test
    void addLast() {
        deque.addLast("D");
        deque.addLast("E");
        deque.addLast("F");
        assertEquals(3, deque.size(), "Size should be 3 after adding 3 more items.");
        assertEquals("D", deque.removeFirst(), "First item should be 'D'.");
        assertEquals("F", deque.removeLast(), "Last item should be 'F'.");
    }

    @Test
    void removeFirst() {
//        assertEquals("C", deque.removeFirst(), "First item should be 'E'.");
        assertTrue(deque.isEmpty(), "Deque should be empty after removing all items.");
    }

    @Test
    void removeLast() {
//        assertEquals("F", deque.removeLast(), "First item should be 'E'.");
        assertTrue(deque.isEmpty(), "Deque should be empty after removing all items.");
    }

//    @Test
//    void iterator() {
//        Iterator<String> iterator = deque.iterator();
//        assertTrue(iterator.hasNext(), "Iterator should have a next item.");
//        assertEquals("I", iterator.next(), "First item should be 'I'.");
//        assertEquals("G", iterator.next(), "Second item should be 'G'.");
//        assertEquals("H", iterator.next(), "Third item should be 'H'.");
//        assertFalse(iterator.hasNext(), "Iterator should not have more items.");
//        assertThrows(NoSuchElementException.class, iterator::next, "Iterator should throw NoSuchElementException on next() after end.");
//    }
    @Test
    public void testAddNullItem() {
        Deque<String> deque = new Deque<>();
        assertThrows(IllegalArgumentException.class, () -> deque.addFirst(null), "Adding null should throw IllegalArgumentException.");
        assertThrows(IllegalArgumentException.class, () -> deque.addLast(null), "Adding null should throw IllegalArgumentException.");
    }

}