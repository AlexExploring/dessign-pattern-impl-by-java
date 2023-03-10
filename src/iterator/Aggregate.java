package iterator;

/**
 * 类似JDK中的Iterable
 *
 * Aggregate接口是所要遍历的集合的接口。实现了该接口的类将成为一个可以保
 * 存多个元素的集合，就像数组一样。
 */
public interface Aggregate {
    public abstract Iterator iterator();
}
