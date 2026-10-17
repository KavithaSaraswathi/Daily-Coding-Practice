transactions = [1500, -500, 2000, -300, -700, 1000, 500]
deposit=0
withdraw=0
balance=0
depoCount=0
withCount=0
large=0
for i in transactions:
    if i>0:
        deposit+=i
        depoCount+=1
    elif i<0:
        withdraw+=i
        withCount+=1
        if(large<abs(i)):
            large=abs(i)
    balance+=i
print("Total deposit: ",deposit)
print("Total withdrawals: ",abs(withdraw))
print("Net balance: ",balance)
print("Number of deposits: ",depoCount)
print("Number of withdrawals: ",withCount)
print("Largest withdrawal: ",abs(large))

