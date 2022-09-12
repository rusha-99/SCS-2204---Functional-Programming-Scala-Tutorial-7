class Rational1(x: Int, y: Int) {
  require(denom > 0, "Denominator must be greater than 0");
  def numer = x;
  def denom = y;

  def sub(r: Rational1): Rational1 = {
    new Rational1((this.numer * r.denom) - (r.numer * this.denom), this.denom * r.denom);
  }
  override def toString = numer + "/" + denom;

}

object Q2 {
  def main(args: Array[String]) {
    val x = new Rational1(3, 4);
    val y = new Rational1(5, 8);
    val z = new Rational1(2, 7);

    println(x.sub(y).sub(z)); //x-y-z

  }
}