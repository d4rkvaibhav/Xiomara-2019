We were given with a ciphered text:

	USdgZV85XDd+NXh3bUg2T04zQzEqQVotOSUqIzVSdXRye04hLUN8PClda2pMaGE0SHgxYnVDc3hxcCl0c19UXW9bTX5OXUlIR0xLRGhIR1pkREMyMVR4WFcsVVRAcSdQPDtAPzhcPHw6M0oxNjU0MzIrQi8uJyYlJFUiIX4lJHtOIWt9fGg7bGtqTEthNHlHY2JhdC1yd3ZvKFZfXnBcImBPS3xcPj1GakpDOEFGWVhiQlUwU1JXUHRUUyhRUE9OQDldPX01TDNsNzBHaDMsMTApLidYKyojKCd+UXIjIiF+fWk8bWxrTWNiZ3ozZGNiREN5eHEqWFdgcnFwXFsheQ==

On observing one can easily detect it is base64 so i deoded it in base64:

	Q'`e_9\7~5xwmH6ON3C1*AZ-9%*#5Rutr{N!-C|<)]kjLha4Hx1buCsxqp)ts_T]o[M~N]IHGLKDhHGZdDC21TxXW,UT@q'P<;@?8\<|:3J165432+B/.'&%$U"!~%${N!k}|h;lkjLKa4yGcbat-rwvo(V_^p\"`OK|\>=FjJC8AFYXbBU0SRWPtTS(QPON@9]=}5L3l70Gh3,10).'X+*#('~Qr#"!~}i<mlkMcbgz3dcbDCyxq*XW`rqp\[!y

Since the name of problem Esoteric programming and the cipher text file name was [benolmstead](/Crypto/benolmstead.txt) i searched for both and i directed me to Malbolge Language.

So i used this [website](https://zb3.me/malbolge-tools/#interpreter) to decode the above language but i got syntax error(INVALID CHARACTER).So i tried some code like Hello world ,flag to check the valid starting character.

After doing this i saw that many of them started with D' but my code starts with Q' so i just checked for rot13 and i was successful!! 

The rot13 converted text was :

	D'`r_9\7~5kjzU6BA3P1*NM-9%*#5Ehge{A!-P|<)]xwYun4Uk1ohPfkdc)gf_G]b[Z~A]VUTYXQuUTMqQP21GkKJ,HG@d'C<;@?8\<|:3W165432+O/.'&%$H"!~%${A!x}|u;yxwYXn4lTpong-ejib(I_^c\"`BX|\>=SwWP8NSLKoOH0FEJCgGF(DCBA@9]=}5Y3y70Tu3,10).'K+*#('~De#"!~}v<zyxZpotm3qpoQPlkd*KJ`edc\[!l

Now i ran program which resulted :

	Mlab0lge_Is_verY_Simple_for_you

So the flag is :

	xiomara{Mlab0lge_Is_verY_Simple_for_you}



	


