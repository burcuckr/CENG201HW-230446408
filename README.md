TEST 1 ANALYSIS                                                          BURCU ZEYNEP ÇAKAR
                                                                                                                                230446408

My Code Output;

Patient Id: 1 Patient name: Arda Mutlu Patient severity: 5 Patient age: 19
Patient Id: 2 Patient name: Sevgi Günaytürk Patient severity: 9 Patient age: 25
Patient Id: 3 Patient name: Açelya Demir Patient severity: 10 Patient age: 29
Patient Id: 4 Patient name: Işıl Ünal Patient severity: 2 Patient age: 44
Patient Id: 5 Patient name: Cengiz Işıldayan Patient severity: 8 Patient age: 23
This id is found. Patient informations are: Işıl Ünal, 44, 2
Patient Id: 1 Patient name: Arda Mutlu Patient severity: 5 Patient age: 19
Patient Id: 2 Patient name: Sevgi Günaytürk Patient severity: 9 Patient age: 25
Patient Id: 3 Patient name: Açelya Demir Patient severity: 10 Patient age: 29
Patient Id: 4 Patient name: Işıl Ünal Patient severity: 2 Patient age: 44


Time Complexity; 
-AddPatient: This method time complexity is O(n).Becausewe don’t have tail. Also while doing n operations if we have 5 patient while runs 5 times after this situation O(n). But we have 2 ways to write this method if we add the new patient at the begining in the list our Big O is O(1) but first patient to get treatement at the end and this is nonsensical. 

-RemovePatient: This method time complexity is O(n) because in this method iterate through the entire traversal using a while loop. (worst case O(n))

-FindPatient: Again our time complexity is O(n) becuse this method iterate through the entire traversal using a while loop. If we have 100 patient and method seach id 100 this methods runs 100 times and finally find another example is we search id 40 and loop runs 40 times. Our complexity is O(n). 

-PrintList: Time complexity is O(n). Because if we have 50 patients this code prints 50 times. If we have n patients this code prints n times. 

+ Our all codes depends on number of patient also all methods time complexity is O(n). 

Linked List Performance vs Array List Performance 

1.	If we want to add the item at the begining of the list we can use linkend list becaues it’s time complexity is O(1). Its very fast beause only change pointer. But int the array list time complexity is O(n) becuse we can all elements shifting.


2.	 If the list has a tail its time complexity is O(1) but my code don’t have tail and my code method time complexity is O(n). In the array list O(1) because we know length and index. 

3.	In the linked list removeing an element method complextiy is O(n) because starting the head and methods search id all patients. In the array list also O(n) because of shifting.





TASK 2 REPORT
TASK2 Output
Patient ID: 1, Arrival Time: 1766329772027
Patient ID: 2, Arrival Time: 1766329772033
Patient ID: 3, Arrival Time: 1766329772033
Patient ID: 4, Arrival Time: 1766329772033
Patient ID: 5, Arrival Time: 1766329772033
Patient ID: 6, Arrival Time: 1766329772033
Patient ID: 7, Arrival Time: 1766329772033
Patient ID: 8, Arrival Time: 1766329772033
Patient ID: 1, Arrival Time: 1766329772027
Patient ID: 2, Arrival Time: 1766329772033
Patient ID: 3, Arrival Time: 1766329772033
Final list; 
Patient ID: 4, Arrival Time: 1766329772033
Patient ID: 5, Arrival Time: 1766329772033
Patient ID: 6, Arrival Time: 1766329772033
Patient ID: 7, Arrival Time: 1766329772033
Patient ID: 8, Arrival Time: 1766329772033
Analysis Questions
1.	Because of queues works with FIFO principle. This means first in first out. The first patient to arrive is treated first, and the last patient is treated last. The system Works true thaks to queues and FIFO principle.
2.	If we use stacks for this situation which works with LIFO this is not logical first patients treated last, and last patient treatment first and this is not logical.
For queue time complextiy is;
Enqueue O(1), dequeue O(1)
For stacks time complexity is;
Push() O(1), pop() O(1)
İf we use stacks for using this Project our time complexity remains same but their working styles are very different. Becuse queue works with FIFO and stacks works with LIFO. 
 
