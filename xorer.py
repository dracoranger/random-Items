#xorer
#By Draco Ranger

import binascii

def generateBinary(inpu):
    temp=inpu
    ret=["0","0","0","0","0","0","0","0"]
    if temp-128>=0:
        ret[0]="1"
        temp=temp-128
    if temp-64>=0:
        ret[1]="1"
        temp=temp-64
    if temp-32>=0:
        ret[2]="1"
        temp=temp-32
    if temp-16>=0:
        ret[3]="1"
        temp=temp-16
    if temp-8>=0:
        ret[4]="1"
        temp=temp-8
    if temp-4>=0:
        ret[5]="1"
        temp=temp-4
    if temp-2>=0:
        ret[6]="1"
        temp=temp-2
    if temp-1>=0:
        ret[7]="1"
        temp=temp-1
    return ret
a="0000000101110001000101100011100100110110001010100111000100011101011101100010110000110001001101010111000100110000000111010111000000011101011100110010101100100100001001110001110100110110001010100010011100011101001101110010110000101011001101000010011100110000011001100111000100011101001000110010110000100110000111010010011100110100011100010011000000111011001101100010101000101011001011000010010100111111"
b= ["0","1","0","0","0","0","1","0"]
d= ["0","1","0","1","0","1","0","0"]
c="1101010111010101"
ret=""
counter=1
for j in range(0,255):
    b= generateBinary(j)
    print("\n"+str(b)+"\n")
    for i in a:
        if b[0] == i:
            ret=ret+"0"
        else:
            ret=ret+"1"
        b.append(b[0])
        del b[0]
        #if counter%8==0:
        #    ret=ret+" "
        counter=counter+1
    #ret=int(ret,2)
    #re=ret.to_bytes((ret.bit_length() + 7) // 8, 'big').decode('utf-8', 'surrogatepass') or '\0'
    print(ret)
    ret=""
