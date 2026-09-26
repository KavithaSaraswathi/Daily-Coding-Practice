a=list(map(int,input("Enter list elements : ").split()))
b=a[0]
c=a[0]
for i in a:
    if c<i:
        b,c=c,i
    elif(i>b and i!=c):
        b=i
print("Second largest number is ",b)
