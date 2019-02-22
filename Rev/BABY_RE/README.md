In this challenge We had a .pyc [file](Rev/BABY_RE/Baby_RE.pyc).Using [python-decompiler](https://python-decompiler.com/) i decompiled the given pyc file to python file.

The decompiled file result was :

	# Embedded file name: flag.py
	# Compiled at: 2019-01-04 17:32:56
	# Size of source mod 2**32: 528 bytes
	print('HELLO HACKER')
	password = input('Enter the Flag: ')
	KEY = '*************Welcome To Anokha CTF!!**********'
	I = 9
	FLAG = [171, 89, 80, 83, 57, 229, 28, 232, 53, 28, 17, 161, 32, 15, 172, 202, 227, 22, 5, 237, 240, 178, 203, 218, 206, 160, 74, 163, 189, 161, 172, 90, 67, 168, 176, 180, 100, 11, 84]
	FLAG_ = []
	for X in password:
	    FLAG_.append((ord(X) + I ^ ord(KEY[I])) % 255)
	    I = (I + 1) % len(KEY)

	if FLAG == FLAG_:
	    print('You Win')
	else:	
	    print('Try Again !')

I made a script to decode the flag you can found it [HERE](Rev/BABY_RE/script.py).

In the script i am basically brute forcing the value of X :

	for i in range(len(FLAG)):
	for j in range(256):
		if(((j + I ^ ord(KEY[I])) % 255)==FLAG[i]):

After running the script the flag revealed :
	
	xiomara{I_am_Just_Sitting_Here_H@Xor!!}


