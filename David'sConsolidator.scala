//Consolidator
//By Draco Ranger
import java.io._
import scala.collection.mutable.Stack
import scala.collection.immutable.List

def main(){
  val pw = new PrintWriter(new File("output.csv"))
  val station=io.Source.fromFile("station.csv")
  val county= io.Source.fromFile("county.csv")

  var irritated=""
  var stor=new Stack[String]()
  for(i<-station){
    irritated+=i
    if(i=='\n'){
      stor.push(irritated)
      irritated=""
    }
  }
  var ret=""
  var count=List("n3x2v, , , , , , , , ,")
  for(i<-county.getLines){
    count=i::count
  }

    while(!stor.isEmpty){
      var temp=stor.pop
      val first= temp.indexOf(",")
      val check=temp.substring(0,first)
      var isGood=false
        for(j<-count){
          val second= j.indexOf(",")
          val checked=j.substring(0,second)
          print(check+" ")
          print(checked+"\n ")
          if(check==checked){
            isGood=true
          }
        }
      if(isGood){
        ret=ret+temp
      }
    }
  pw.write(ret)
  pw.close
  print("Success!")
}
