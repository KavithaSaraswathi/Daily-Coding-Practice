#Rotate left by k elements
a=list(map(int,input("Enter elements of the list: ").split()))
b=int(input("Enter k value to rotate: "))
for i in range(b):
    x=a[len(a)-1]
    for j in range(len(a)-1,0,-1):
        a[j]=a[j-1]
    a[0]=x
print(a)
