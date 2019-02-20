Description:

While going through bash history of one of our developers account, we found that "steghide" was used to hide something inside an image. We have tried all possible password combinations but no luck. I hope you could help us.

Problem points : 50

Solution:

By challenge name we know that steghide is used but we don't know the password so i we stegcracker which you can find here:

For stegcracker [click here](https://github.com/Paradoxis/StegCracker)

After runnning the command to crack the password using Stegcracker and rockyou.txt
	
	./stegcracker stego.jpg rockyou.txt

I got the password:
	
	StegCracker - (https://github.com/Paradoxis/StegCracker)
	Copyright (c) 2019 - Luke Paris (Paradoxis)

	Attacking file 'stego.jpg' with wordlist 'rockyou.txt'..
	Successfully cracked file with password: xiomara
	Your file has been written to: stego.jpg.out


now using the steghide i got the flag :

	xiomara{SteGhide_is_For_Beginnners_1024!!!}
