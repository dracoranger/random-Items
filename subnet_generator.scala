//Subnet generator
//By Draco Ranger
import java.io._
def main(){
  val pw = new PrintWriter(new File("subnet.txt" ))
  var subNum=1
  var network="10.82.50."
  var locl=0
  var continue=true
  var ret=""
  while (continue){
    println("Input subnet size, negatives to quit")
    var size=scala.io.StdIn.readInt()
    val net=scala.math.pow(2,32-size).toInt

    if(size>0){
      ret+=network+locl+",/"+size+",255.255.255."+(256-net).toString+","
      ret+=network+(locl+1).toString+"-"+network+(locl+net-2).toString+","
      ret+=network+(locl+net-1).toString+"\n"
    }
    else continue=false
    locl+=net
    print(ret)
  }
  pw.write(ret)
  pw.close
}
