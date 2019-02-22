Description:

This web server has been behaving weirdly. Might be a hacker left something there.
IP: http://34.73.70.190/

Solution:

After running the website i was directed to a page where a button linked with the flag page was there.So i clicked the button but the page was not found.I again checked the source code and found something wrong in the linked webpage name it was linked as follows:

	      <a href="/can_y#u_get_the_flag?!" class="corb-big-ass-button btn btn-lg btn-success">Get the flag!</a>

When i clicked the button the symbols and spaced was not converting into URL encoding format.So i converted it into url Encoding using this [website](https://www.urlencoder.org/)

After encoding the full link was :

	http://34.73.70.190/can_y%23u_get_the_flag%3F%21

Running this link resulted into flag:
	
	xiomara{URi_Syn7@x_1s_@_g00D_thing_t0_lOOk_@t}
