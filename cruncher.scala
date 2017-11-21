
def main():Unit={
var bM=Array("James",
"John",
"Robert",
"Michael",
"William",
"David",
"Joseph",
"Richard",
"Charles",
"Thomas",
"Christopher",
"Daniel",
"Matthew",
"George",
"Anthony",
"Donald",
"Paul",
"Mark",
"Edward",
"Steven",
"Kenneth",
"Andrew",
"Joshua",
"Brian",
"Kevin",
"Ronald",
"Timothy",
"Jason",
"Jeffrey",
"Ryan"
)

var b1880=Array("John",
"William",
"James",
"Charles",
"George",
"Frank",
"Joseph",
"Thomas",
"Henry",
"Robert",
"Edward",
"Harry",
"Walter",
"Arthur",
"Fred",
"Albert",
"Samuel",
"David",
"Louis",
"Joe",
"Charlie",
"Clarence",
"Richard",
"Andrew",
"Daniel",
"Ernest",
"Will",
"Jesse",
"Oscar",
"Lewis"
)
var b1925=Array(
"Robert",
"John",
"William",
"James",
"Charles",
"George",
"Joseph",
"Richard",
"Edward",
"Donald",
"Thomas",
"Frank",
"Paul",
"Harold",
"Raymond",
"Walter",
"Jack",
"Henry",
"Kenneth",
"Arthur",
"Albert",
"David",
"Harry",
"Eugene",
"Ralph",
"Howard",
"Willie",
"Carl",
"Louis",
"Clarence"
)
var b1970=Array(
"Michael",
"James",
"David",
"John",
"Robert",
"Christopher",
"William",
"Brian",
"Mark",
"Richard",
"Jeffrey",
"Scott",
"Jason",
"Kevin",
"Steven",
"Joseph",
"Thomas",
"Eric",
"Daniel",
"Timothy",
"Charles",
"Anthony",
"Paul",
"Matthew",
"Kenneth",
"Gregory",
"Stephen",
"Todd",
"Ronald",
"Donald"
)
var b2015=Array(
"Noah",
"Liam",
"Mason",
"Jacob",
"William",
"Ethan",
"James",
"Alexander",
"Michael",
"Benjamin",
"Elijah",
"Daniel",
"Aiden",
"Logan",
"Matthew",
"Lucas",
"Jackson",
"David",
"Oliver",
"Jayden",
"Joseph",
"Gabriel",
"Samuel",
"Carter",
"Anthony",
"John",
"Dylan",
"Luke",
"Henry",
"Andrew"
)


var gM=Array("Mary",
"Elizabeth",
"Patricia",
"Jennifer",
"Linda",
"Barbara",
"Margaret",
"Susan",
"Dorothy",
"Sarah",
"Jessica",
"Helen",
"Nancy",
"Betty",
"Karen",
"Lisa",
"Anna",
"Sandra",
"Ashley",
"Kimberly",
"Donna",
"Ruth",
"Emily",
"Carol",
"Michelle",
"Laura",
"Amanda",
"Melissa",
"Rebecca",
"Deborah"
)
var g1880=Array("Mary",
"Anna",
"Emma",
"Elizabeth",
"Minnie",
"Margaret",
"Ida",
"Alice",
"Bertha",
"Sarah",
"Annie",
"Clara",
"Ella",
"Florence",
"Cora",
"Martha",
"Laura",
"Nellie",
"Grace",
"Carrie",
"Maude",
"Mabel",
"Bessie",
"Jennie",
"Gertrude",
"Julia",
"Hattie",
"Edith",
"Mattie",
"Rose")
var g1925=Array("Mary",
"Dorothy",
"Betty",
"Helen",
"Margaret",
"Ruth",
"Virginia",
"Doris",
"Mildred",
"Elizabeth",
"Frances",
"Evelyn",
"Anna",
"Jean",
"Alice",
"Marie",
"Shirley",
"Lois",
"Irene",
"Gloria",
"Marjorie",
"Barbara",
"Martha",
"Florence",
"Lillian",
"Rose",
"Louise",
"Patricia",
"Catherine",
"Ruby"
)
var g1970=Array("Jennifer",
"Lisa",
"Kimberly",
"Michelle",
"Amy",
"Angela",
"Melissa",
"Tammy",
"Mary",
"Tracy",
"Julie",
"Karen",
"Laura",
"Christine",
"Susan",
"Dawn",
"Stephanie",
"Elizabeth",
"Heather",
"Kelly",
"Tina",
"Shannon",
"Lori",
"Patricia",
"Cynthia",
"Pamela",
"Sandra",
"Wendy",
"Rebecca",
"Nicole"
)
var g2015=Array("Emma",
"Olivia",
"Sophia",
"Ava",
"Isabella",
"Mia",
"Abigail",
"Emily",
"Charlotte",
"Harper",
"Madison",
"Amelia",
"Elizabeth",
"Sofia",
"Evelyn",
"Avery",
"Chloe",
"Ella",
"Grace",
"Victoria",
"Aubrey",
"Scarlett",
"Zoey",
"Addison",
"Lily",
"Lillian",
"Natalie",
"Hannah",
"Aria",
"Layla"
)
var cM=Array("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","aa","bb","cc","dd")
var c1880=Array("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","aa","bb","cc","dd")
var c1925=Array("a","b","c","d","e","","","","","","","","","","","","","","","","","","","","","","","","","")
var c1970=Array("a","b","c","","","","","","","","","","","","","","","","","","","","","","","","","","","")
var c2015=Array("a","","","","","","","","","","","","","","","","","","","","","","","","","","","","","")
var retB=Array(0.0,0.0,0.0,0.0)
var retG=Array(0.0,0.0,0.0,0.0)
var retC=Array(0.0,0.0,0.0,0.0)
var iterB=Array(b1880,b1925,b1970,b2015)
var iterG=Array(g1880,g1925,g1970,g2015)
var iterC=Array(c1880,c1925,c1970,c2015)
for(i<-bM){
  for(k<-0 to 3){
    for(j<-0 to 29){
        if(iterB(k)(j)==i){
          retB(k)=retB(k)+(1.0/30)
          print(k+i+" ")
        }
      }
    }
  }
  for(i<-gM){
    //print(i+" ")
    for(k<-0 to 3){
      for(j<-0 to 29){
          if(iterG(k)(j)==i){
            retG(k)=retG(k)+(1.0/30)
            print(k+i+" ")
          }
        }
      }
    }
    for(i<-cM){
      for(k<-0 to 3){
        for(j<-0 to 29){
            if(iterC(k)(j)==i){
              retC(k)=retC(k)+(1.0/30)

            }
          }
        }
      }
      print("retB\n")
    for(i<-0 to 3){
    print(retB(i)+"\n")
  }
  print("retG\n")
  for(i<-0 to 3){
  print(retG(i)+"\n")
}
print("retC\n")
for(i<-0 to 3){
print(retC(i)+"\n")
}
}
