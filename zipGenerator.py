#zipgenerator

numb1=0
numb10=0
name="ra"
end=".txt"

inpu= open("C:\\Users\\T\\Desktop\\ra00.txt")
temp=""
for i in inpu:
    temp= temp+i

temp=temp*16

for i in range(0, 10):
    nam=name+str(numb10)+str(numb1)+end
    file=open(nam,"w+")
    temp=temp
    file.write(temp)
    file.close
    numb1=numb1+1
    if numb1==10:
        numb1=0
        numb10=numb10+1
