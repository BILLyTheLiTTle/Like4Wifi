This application is a Java Servlet which works as a phising application to retrieve the Facebook accounts' credentials. It is created for demonstration purposes only and you should not use it for stealing people's credentials.

I don't know if I am going to improve it at the near future (I know the FB logo is not right) but as I said this app was written for demonstration purposes and of course for fun. It is written using Eclipse so you can modify it by yourself as you wish. Send me your commits if you want to, to merge them with the initial project!

I assure you that the whole experiment, was conducted using my Android phone and ONLY. Thanks Samsung for the powerful Note 3 device!!!

The steps to create your own executable:
1). Extract the Like4Wifi.war
2). Get the whole 'com' folder/package from 'classes' folder
3). dx the whole 'com' folder (./dx --dex  --output=com/facebook/like4wifi/Like4Wifi.dex com/facebook/like4wifi/Like4Wifi.class)
4). Remove original .class file
5). Rename .dex file to .class
6a). Create 'classes.zip' at 'WEB-INF/lib' folder
6b). The content of 'classes.zip' is 'META-INF' folder and its contents and also classes.dex (not the app_name.dex and without the folder/package tree)
7). Move 'classes.zip' to 'lib' folder.
9). Copy the 'Like4Wifi' folder into 'webapps' folder to the mobile.
10). Copy the other jetty libraries from WEB-INF/lib from the console folder at mobile - VOLUNTARILY

If you could not make this servlet run in the iJetty get the released zip from here (https://github.com/BILLyTheLiTTle/Like4Wifi/releases/download/v0.0.1/Like4Wifi.zip)

Please, do not use it against other people.

