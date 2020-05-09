package datastructures

import org.junit.Assert.assertEquals
import org.junit.Test

class DynamicArrayTest {

  @Test def testEmptyArray(): Unit = {
    val d1 = new DynamicArray[String]
    assertEquals(d1.getSize, 0)
  }


  @Test def testResizing(): Unit = {
    val dArray = new DynamicArray[String]
    dArray.put("hello")
    assertEquals(dArray.getSize, 1)
    dArray.put("hello")
    dArray.put("hello")
    dArray.put("hello")
    dArray.put("hello")
    assertEquals(dArray.getSize, 5)

  }

}
