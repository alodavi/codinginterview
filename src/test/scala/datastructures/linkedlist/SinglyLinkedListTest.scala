package datastructures.linkedlist

import org.junit.Assert.assertEquals
import org.junit.Test

class SinglyLinkedListTest {

  @Test def testEmptyList(): Unit = {
    val d1 = new SinglyLinkedList[String]()
    assertEquals(d1.getSize, 0)
  }

  @Test def testAdd(): Unit = {
    val d1 = new SinglyLinkedList[String]()

    d1.add("hello")
    d1.add("world")
    assertEquals(d1.head.value, "world")
    assertEquals(d1.getSize, 2)
  }


  @Test def testDelete(): Unit = {
    val d1 = new SinglyLinkedList[String]()

    d1.add("hello")
    d1.add("world")
    d1.delete
    assertEquals(d1.head.value, "hello")
    assertEquals(d1.getSize, 1)
  }

}
