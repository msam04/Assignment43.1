package Assignment43_T1

object Assignment43_T1 {
  def main(args: Array[String]): Unit = {
    val numbers: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    val sum = numbers.reduce(_ + _)
    println("Sum: " + sum)
    println("Total number of elements: " + numbers.length)
    println("Average of elements: " + sum / numbers.length)
    var even_numbers = numbers.filter(x => x % 2 == 0)
    println("Even numbers in list: " + even_numbers)
    var sum_even = even_numbers.reduce(_+_)
    println("Average of even numbers in list: " + sum_even/even_numbers.length)
    val list2 = numbers.filter(i => i % 3 == 0 && i % 5 == 0)
    println("Numbers divisible by 3 and 5: " + list2)
    
  }
}