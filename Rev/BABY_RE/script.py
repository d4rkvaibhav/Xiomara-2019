FLAG = [171, 89, 80, 83, 57, 229, 28, 232, 53, 28, 17, 161, 32, 15, 172, 202, 227, 22, 5, 237, 240, 178, 203, 218, 206, 160, 74, 163, 189, 161, 172, 90, 67, 168, 176, 180, 100, 11, 84]
I=9
KEY = '*************Welcome To Anokha CTF!!**********'
for i in range(len(FLAG)):
	for j in range(256):
		if(((j + I ^ ord(KEY[I])) % 255)==FLAG[i]):
			print(chr(j),end="")
			break
	I = (I + 1) % len(KEY)

print()

