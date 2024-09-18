package org.mastercode.datastructurealgoritms.coursera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private ArrayList<Item> items;
    private Random rand;


    // Construct an empty randomized queue
    public RandomizedQueue() {
        items = new ArrayList<>();
        rand = new Random();
    }

    // Is the randomized queue empty?
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Return the number of items on the randomized queue
    public int size() {
        return items.size();
    }

    // Add the item
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Null item not allowed");
        }
        items.add(item);
    }

    // Remove and return a random item
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int index = rand.nextInt(items.size());
        Item item = items.get(index);
        // Move the last item to the removed item's position
        // and remove the last item from the list
        if (index != items.size() - 1) {
            items.set(index, items.get(items.size() - 1));
        }
        items.remove(items.size() - 1);
        return item;
    }

    // Return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int index = rand.nextInt(items.size());
        return items.get(index);
    }

    // Return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }

    private class RandomizedQueueIterator implements Iterator<Item> {
        private ArrayList<Item> shuffledItems;
        private int current;

        public RandomizedQueueIterator() {
            shuffledItems = new ArrayList<>(items);
            // Shuffle the items
            java.util.Collections.shuffle(shuffledItems, rand);
            current = 0;
        }

        public boolean hasNext() {
            return current < shuffledItems.size();
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return shuffledItems.get(current++);
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
