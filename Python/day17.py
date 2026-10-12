def min_subarray_len(x,y):
    left=0
    min_length=float("inf")
    window_sum=0
    for right in range(len(x)):
        window_sum=window_sum+x[right]
        while window_sum>=y:
            length=right-left+1
            min_length=min(length,min_length)
            window_sum-=x[left]
            left+=1
    return 0 if min_length == float("inf") else min_length


a=list(map(int,input().split()))
b=int(input())
print(min_subarray_len(a,b))

