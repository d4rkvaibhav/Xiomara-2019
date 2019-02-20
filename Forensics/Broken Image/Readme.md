Description :

One of our server contained photographs of all the employees, hackers managed to modify the image corresponding to the CEO's. We have been trying to open it since, but failed.

Orignal file : CEO
decrypted flg file : decrypted.jfif

Problem points : 75

The headers of the file using hexedit showed the following :

	commmand :	hexedit CEO

	AA D8 AA E0  00 10 00 46  49 46 00 01  01 01 00 78  .......FIF.....x
	00 78 00 00  FF DB 00 43  00 02 01 01  02 01 01 02  .x.....C........

We can clearly see tha someone played with the file signature of the file.
File signature of a normal JFIF file is :
	
	FF D8 FF E0 xx xx 4A 46 49 46 00

So changing the headers resulted a JFIF image haing flag in it.
The corrected file signature was :

	FF D8 FF E0  00 10 4A 46  49 46 00 01  01 01 00 78  ......JFIF.....x
	00 78 00 00  FF DB 00 43  00 02 01 01  02 01 01 02  .x.....C........

Flag :	

	xiomara{7h1s_1s_w4y_2_34sy}
