object Account{
  def main(args:Array[String])
  {
        class account(id:String,n:Int,b:Double)
        {
            val nic:String=id 
            val acnumber: Int = n 
            var  balance: Double = b
        
            //TRANSFER MONEY
            def transfer(a:account,b:Double)=
            {
                this.balance=this.balance-b
                a.balance=a.balance+b
            }
            
        
            override def toString =   "["+nic+":"+acnumber +":"+ balance+"]"
        }


    val ac1=new account("986789052v",121,20000)
    val ac2=new account("962233457v",122,70000)
    val ac3=new account("714567899v",123,4000)
     
    val t=ac1.transfer(ac2,5000)
    print("\n");
    println("New balance of ac1 account: "+ac1.balance)
    println("New balance of ac2 account: "+ac2.balance)
    print("\n");
  }
}