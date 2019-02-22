Description:
We found this file and could not make a sense out of it. One of our lead analyst stated that it could contains a user name and password in it. Can you help us identify it?

Note: Add xiomara{} tags before submitting the flag. And her flag is in the form xiomara{Username:Password}

Solution:

In this we have been given a java class file.You can see the file [HERE](/Rev/Login/Login.class).

I decompiled the .class file to java file using this [website](http://www.javadecompilers.com/).You can see the decompiled file [Here](/Rev/Login/Login.java).

I just added 2 command in the code to reveal Username and password :
	
	System.out.println("Username"+"	"+str3);
	System.out.println("Password"+"	"+str4);


It revealed the Username and password :

	Username	:	USER 
	password 	:	TEST

I got the flag which was specified in the description :
	
	xiomara{USER:TEST}


