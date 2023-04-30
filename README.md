# MyLinkedList
This code defines a simple singly linked list data structure called `MyLinkedList`. It provides methods to add an element at the beginning (`addFirst`), remove and return the first element (`removeFirst`), get the first element without removing it (`getFirst`), add an element at the end (`addLast`), check if the list is empty (`isEmpty`), and get the size of the list (`size`). The methods are parameterized with generic types to allow for flexibility in the data type of the elements stored in the linked list. However, the methods are not implemented with any logic, and simply return default values of `null` or `false` for the provided methods.
# MyLinkedListQueue
This code defines a generic queue data structure implemented using a linked list. It has four main methods: `enqueue`, `dequeue`, `peek`, and `isEmpty`, along with a constructor that initializes the linked list.

The `enqueue` method adds an item to the end of the queue by calling the `addLast` method on the linked list.

The `dequeue` method removes and returns the first element of the queue by calling the `removeFirst` method on the linked list. It throws a `NoSuchElementException` if the queue is empty.

The `peek` method returns the first element of the queue without removing it, by calling the `getFirst` method on the linked list. It also throws a `NoSuchElementException` if the queue is empty.

The `isEmpty` method returns true if the queue contains no elements by calling the `isEmpty` method on the linked list.

Finally, the `size` method returns the number of elements in the queue by calling the `size` method on the linked list.
# MyLinkedListStack
The given code implements a stack data structure using a linked list. The MyLinkedListStack class is a generic class, which means it can be used to create a stack of any type of element. The class has methods push(), pop(), peek(), isEmpty() and size() which operate on the stack.

The push() method adds a new element to the top of the stack using the addFirst() method of the linked list. The pop() method removes and returns the top element of the stack using the removeFirst() method of the linked list. The peek() method returns the top element of the stack without removing it using the getFirst() method of the linked list.

The isEmpty() method checks whether the stack is empty or not, and returns true or false accordingly using the isEmpty() method of the linked list. The size() method returns the number of elements in the stack using the size() method of the linked list.

Finally, the class also includes an EmptyStackException that is thrown if the stack is empty and a method attempts to access or remove an element from it.