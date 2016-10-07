str = list(input())
index, char = tuple(input().split(" "))

str[int(index)] = char
print("".join(str))
