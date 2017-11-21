//Subnet generator
//By Draco Ranger
import java.io._

def main(){
  val pw = new PrintWriter(new File("output.txt"))
  var subNum= io.Source.fromFile("input.txt")
  var locl=294
  var continue=true
  var ret=""
  var curr=""
    for (i <- subNum.getLines){
      //print(locl)
      //print(i)
      if(locl.toString!=i){
        curr+=i
        //print(curr)
        //curr.split('\n').map(_.trim.filter(_ >= ' ')).mkString
      }
      else{
        if (curr !="") ret+=curr+"\n"
        curr=""
        locl+=1
      }
    }
  pw.write(ret)
  pw.close
  print("Success!")
}
