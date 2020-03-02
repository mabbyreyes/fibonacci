package edu.cnm.deepdive;

import java.math.BigInteger;
import java.util.Iterator;

public class Fibonacci implements Iterable<BigInteger> {

//  public static BigInteger fibonacci(int n) {
//    BigInteger prev = BigInteger.valueOf(-1);
//    BigInteger curr = BigInteger.ONE;
//    for (int i = 0; i <= n; i++) {
//      BigInteger temp = prev.add(curr);
//      prev = curr;
//      curr = temp;
//    }
//    return curr;
//  }

  private final int length;

  public Fibonacci(int length) {
    this.length = length;
  }

  @Override
  public Iterator<BigInteger> iterator() {
    return new FibIterator();
  }

  private class FibIterator implements Iterator<BigInteger> {

    private int count = 0;
    private BigInteger prev = BigInteger.valueOf(-1);
    private BigInteger curr = BigInteger.ONE;

    @Override
    public boolean hasNext() {
      return count < length;
    }

    @Override
    public BigInteger next() {
      BigInteger temp = prev.add(curr);
      prev = curr;
      curr = temp;
      count++;
      return curr;
    }

  }

}
