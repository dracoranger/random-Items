#sha256 decoder
import hashlib
import itertools

appended = 'jswcDT4zQN0aoqUf'
output = '00992b6b7609658aedeaf1962baa69694f8412018cae578c97410c98f931e9e4'
r = 4 #length of the thing to be checked
itert = []
#SHA256(XXXX+jswcDT4zQN0aoqUf) == 00992b6b7609658aedeaf1962baa69694f8412018cae578c97410c98f931e9e4
#for i in range(32, 126):
#    itert.append(chr(i))

for i in range(48, 58):
    itert.append(chr(i))

for i in range(65, 91):
    itert.append(chr(i))

for i in range(97, 123):
    itert.append(chr(i))

print(itert)

checkAgainst = itertools.permutations(itert, r)

for i in checkAgainst:
    temp=''
    for j in i:
        temp=temp+j
    string= temp+appended
    byte= bytes(string, 'utf-8')
    check=hashlib.sha256(byte).hexdigest()
    if(check==output):
        print(i)
        break
