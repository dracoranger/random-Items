stor=[2,3]
test=5
num=1
while num>0:
    good=0
    for i in stor:
        if test%i==0:
            good=1
    if good==0:
        stor.append(test)
        if(140520586682340023%test==0):
            print(test)
            num = -1
    test+=2
