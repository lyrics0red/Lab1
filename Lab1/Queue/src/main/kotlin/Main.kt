import java.lang.Exception
import java.lang.IndexOutOfBoundsException

class  Queue<T> {
    private var array: MutableList<T> = mutableListOf<T>()
    private var front = 0
    private var back = 0

    fun push(value: T) {
        array += value
        back++
    }

    fun pop(): T {
        if (front == back) {
            throw IndexOutOfBoundsException("Queue is empty.")
        }
        return array[front++]
    }

    fun size(): Int {
        return back - front
    }

    fun clear() {
        front = 0
        back = 0
        array.clear()
    }

    fun top(): T {
        if (front == back) {
            throw IndexOutOfBoundsException("Queue is empty.")
        }
        return array[front]
    }
}

fun main() {
    var a = Queue<Int>()
    a.push(1)
    println("Element pushed")
    println("Queue size = ${a.size()}")
    a.push(2)
    println("Element pushed")
    println("Queue size = ${a.size()}")
    println("Queue front = ${a.pop()}")
    println("First element removed")
    println("Queue size = ${a.size()}")
    println("Queue front = ${a.top()}")
    a.clear()
    println("Queue was cleared")
    println("Queue front = ${a.top()}")
}