> ## Proje 1
> [22,27,16,2,18,6] -> Insertion Sort
>
> * Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
> * Big-O gösterimini yazınız.
>   * Time Complexity: Average case: Aradığımız sayının ortada olması, Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
> * Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
> 
> [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

# Insertion Sort

## İlk Dizi

Insertion Sort aşamaları:
1. [22,27,16,2,18,6] -> [**22** | 27,16,2,18,6]
2. [22 | **27**,16,2,18,6] -> [22,**27** | 16,2,18,6]
3. [22,27 | **16**,2,18,6] -> [22,**16**,27 | 2,18,6] -> [**16**,22,27 | 2,18,6]
4. [16,22,27 | **2**,18,6] -> [16,22,**2**,27 | 18,6] -> [16,**2**,22,27 | 18,6] -> [**2**,16,22,27 | 18,6]
5. [2,16,22,27 | **18**,6] -> [2,16,22,**18**,27 | 6] -> [2,16,**18**,22,27 | 6]
6. [2,16,18,22,27 | **6**] -> [2,16,18,22,**6**,27] -> [2,16,18,**6**,22,27] -> [2,16,**6**,18,22,27] -> [2,**6**,16,18,22,27]

Big-O gösterimi:
* Best Case: O(n)
* Average Case: O(n^2)
* Worst Case: O(n^2)

Dizi sıralandıktan sonra 18 sayısı ortada olduğu için average case kapsamındadır.

---

## İkinci Dizi

Insertion Sort ilk 4 aşaması:
1. [7,3,5,8,2,9,4,15,6] -> [**7** | 3,5,8,2,9,4,15,6]
2. [7 | **3**,5,8,2,9,4,15,6] -> [**3**,7 | 5,8,2,9,4,15,6]
3. [3,7 | **5**,8,2,9,4,15,6] -> [3,**5**,7 | 8,2,9,4,15,6]
4. [3,5,7 | **8**,2,9,4,15,6] -> [3,5,7,**8** | 2,9,4,15,6]

