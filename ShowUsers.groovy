//GetUsersFromDB.groovy

import User
import java.io.*;
import UserDAO
UserDAO userdao=new UserDAO()
 
beans=(ArrayList)userdao.list()
s=""
if(beans.size()>0)
beans.each{s+= "<tr><td>${it.username}</td><td>${it.password}</td><td>${it.age}</td><td>${it.email}</td></tr>"}


FileWriter fstream = new FileWriter("C:/Users/Ryan/out.html");
BufferedWriter out = new BufferedWriter(fstream);

//Close the output stream


out.write("""
<html><head>
<title>show users </title>
</head>
<body>
<table border="2">
<tr><td>Name</td><td>Password</td><td>Age</td><td>Email</td></tr>
${s}
</table>
</body>
</html>
""");

out.close();