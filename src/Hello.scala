class Hello {

}

object Hello{

  def sys(): Unit ={
    print("This is aa !")
  }

  def main(args: Array[String]) {
    val x = fuc(2)
    print(x)
  }

  def fuc(n : Int){
    var r = 1
    for(i <- 1 to n)
      r = r + i
    r
  }
}


