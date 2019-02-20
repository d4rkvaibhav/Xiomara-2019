Description:

We managed to find this encrypted message, and believe that you can decrypt it dXFjeWFpYXtpMzdfYnZxX2NrZl95M28xYn0=

Points	:	50

Solution:

The encypted text seems to be base 64 so i decrypted the base64 to text which resulted

	uqcyaia{i37_bvq_ckf_y3o1b}

This is encypted with some other encryption.

I tried rot13 affine ciphers but didn't work so i tried Vignere cipher.

For Vignere cipher we need a key.Since i already solved a Forensics challenge named steghide-it i know the password of that file which i cracked was "xiomara".

So i tried to decrypt using the same key and luckily got the flag:

	xiomara{l37_the_ctf_b3g1n}
