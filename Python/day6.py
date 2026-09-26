a=list(map(int,input("Enter elements of a list :").split()))
b=[]
for i in a:
    if i not in b:
        b.append(i)
print("Liat after removing duplicate values:",b)