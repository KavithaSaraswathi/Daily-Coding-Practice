a=list(map(int,input("Enter list of number :").split()))
b={}
for i in a:
    if i in b:
        b[i]+=1
    else:
        b[i]=1
for k,v in b.items():
    if v==1:
        print(f"The first non-repeative number is {k}")
        break