#### **TASK**

In the `Triangle` class:

- Create a constructor with three parameters.  
- Write methods to calculate the perimeter (using Heron's formula), the area, and to check the type of triangle based on its sides.  

In the `Main` class:

- In the `main` method, ask the user for the lengths of the sides.  
- If a triangle can be formed with the given sides (they satisfy the triangle inequality):  
  - Create the triangle.  
  - Display a menu, e.g., (1. Area, 2. Perimeter, 3. Type, 4. Exit).  

- If a triangle cannot be formed, display this information and terminate the program.  

- As long as the user does not choose "Exit," the menu should reappear after the selected operation is performed.

---

```
Podaj dlugosc boku a: 3,5
Podaj dlugosc boku b: 3
Podaj dlugosc boku c: 2
1.perimeter, 2.area, 3.type, 4.exit 
1
perimeter: 8.5
1.perimeter, 2.area, 3.type, 4.exit 
2
area: 2,99
1.perimeter, 2.area, 3.type, 4.exit 
3
type: scalene
1.perimeter, 2.area, 3.type, 4.exit 
4
invalid number
the program is complete
```