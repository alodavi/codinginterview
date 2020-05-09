package datastructures.linkedlist

class SinglyLinkedList[T](var head: Node[T] = null) {

  private var length = if (head ==null) 0 else 1

  def add(value: T): Unit = {
    var newNode: Node[T] = new Node[T](value, null)
    if (head == null) {
      this.head = newNode
    } else {
      newNode.next = this.head
      this.head = newNode
    }
    length += 1
  }

  def delete: Unit = {
    this.head = this.head.next
    length -= 1
  }

  def getSize: Int = length


}
