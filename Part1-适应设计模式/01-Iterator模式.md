# 1.Iterator模式
使用Java语言显示数组arr中的元素时，我们可以使用下面这样的for循环语句遍历数组。
```java
for (int i = 0;i < arr.length;i++) {
    System.out.println(arr[i]);
}
```

请注意这段代码中的循环变量i。该变量的初始值是0，然后会递增为1，2，3,
..，程序则 在每次i递增后都输出arr[i]。我们在程序中经常会看到这样的for循环语句。

数组中保存了很多元素，通过指定数组下标，我们可以从中选择任意一个元素。
```java
arr[0]最开始的元素(第0个元素)
arr[1]下一个元素(第1个元素)
arr[i](第i个元素）
arr[arr . length - 1]最后一个元素
```
for语句中的`i++`的作用是让i的值在每次循环后自增1，这样就可以访问数组中的下一个元素、下下一个元素、再下下一个元素，也就实现了从头至尾逐一遍历数组元素的功能。
`将这里的循环变量i的作用抽象化、通用化后形成的模式，在设计模式中称为Iterator模式。`

`Iterator模式用于在数据集合中按照顺序遍历集合。`英语单词Iterate有反复做某件事情的意思，汉语称为“迭代器”。

# 2. 示例程序
[代码见：/src/iterator]()

![img.png](img.png)

![img_1.png](img_1.png)

# 3.Iterator模式中的登场角色
![img_2.png](img_2.png)

# 3.拓展思路的要点
![img_3.png](img_3.png)

![img_4.png](img_4.png)

![img_5.png](img_5.png)

![img_6.png](img_6.png)

![img_7.png](img_7.png)

![img_8.png](img_8.png)

![img_9.png](img_9.png)

![img_10.png](img_10.png)

# 5.相关的设计模式
![img_11.png](img_11.png)