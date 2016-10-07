str = input()
target = input()

i = 0
times = 0

while i < len(str):
    index = str.find(target, i)
    if index != -1:
        times += 1
        i = index + 1
    else:
        break

print(times)
