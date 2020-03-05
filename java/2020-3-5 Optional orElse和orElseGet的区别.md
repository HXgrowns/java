### 请比较orElse()和orElseGet()的详细区别

1、传入的参数不同

orElse接受类型T的 任何参数，而orElseGet（）接受类型为Supplier的函数接口，该接口返回类型为T的对象 。如下两个函数的声明所示。

```php
public T orElse(T other)
public T orElseGet(Supplier<? extends T> other)
```

2、执行的情况不同

当Optional的值是空值时，无论orElse还是orElseGet都会执行；而当返回的Optional有值时，orElse会执行，而orElseGet不会执行。默认情况下，每次使用orElseGet（） 更有意义，除非默认对象已经构造并且可以直接访问。

```java
public void testOrElse() {
    Integer x = 3;
    Optional<Integer> optional = Optional.ofNullable(x);

    System.out.println(optional.orElse(test1()));

    System.out.println(optional.orElseGet(() -> {
      System.out.println("orElseGet执行了");
      return 5;
    }));
  }

  private int test1() {
    System.out.println("orElse执行了");
    return 4;
  }
//结果
orElse执行了
3
3
```

