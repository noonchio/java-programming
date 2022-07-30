package datastructuresandalgo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("ff7");
       String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
//        STACK DATA STRUCTURE
//        uses of stacks
//        1. undo/redo features in text editors
//        2. moving back/forward through browser history
//        3.backtracking algorithms (maze, file directories)
//        4. calling functions (call stack)
//        5. reverse a word
//
//         stack = Last In First Out (LIFO) data structure.
//         stores objects into a sort of "vertical tower"
//         push() to add to the top
//         pop() to remove from the top


//        QUEUE DATA STRUCTURE
//        Queue = FIFO data structure. First in first
//        out(ex. a line of people) A collection designed
//        for holding elements prior to processing linear
//        datastructure.
//        add = enqueue, offer()
//        remove = dequeue, poll()
//        check if queue is empty: System.out.println(queue
//        .isEmpty());
//        .size() check for size
//        .contains() see if queue contains an object


        // Keyboard Buffer(letters should appear on the screen in the order they're pressed)
        //Printer Queue (Print jobs should be completed in order
        //Used in LinkedLists, PriorityQueues, Breadth-first search
        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");


//        PRIORITY QUEUE DATA STRUCTURE
//      Priority Queue = A FIFO data structure that serves elements with the highest priorities first before elements with lower priority
        Queue<Double>  queue1 = new PriorityQueue<>();
//      Queue<Double>  queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer(3.0);
        queue1.offer(4.0);
        queue1.offer(1.4);

        while(!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

//        LinkedLists DATA STRUCTURE
//        better at adding and deleting elements when compared to array.

        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.pop();
        // you can mimic a stack or a queue

//        LinkedList = stores Nodes in 2 parts (data + address)
//        Nodes are in non-consecutive memory locations
//        Elements are linked using pointers

//        Singly Linked List
//        [data | address] ->  [data | address]
//        Doubly Linked List
//        [ address | data | address]  <->  [ address | data | address]

//        advantages?
//        1. Dynamic Data Structure (allocates needed memory while running
//        2. Insertion and Deletion of Nodes is easy. O(1)
//        3. No/Low memory waste
//        disadvantages?
//        1. Greater memory usage (additional pointer)
//        2. No random access of elements (no index [i])
//        3. Accessing/searching elements is more time-consuming. O(n)
//        uses?
//        1. implement Stacks/Queues
//        2. GPS navigation
//        3. music playlist

//          DYNAMIC ARRAY (ArrayList)
//     major disadvantage of a Static Array is the fixed capacity
//     Advantages:
//        1. Random access of elements O(1)
//        2. Good locality of reference and data cache utilization
//        3. Easy to insert/delete at the end

//        Disadvantages:
//        1. Wastes more memory
//        2. Shifting elements is time-consuming O(n)
//        3. Expanding/Shrinking the array is time-consuming 0(n)

//        ArrayList<String> arrayList = new ArrayList<>();


    }
}
