import textwrap

s = input()
w = int(input())
list = textwrap.wrap(s, w)

for line in list:
    print(line)
