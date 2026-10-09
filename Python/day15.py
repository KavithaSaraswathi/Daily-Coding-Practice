def is_perfect(a):
    summ=0
    for i in range(1,a):
        if a%i==0:
            summ+=i
    if summ==a:
        return True
    else:
        return False

x=int(input("Enter start: "))
y=int(input("Enter end: "))
for i in range(x,y+1):
    if is_perfect(i):
        print(i)
