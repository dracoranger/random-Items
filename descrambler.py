inp = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*("
out = "agmsy4!&bfhlnrtxz359@^*ceikoquw0268#%(djpv17$"

cipher="Yl 410b8ofasa503ea70f6au gi2cef36d5492r 3d74b"

a=[]
b=[]
c=[]

for i in inp:
    a.append(i)

for j in out:
    b.append(j)

for i in a:
    for j in range(0,len(b)):
        if i == b[j]:
            c.append(j)

print(c)
output=[]

for i in range(0,len(cipher)):
    output.append('')

j=0
ret=''
for i in c:
    output[j]=cipher[i]
    j = j+1

for i in output:
    ret=ret+i
print(ret)
