package T7;

public class T7 {
    /*
    1)
    Escalator
    Music Playlists
    Restaurant orders
    Vehicle on one way road

    Supermarket checkout line: When customers wait in a line to pay for their groceries, they are forming a queue.
    The first customer to arrive at the checkout is the first to be served, while the others wait their turn.

    ATM machine: When people wait to use an ATM machine, they are forming a queue. The first person in line gets to use the
    machine first, while others wait their turn.

    Call center: When customers call a customer service center and are placed on hold, they are in a queue. The first person
    to call gets to speak to a representative first, while the others wait their turn.

    Bus stop: When people wait for a bus, they are forming a queue. The first person to arrive at the bus stop gets to board
    the bus first, while others wait their turn.

2)  Queue is a first-in-first-out (FIFO) data structure where the first item removed is the item least recently added.
    Stack is a last-in-first-out (LIFO) data structure where the first item removed is the item most recently added.

    Stack: A stack is a linear data structure in which elements can be inserted and deleted only from one side of the list,
    called the top. A stack follows the LIFO (Last In First Out) principle, i.e., the element inserted at the last is the
    first element to come out. The insertion of an element into the stack is called push operation, and the deletion of an
    element from the stack is called pop operation. In stack, we always keep track of the last element present in the list
    with a pointer called top.

    Queue is a linear data structure in which elements can be inserted only from one side of the list called rear, and the
    elements can be deleted only from the other side called the front. The queue data structure follows the FIFO
    (First In First Out) principle, i.e. the element inserted at first in the list, is the first element to be removed from
    the list. The insertion of an element in a queue is called an enqueue operation and the deletion of an element is called
    a dequeue operation. In queue, we always maintain two pointers, one pointing to the element which was inserted at the
    first and still present in the list with the front pointer and the second pointer pointing to the element inserted at
    the last with the rear pointer.

 3) (a)1 4 5 2 3
    (b)not possible
    (c) true true true true true
        true true true false false
        true true false false false

 4) (a)5
    (b)7
    (c)7
    (d)9

 5) peek(): This operation returns the element at the front of the queue without removing it. It can be implemented by
    simply returning the data value of the first node in the linked list.

    isEmpty(): This operation returns a boolean value indicating whether the queue is empty or not. It can be implemented by
    checking if the head pointer of the linked list is null.

    clear(): This operation removes all the elements from the queue and resets the queue to an empty state. It can be implemented
    by setting the head pointer to null and resetting the size to zero.

     public boolean isEmpty(){
     return list.isEmpty();
     }
     public E peek(){
     return list.getFirst();
     }
     public boolean contains(E e){
     return list.contains(E);
     }

     */
}
