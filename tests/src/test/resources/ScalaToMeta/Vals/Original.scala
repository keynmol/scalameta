object Vals {
  val List() = List()
  var List() = List()
  implicit val List() = List()
  implicit lazy val List() = List()
  val x1a = List(1)
  val x1b: List[Int] = List(1)
  var x2a = List(2)
  var x2b: List[Int] = List(2)
  implicit val x3a = List(3)
  implicit val x3b: List[Int] = List(3)
  implicit lazy val x4a = List(4)
  implicit lazy val x4b: List[Int] = List(4)
  val List(x5) = List(5)
  var List(x6) = List(6)
  implicit val List(x7) = List(7)
  implicit lazy val List(x8) = List(8)
  val List(x9, y9) = List(9, 10)
  var List(x10, y10) = List(11, 12)
  implicit val List(x11, y11) = List(13, 14)
  implicit lazy val List(x12, y12) = List(15, 16)
  val List(x13, y13): List[Int] = List(17, 18)
  var List(x14, y14): List[Int] = List(19, 20)
  implicit val List(x15, y15): List[Int] = List(21, 22)
  implicit lazy val List(x16, y17): List[Int] = List(23, 24)
  locally {
    val List() = List()
    var List() = List()
    implicit val List() = List()
    implicit lazy val List() = List()
    val x1 = List(1)
    var x2 = List(2)
    implicit val x3 = List(3)
    implicit lazy val x4 = List(4)
    val List(x5) = List(5)
    var List(x6) = List(6)
    implicit val List(x7) = List(7)
    implicit lazy val List(x8) = List(8)
    val List(x9, y9) = List(9, 10)
    var List(x10, y10) = List(11, 12)
    implicit val List(x11, y11) = List(13, 14)
    implicit lazy val List(x12, y12) = List(15, 16)
    val List(x13, y13): List[Int] = List(17, 18)
    var List(x14, y14): List[Int] = List(19, 20)
    implicit val List(x15, y15): List[Int] = List(21, 22)
    implicit lazy val List(x16, y17): List[Int] = List(23, 24)
  }
  trait Trait1 {
    val List() = List()
    var List() = List()
    implicit val List() = List()
    implicit lazy val List() = List()
    val x1 = List(1)
    var x2 = List(2)
    implicit val x3 = List(3)
    implicit lazy val x4 = List(4)
    val List(x5) = List(5)
    var List(x6) = List(6)
    implicit val List(x7) = List(7)
    implicit lazy val List(x8) = List(8)
    val List(x9, y9) = List(9, 10)
    var List(x10, y10) = List(11, 12)
    implicit val List(x11, y11) = List(13, 14)
    implicit lazy val List(x12, y12) = List(15, 16)
    val List(x13, y13): List[Int] = List(17, 18)
    var List(x14, y14): List[Int] = List(19, 20)
    implicit val List(x15, y15): List[Int] = List(21, 22)
    implicit lazy val List(x16, y17): List[Int] = List(23, 24)
  }
  trait Trait2 {
    val x1: Int
    var x2: Int
  }
  trait Trait3 {
    protected[this] val x: Int
    private lazy val y = x
  }
}
