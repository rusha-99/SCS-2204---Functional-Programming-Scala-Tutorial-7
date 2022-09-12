class BankAccount(id:String,n:Int,b:Double){

  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  def withdraw(n:Double){
    this.balance=this.balance-n
  }

  def deposit(n:Double){
    this.balance=this.balance+n
  }

  def transfer(acc:BankAccount,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+ID+":"+accountnumber+":"+balance+"]"


}

object Q3 extends App {
  val account1= new BankAccount("Tharusha",22275,10500.00)
  val account2= new BankAccount("Ruwin",32478,5700.00)

  account1.transfer(account2,3700.00)
  println("Balances After money transfer")
  println(account1)
  println(account2)
}