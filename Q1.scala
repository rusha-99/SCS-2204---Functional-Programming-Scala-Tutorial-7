class Rational(x: Int, y: Int) {

  require(denom > 0, "Denominator must be greater than 0");
  def numer = x;
  def denom = y;

  def neg = new Rational(-this.numer, this.denom);

  override def toString = numer + "/" + denom;
}

object Q1 {
    def main(args: Array[String]) {
    val x = new Rational(1, 2);
    val y = new Rational(2, 3);

    println(x.neg);
    println(y.neg);

  }
}