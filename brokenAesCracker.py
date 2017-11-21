#decodeMessage
from Crypto.Cipher import AES
import base64
import itertools
iv = '2jpmLoSsOlQrqyqE'



decode = bytes('MmpwbUxvU3NPbFFycXlxRRPMjv3uJK8MPKC5XRpgRKU=', 'utf-8')

hexed=base64.b64decode(decode)
#32 6a 70 6d 4c 6f 53 73 4f 6c 51 72 71 79 71 45 13 cc 8e fd ee 24 af 0c 3c a0 b9 5d 1a 60 44 a5
#32 6a 70 6d 4c 6f 53 73 4f 6c 51 72 71 79 71 45

message=hexed[16:]

print(message)

#ret = crypto.decrypto(iv,message)
itert=[]
r = 16
for i in range(0,127):
    itert.append(chr(i))

checkAgainst = itertools.permutations(itert, r)
for i in checkAgainst:
    temp=''
    for j in i:
        temp=temp+j
    if(len(temp)==16):
        #print(i)
        aes=AES.new(temp,AES.MODE_CBC,iv)
        ret=aes.decrypt(message)
        #print(len(ret))
        #ret=unpad(ret)
        if(ret=="Welcome!!"):
            print(i)
            break
