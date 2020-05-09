package datastructures

import scala.reflect.ClassTag

class DynamicArray[T]() {

  private var arr: Array[T] = _
  private var len = 0 // length user thinks array is
  private var capacity = 0 // Actual array size


  def getSize: Int = len
  def get(index: Int): T = arr(index)
  def put(element: T)(implicit m: ClassTag[T]): Unit = {
    ensureCapacity
    len += 1
    arr(len - 1) = element
  }

  def printArr(): Unit = {
    arr.foreach(println)
  }

  def ensureCapacity(implicit m: ClassTag[T]): Unit = {
    if (len + 1 >= capacity) {
      if (capacity == 0) capacity = 1
      else capacity *= 2 // double the size
      val new_arr = new Array[T](capacity)
      var i = 0
      while (i < len) {
        new_arr(i) = arr(i)
        i += 1
      }
      arr = new_arr // arr has extra nulls padded
    }


  }

}
