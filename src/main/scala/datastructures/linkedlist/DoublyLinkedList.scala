package datastructures.linkedlist

class DoublyLinkedList[T](var head: NodeD[T] = null) {

  private var length: Int = if (head == null) 0 else 1

  def add(element: T): Unit = {
    var newNode: NodeD[T] = new NodeD[T](value = element, null, null)
    if (this.head == null){
      this.head = newNode
    } else {
      newNode.next = this.head
      this.head.prev = newNode
      this.head = newNode
    }
    length  += 1
  }

  def delete: Unit = {
    this.head = this.head.next
    length -= 1
  }

  def getSize: Int = length

}
