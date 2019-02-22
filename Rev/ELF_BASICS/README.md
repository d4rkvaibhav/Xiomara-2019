Desciption:

After analysing the server we found an executable. We suspect this executable may be a part of attack. Help us to identify the same.

Points	:	25

Solutiion:

For this question we have to give correct flag.
I used ltrace command to check which is is compared to the my input and the output was :

	puts("Welcome To Anokha 2k19 Please En"...Welcome To Anokha 2k19 Please Enter the flag !
	)      = 47
	malloc(18)                                       = 0x56119f3df420
	memset(0x56119f3df420, '\0', 18)                 = 0x56119f3df420
	fgets(hellllo
	"hellllo\n", 18, 0x7fecbae9a8e0)           = 0x56119f3df420
	strcmp("hellllo\n", "jnhFClg2sv3uaBBxs")         = -2
	printf("\nPsst Wrong Try Again "
	)                = 22
	free(0x56119f3df420)                             = <void>
	Psst Wrong Try Again +++ exited (status 0) +++

So we can see "jnhFClg2sv3uaBBxs" is compared to input.

Now i entered "jnhFClg2sv3uaBBxs" in input and got the flag:
	
	xiomara{jnhFClg2sv3uaBBxs}
