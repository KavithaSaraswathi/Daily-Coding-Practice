a=[23,43,54,74,12]
maxxi=a[0]
maxxi2=a[0]
for i in a:
    if i>maxxi:
        maxxi,maxxi2=i,maxxi
print(maxxi2)