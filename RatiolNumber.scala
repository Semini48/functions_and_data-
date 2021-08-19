object MyApp{


    class Rational(n:Int, d:Int)
    {

        require(d>0,"d must be grater than 0")

        val numer = n/gcd(Math.abs(n),d)
        val denom = d/gcd(Math.abs(n),d)
        def this(n:Int)=this(n,1)

        private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)


        def +(r:Rational) = new Rational(this.numer*r.denom+this.denom*r.numer,
        this.denom*r.denom)
// NEG METHOD
        def neg=new Rational(-this.numer,this.denom)

// SUB METHOD

        def -(r:Rational)=this + r.neg

        override def toString = numer+"/"+denom
    }



    def main(args:Array[String])
    {
        val r1 = new Rational(5);
        val r2 = new Rational(6,9);
        val r3 = r2 - r1;
 

        println("\n\n NEGATIVE OF "+r1+" : "+r1.neg);
        println("\n\n SUBTRACTION OF "+r2+" and " +r1+ " : " +r3);
        println("\n")
        
    }

}





