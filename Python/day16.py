def max_sum(arr,k):
    summ=0
    for i in range(k):
        summ+=arr[i]
    max_sum=summ
    j=0
    l=k-1
    while(l<len(arr)-1):
        summ=summ+arr[l+1]-arr[j]
        max_sum=max(max_sum,summ)
        j+=1
        l+=1
    return max_sum
a=list(map(int,input().split()))
k=int(input())
print(max_sum(a,k))


