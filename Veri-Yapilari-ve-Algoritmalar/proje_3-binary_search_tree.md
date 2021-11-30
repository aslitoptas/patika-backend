> ## Proje 3
> [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
> 
> Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

# Binary Search Tree

Binary Search diziyi sıralı kabul eder.
Node bulunmadığı için dizinin ilk elemanını root olarak alır.

Binary Search Tree aşamaları:
1. **7**: 7 root olarak alınır. İlk düğüm oluşur.
2. **5**: 7'nin solunda bulunur. Burada düğüm olmadığı için oluşturulur.
3. **1**: 7'nin solundadır. 5'in bulunduğu düğümün de solunda bulunur. Buraya yeni düğüm olarak eklenir.
4. **8**: 7'nin sağındadır. Buraya yeni düğüm olarak eklenir.
5. **3**: 7'nin ve 5'in solundadır. 1'in sağındadır. Buraya düğüm olarak eklenir.
6. **6**: 7'nin solunda, 5'in sağındadır. Buraya düğüm olarak eklenir.
7. **0**: 7'nin, 5'in ve 1'in solundadır. Düğüm olarak eklenir.
8. **9**: 7'nin ve 8'in sağına düğüm olarak eklenir.
9. **4**: 7'nin, 5'in solunda, 1 ve 3'ün sağındadır. 3'ün sağına düğüm olarak eklenir.
10. **2**: 7'nin ve 5'in solunda, 1'in sağında, 3'ün solundadır. Düğüm olarak eklenir.

---

BST anatomisi:

```
            7
          /    \
        5        8
      /    \      \
    1       6       9
  /   \
0       3
      /   \
    2       4
```
