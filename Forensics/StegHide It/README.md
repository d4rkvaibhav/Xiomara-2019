Description:

While going through bash history of one of our developers account, we found that "steghide" was used to hide something inside an image. We have tried all possible password combinations but no luck. I hope you could help us.

Problem points : 50

Solution:

By challenge name we know that steghide is used but we don't know the password so i we stegcracker which you can find here:
	
	https://github.com/Paradoxis/StegCracker

After runnning the command to crack the password using Stegcracker and rockyou.txt
	
	./stegcracker stego.jpg rockyou.txt

I got the password:
	
	xiomara

now using the steghide i got the flag :

	xiomara{SteGhide_is_For_Beginnners_1024!!!}
