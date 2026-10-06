#Armstrong numbers in range
a,b=map(int,input("Enter two numbers:").split())
print("The armstrong number in the given range are:")
for i in range(a,b+1):
    temp=i
    count=len(str(i))
    summ=0
    while (temp!=0):
        digit=temp%10
        summ+=digit**count
        temp//=10
    if(summ==i):
        print(i)
