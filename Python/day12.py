#Print first duplicate number
a=list(map(int,input("Enter list of numbers:").split()))
b={}
for i in a:
    if i in b:
        print(i)
        break
    else:
        b[i]=1